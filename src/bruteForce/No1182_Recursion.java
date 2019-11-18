package bruteForce;
/**
 * 
 * @author YGH
 * 부분 수열의 합
 * N개의 정수로 이루어진 수열이 있을 때, 
 * 크기가 양수인 부분수열 중에서 그 수열의 원소를 다 더한 값이 S가 되는 경우의 수를 구하는 프로그램을 작성하시오.
 * 첫째 줄에 정수의 개수를 나타내는 N과 정수 S가 주어진다. (1 ≤ N ≤ 20, |S| ≤ 1,000,000) 
 * 둘째 줄에 N개의 정수가 빈 칸을 사이에 두고 주어진다. 
 * 주어지는 정수의 절댓값은 100,000을 넘지 않는다.
 * 첫째 줄에 합이 S가 되는 부분수열의 개수를 출력한다.
 */
import java.util.*;
public class No1182_Recursion {
	public static int go(int[] a, int m, int i, int sum) {
        if (i == a.length) {
            if (sum == m) {
                return 1;
            } else {
                return 0;
            }
        }
        return go(a, m, i+1, sum+a[i]) + go(a, m, i+1, sum);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = go(a, m, 0, 0);
        if (m == 0) {
            ans -= 1;
        }
        System.out.println(ans);
    }
}
