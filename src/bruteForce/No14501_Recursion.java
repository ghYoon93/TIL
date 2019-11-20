package bruteForce;
/**
 * 
 * @author YGH
 * ���
 * �������� ���ϰ� �ִ� �����̴� ��縦 �Ϸ��� �Ѵ�.
 * ���ú��� N+1��° �Ǵ� �� ��縦 �ϱ� ���ؼ�, ���� N�� ���� �ִ��� ���� ����� �Ϸ��� �Ѵ�.
 * �����̴� �񼭿��� �ִ��� ���� ����� ������� ��Ź�� �߰�, �񼭴� �Ϸ翡 �ϳ��� ���� �ٸ� ����� ����� ��Ƴ��Ҵ�.
 * ������ ����� ����� �Ϸ��ϴµ� �ɸ��� �Ⱓ Ti�� ����� ���� �� ���� �� �ִ� �ݾ� Pi�� �̷���� �ִ�.
 * N = 7�� ��쿡 ������ ���� ��� ����ǥ�� ����.
 * 1�Ͽ� �����ִ� ����� �� 3���� �ɸ���, ������� �� ���� �� �ִ� �ݾ��� 10�̴�. 
 * 5�Ͽ� �����ִ� ����� �� 2���� �ɸ���, ���� �� �ִ� �ݾ��� 15�̴�.
 * ����� �ϴµ� �ʿ��� �Ⱓ�� 1�Ϻ��� Ŭ �� �ֱ� ������, ��� ����� �� ���� ����. 
 * ���� �� 1�Ͽ� ����� �ϰ� �Ǹ�, 2��, 3�Ͽ� �ִ� ����� �� �� ���� �ȴ�. 
 * 2�Ͽ� �ִ� ����� �ϰ� �Ǹ�, 3, 4, 5, 6�Ͽ� �����ִ� ����� �� �� ����.
 * ����, N+1��°���� ȸ�翡 ���� ������, 6, 7�Ͽ� �ִ� ����� �� �� ����.
 * ��� ���� �� �� �ִ� ����� �ִ� ������ 1��, 4��, 5�Ͽ� �ִ� ����� �ϴ� ���̸�, �̶��� ������ 10+20+15=45�̴�.
 * ����� ������ ���� ��, �����̰� ���� �� �ִ� �ִ� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ù° �ٿ� N (1 �� N �� 15)�� �־�����.
 * ��° �ٺ��� N���� �ٿ� Ti�� Pi�� �������� ���еǾ �־�����, 1�Ϻ��� N�ϱ��� ������� �־�����. (1 �� Ti �� 5, 1 �� Pi �� 1,000)
 * ù° �ٿ� �����̰� ���� �� �ִ� �ִ� ������ ����Ѵ�.
 */
import java.util.*;
public class No14501_Recursion {
	static final int inf = -100000000;
    static int[] t;
    static int[] p;
    static int n;
    static int ans = 0;
    static void go(int day, int sum) {
        if (day == n+1) {
            if (ans < sum) ans = sum;
            return;
        }
        if (day > n+1) {
            return;
        }
        go(day+1, sum);
        go(day+t[day], sum+p[day]);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        t = new int[n+1];
        p = new int[n+1];
        for (int i=1; i<=n; i++) {
            t[i] = sc.nextInt();
            p[i] = sc.nextInt();
        }
        go(1, 0);
        System.out.println(ans);
    }
}