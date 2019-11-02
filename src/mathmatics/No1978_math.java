package mathmatics;
/**
 * 
 * @author YGH
 * �־��� �� N�� �߿��� �Ҽ��� �� ������ ã�Ƽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ù �ٿ� ���� ���� N�� �־�����. 
 * N�� 100�����̴�. 
 * �������� N���� ���� �־����µ� ���� 1,000 ������ �ڿ����̴�.
 * �־��� ���� �� �Ҽ��� ������ ����Ѵ�.
 */
import java.util.*;
public class No1978_math {
	static boolean prime(int x) {
		if(x<2) return false;
		for(int i = 2; i*i <= x; i++) {
			if(x%i==0) return false;
		}
		return true;
	}
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int cnt = 0;
    	for(int i = 0; i<n; i++) {
    		if(prime(sc.nextInt())) cnt++;
    	}
    	System.out.println(cnt);
    }
}
