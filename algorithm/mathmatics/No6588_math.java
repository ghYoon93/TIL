package mathmatics;
/**
 * 
 * @author YGH
 * A+B)%C는 (A%C + B%C)%C 와 같을까?
 * (A×B)%C는 (A%C × B%C)%C 와 같을까?
 * 세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
 * 첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)
 * 첫째 줄에 (A+B)%C, 둘째 줄에 (A%C + B%C)%C, 셋째 줄에 (A×B)%C, 넷째 줄에 (A%C × B%C)%C를 출력한다.
 */
import java.util.*;
public class No6588_math {
	static int A, B, C;
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	A = sc.nextInt();
    	B = sc.nextInt();
    	C = sc.nextInt();
    	System.out.println((A+B)%C);
    	System.out.println((A%C + B%C)%C);
    	System.out.println((A*B)%C);
    	System.out.println((A%C * B%C)%C);
    }
}
