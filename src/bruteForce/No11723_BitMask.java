package bruteForce;
/**
 * 
 * @author YGH
 * 
 * 문제
 * 비어있는 공집합 S가 주어졌을 때, 아래 연산을 수행하는 프로그램을 작성하시오.
 * add x: S에 x를 추가한다. (1 ≤ x ≤ 20) 
 * S에 x가 이미 있는 경우에는 연산을 무시한다.
 * remove x: S에서 x를 제거한다. (1 ≤ x ≤ 20) 
 * S에 x가 없는 경우에는 연산을 무시한다.
 * check x: S에 x가 있으면 1을, 없으면 0을 출력한다.
 * toggle x: S에 x가 있으면 x를 제거하고, 없으면 x를 추가한다. (1 ≤ x ≤ 20)
 * all: S를 {1, 2, ..., 20} 으로 바꾼다.
 * empty: S를 공집합으로 바꾼다. 
 * 
 * 입력
 * 첫째 줄에 수행해야 하는 연산의 수 M (1 ≤ M ≤ 3,000,000)이 주어진다.
 * 둘째 줄부터 M개의 줄에 수행해야 하는 연산이 한 줄에 하나씩 주어진다.
 * 
 * 출력
 * check 연산이 주어질때마다, 결과를 출력한다.
 */
import java.util.*;
import java.io.*;
public class No11723_BitMask {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = 20;
        int m = Integer.valueOf(bf.readLine());
        int s = 0;
        StringBuilder sb = new StringBuilder();
        while (m-- > 0) {
            String[] line = bf.readLine().split(" ");
            if (line[0].equals("add")) {
                int x = Integer.valueOf(line[1]) - 1; 
                s = (s | (1 << x));
            } else if (line[0].equals("remove")) {
                int x = Integer.valueOf(line[1]) - 1; 
                s = (s & ~(1<<x));
            } else if (line[0].equals("check")) {
                int x = Integer.valueOf(line[1]) - 1; 
                int res = (s & (1 << x));
                if (res == 0) {
                    sb.append("0\n");
                } else {
                    sb.append("1\n");
                }
            } else if (line[0].equals("toggle")) {
                int x = Integer.valueOf(line[1]) - 1; 
                s = (s ^ (1 << x));
            } else if (line[0].equals("all")) {
                s = (1 << n) - 1;
            } else if (line[0].equals("empty")) {
                s = 0;
            }
        }
        System.out.print(sb);
    }
}
