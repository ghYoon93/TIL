package mathmatics;
/**
 * 
 * @author YGH
 * 1742��, ������ �Ƹ��߾� ���а� ũ����Ƽ�� ������� �����ϸ�Ʈ ���Ϸ����� ������ ���� ������ �����ϴ� ������ ���´�.
 * 4���� ū ��� ¦���� �� Ȧ�� �Ҽ��� ������ ��Ÿ�� �� �ִ�.
 * ���� ��� 8�� 3 + 5�� ��Ÿ�� �� �ְ�, 3�� 5�� ��� Ȧ���� �Ҽ��̴�. 
 * ��, 20 = 3 + 17 = 7 + 13, 42 = 5 + 37 = 11 + 31 = 13 + 29 = 19 + 23 �̴�.
 * �� ������ ������ �ذ���� ���� �����̴�.
 * �鸸 ������ ��� ¦���� ���ؼ�, �� ������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * �Է��� �ϳ� �Ǵ� �� �̻��� �׽�Ʈ ���̽��� �̷���� �ִ�. 
 * �׽�Ʈ ���̽��� ������ 100,000���� ���� �ʴ´�.
 * �� �׽�Ʈ ���̽��� ¦�� ���� n �ϳ��� �̷���� �ִ�. (6 �� n �� 1000000)
 * �Է��� ������ �ٿ��� 0�� �ϳ� �־�����.
 * �� �׽�Ʈ ���̽��� ���ؼ�, n = a + b ���·� ����Ѵ�. 
 * �̶�, a�� b�� Ȧ�� �Ҽ��̴�. 
 * ���ڿ� �����ڴ� ���� �ϳ��� ���еǾ��� �ִ�. 
 * ����, n�� ���� �� �ִ� ����� ���� �������, b-a�� ���� ū ���� ����Ѵ�. 
 * ��, �� Ȧ�� �Ҽ��� ������ n�� ��Ÿ�� �� ���� ��쿡�� "Goldbach's conjecture is wrong."�� ����Ѵ�.
 */
import java.util.*;
public class No6588_math {
	static final int MAX = 1000001;
    public static void main(String[] args) {
    	boolean[] check = new boolean[MAX];
    	for(int i = 1; i*i < MAX; i++) {
    		if(i == 1) {
    			check[i] = true;
    			continue;
    		}
    		if(check[i] == false) {
    			for(int j = i + i; j<MAX; j+=i) {
    				check[j] = true;
    			}
    		}
    	}
        Scanner sc = new Scanner(System.in);
        while(true) {
        	boolean c = false;
        	int n = sc.nextInt();
        	if(n == 0) break;
        	for(int i = 3; i<n; i++) {
        		if(check[i] == false && check[n-i] == false) {
        			System.out.println(n + " = " + i + " + " + (n-i));
        			c = true;
        			break;
        		}
        	}
        	if(!c) System.out.println("Goldbach's conjecture is wrong.");
        }
    }
}
