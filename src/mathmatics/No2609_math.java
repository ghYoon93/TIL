package mathmatics;
/**
 * 
 * @author YGH
 * 두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램을 작성하시오.
 * 첫째 줄에는 두 개의 자연수가 주어진다. 
 * 이 둘은 10,000이하의 자연수이며 사이에 한 칸의 공백이 주어진다.
 * 첫째 줄에는 입력으로 주어진 두 수의 최대공약수를,둘째 줄에는 입력으로 주어진 두 수의 최소 공배수를 출력한다.
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
