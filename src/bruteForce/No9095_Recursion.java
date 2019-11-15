package bruteForce;
/**
 * 
 * @author YGH
 * 1, 2, 3 ���ϱ�
 * ���� 4�� 1, 2, 3�� ������ ��Ÿ���� ����� �� 7������ �ִ�. 
 * ���� ��Ÿ�� ���� ���� 1�� �̻� ����ؾ� �Ѵ�.
 * 1+1+1+1
 * 1+1+2
 * 1+2+1
 * 2+1+1
 * 2+2
 * 1+3
 * 3+1
 * ���� n�� �־����� ��, n�� 1, 2, 3�� ������ ��Ÿ���� ����� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����. 
 * �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ�, ���� n�� �־�����. 
 * n�� ����̸� 11���� �۴�.
 * �� �׽�Ʈ ���̽�����, n�� 1, 2, 3�� ������ ��Ÿ���� ����� ���� ����Ѵ�.
 */
import java.util.*;
public class No9095_Recursion {
	 public static int go(int sum, int goal) {
	        if (sum > goal) {
	            return 0;
	        }
	        if (sum == goal) {
	            return 1;
	        }
	        int now = 0;
	        for (int i=1; i<=3; i++) {
	            now += go(sum+i, goal);
	        }
	        return now;
	    }
	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        int t = sc.nextInt();
	        while (t-- > 0) {
	            int n = sc.nextInt();
	            System.out.println(go(0, n));
	        }
	    }
}
