package bruteForce;
/**
 * 
 * @author YGH
 * 
 * ����
 * ����ִ� ������ S�� �־����� ��, �Ʒ� ������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * add x: S�� x�� �߰��Ѵ�. (1 �� x �� 20) 
 * S�� x�� �̹� �ִ� ��쿡�� ������ �����Ѵ�.
 * remove x: S���� x�� �����Ѵ�. (1 �� x �� 20) 
 * S�� x�� ���� ��쿡�� ������ �����Ѵ�.
 * check x: S�� x�� ������ 1��, ������ 0�� ����Ѵ�.
 * toggle x: S�� x�� ������ x�� �����ϰ�, ������ x�� �߰��Ѵ�. (1 �� x �� 20)
 * all: S�� {1, 2, ..., 20} ���� �ٲ۴�.
 * empty: S�� ���������� �ٲ۴�. 
 * 
 * �Է�
 * ù° �ٿ� �����ؾ� �ϴ� ������ �� M (1 �� M �� 3,000,000)�� �־�����.
 * ��° �ٺ��� M���� �ٿ� �����ؾ� �ϴ� ������ �� �ٿ� �ϳ��� �־�����.
 * 
 * ���
 * check ������ �־���������, ����� ����Ѵ�.
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
