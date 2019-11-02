package mathmatics;
/**
 * 
 * @author YGH
 * M�̻� N������ �Ҽ��� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ù° �ٿ� �ڿ��� M�� N�� �� ĭ�� ���̿� �ΰ� �־�����. (1 �� M �� N �� 1,000,000)
 * �� �ٿ� �ϳ���, �����ϴ� ������� �Ҽ��� ����Ѵ�.
 */
import java.util.*;
public class No1929_math {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	int m = sc.nextInt();
    	int n = sc.nextInt();
    	boolean[] check = new boolean[n+1];
    	for(int i = 2; i <=n; i++) {
    		if(check[i] == false) {
    			for(int j = i+i; j<=n; j+=i) {
    				check[j] = true;
    			}
    		}
    	}
    	for(int i = m; i <= n; i++) {
    		if(check[i] == false) System.out.println(i);
    	}
    }
}
