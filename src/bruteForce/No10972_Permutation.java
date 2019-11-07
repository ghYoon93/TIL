package bruteForce;
/**
 * 
 * @author YGH
 * ���� ����
 * 1���� N������ ���� �̷���� ������ �ִ�. 
 * �̶�, ���������� ������ ���� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ���� ������ ���� �ռ��� ������ ������������ �̷���� �����̰�, ���� �������� ���� ������ ������������ �̷���� �����̴�.
 * N = 3�� ��쿡 ���������� ������ �����ϸ� ������ ����.
 * ù° �ٿ� N(1 �� N �� 10,000)�� �־�����. 
 * ��° �ٿ� ������ �־�����.
 * ù° �ٿ� �Է����� �־��� ������ ������ ���� ������ ����Ѵ�. 
 * ����, ���������� �������� ���� ������ ��쿡�� -1�� ����Ѵ�.

 */
import java.util.*;
public class No10972_Permutation {
	static int n;
    static void nextPermutation(int[] a) {
    	int i = n-1;
    	while(true) {
    		if(i>0 && a[i-1] > a[i]) {
        		i--;
        	}else break;
    	}
    	if(i == 0) {
    		System.out.println(-1);
    	}else {
    		int j = n-1;
    		while(true) {
    			if(j>=i && a[i-1]>a[j]) {
    				j--;
    			}else {
    				break;
    			}
    		}
    			int tmp = a[j];
    			a[j] = a[i-1];
    			a[i-1] = tmp;
    			
    			j = n-1;
    			while(i != j) {
    				tmp = a[j];
    				a[j] = a[i];
    				a[i] = tmp;
    				i++;
    				j--;
    			}
    			for(int k = 0; k <n; k++) {
    				System.out.print(a[k]+" ");
    			}
    		
    	}
    	
    }
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	n = sc.nextInt();
    	int[] a = new int[n];
    	for(int i = 0; i < n; i++) {
    		a[i] = sc.nextInt();
    	}
    	nextPermutation(a);
    }
}
