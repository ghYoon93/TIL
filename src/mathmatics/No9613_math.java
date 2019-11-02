package mathmatics;
/**
 * 
 * @author YGH
 * ���� ���� n���� �־����� ��, ������ ��� ���� GCD�� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ù° �ٿ� �׽�Ʈ ���̽��� ���� t (1 �� t �� 100)�� �־�����. 
 * �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ִ�. 
 * �� �׽�Ʈ ���̽��� ���� ���� n (1 < n �� 100)�� �־�����, �������� n���� ���� �־�����. 
 * �Է����� �־����� ���� 1000000�� ���� �ʴ´�.
 * �� �׽�Ʈ ���̽����� ������ ��� ���� GCD�� ���� ����Ѵ�.
 */
import java.util.*;
public class No9613_math {
	static int gcd(int a, int b) {
		if(b == 0) {
			return a;
		}else {
			return gcd(b, a%b);
		}
	}
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	while(t-->0) {
    		int n = sc.nextInt();
    		int[] a = new int[n];
    		for(int i = 0; i < n; i++) {
    			a[i] = sc.nextInt();
    		}
    		int sum = 0;
    		for(int i = 0; i < n-1; i++) {
    			for(int j = i+1; j < n; j++) {
    				sum += gcd(a[i], a[j]);
    			}
    		}
    		System.out.println(sum);
    	}
    }
}
