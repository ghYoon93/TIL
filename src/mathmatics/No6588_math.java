package mathmatics;
/**
 * 
 * @author YGH
 * A+B)%C�� (A%C + B%C)%C �� ������?
 * (A��B)%C�� (A%C �� B%C)%C �� ������?
 * �� �� A, B, C�� �־����� ��, ���� �� ���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ù° �ٿ� A, B, C�� ������� �־�����. (2 �� A, B, C �� 10000)
 * ù° �ٿ� (A+B)%C, ��° �ٿ� (A%C + B%C)%C, ��° �ٿ� (A��B)%C, ��° �ٿ� (A%C �� B%C)%C�� ����Ѵ�.
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
