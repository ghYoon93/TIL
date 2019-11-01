package mathmatics;
/**
 * 
 * @author YGH
 * �ּҰ����
 * �� �ڿ��� A�� B�� ���ؼ�, A�� ����̸鼭 B�� ����� �ڿ����� A�� B�� �������� �Ѵ�. 
 * �̷� ����� �߿��� ���� ���� ���� �ּҰ������� �Ѵ�. 
 * ���� ���, 6�� 15�� ������� 30, 60, 90���� ������, �ּ� ������� 30�̴�.
 * �� �ڿ��� A�� B�� �־����� ��, A�� B�� �ּҰ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ù° �ٿ� �׽�Ʈ ���̽��� ���� T(1 �� T �� 1,000)�� �־�����. 
 * ��° �ٺ��� T���� �ٿ� ���ļ� A�� B�� �־�����. (1 �� A, B �� 45,000)
 * ù° �ٺ��� T���� �ٿ� A�� B�� �ּҰ������ �Է¹��� ������� �� �ٿ� �ϳ��� ����Ѵ�.

 */
import java.util.*;
public class No1934_math {
	static int gcd(int a, int b) {
		if(b==0) {
			return a; 
		}else {
			return gcd(b,a%b);
		}
	}
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	while(t-->0) {
    		int a = sc.nextInt();
    		int b = sc.nextInt();
    		int gcd = gcd(a, b);
    		System.out.println(a*b/gcd); 
    	}
    }
}
