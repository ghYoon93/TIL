package mathmatics;
/**
 * 
 * @author YGH
 * �� ���� �ڿ����� �Է¹޾� �ִ� ������� �ּ� ������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ù° �ٿ��� �� ���� �ڿ����� �־�����. 
 * �� ���� 10,000������ �ڿ����̸� ���̿� �� ĭ�� ������ �־�����.
 * ù° �ٿ��� �Է����� �־��� �� ���� �ִ�������,��° �ٿ��� �Է����� �־��� �� ���� �ּ� ������� ����Ѵ�.
 */
import java.util.*;
public class No2609_math {
	static int gcd(int a, int b) {
		if(b == 0) {
			return a;
		}else {
			return gcd(b, a%b);
		}
	}
	static int lcm(int a, int b, int gcd) {
		return a*b/gcd;
	}
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	int gcd = gcd(a, b);
    	System.out.println(gcd);
    	System.out.println(lcm(a, b, gcd));
    }
}
