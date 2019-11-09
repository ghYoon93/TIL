package bruteForce;
/**
 * 
 * @author YGH
 * ���� ����
 * 1���� N������ ���� �̷���� ������ �ִ�. 
 * �̶�, ���������� �ٷ� ������ ���� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ���� ������ ���� �ռ��� ������ ������������ �̷���� �����̰�, ���� �������� ���� ������ ������������ �̷���� �����̴�.
 * N = 3�� ��쿡 ���������� ������ �����ϸ� ������ ����.
 * ù° �ٿ� N(1 �� N �� 10,000)�� �־�����. ��° �ٿ� ������ �־�����.
 * ù° �ٿ� �Է����� �־��� ������ ������ ���� ������ ����Ѵ�. 
 * ����, ���������� ���� ó���� ���� ������ ��쿡�� -1�� ����Ѵ�.
 */
import java.util.*;
public class No10973_Permutation {
	static boolean prePermutation(int[] a) {
		int i = a.length - 1;
		while(i>0 && a[i-1]<a[i]) i--;
		if(i == 0) return false;
		
		int j = a.length - 1;
		while(a[i-1]<=a[j]) j--;
		
		int tmp = a[i-1];
		a[i-1] = a[j];
		a[j] = tmp;
		
		j = a.length - 1;
		while(i<j) {
			tmp = a[i];
			a[i] = a[j];
			a[j] = tmp;
			i++;
			j--;
		}
		return true;
	}
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int[] a = new int[n];
    	for(int i = 0; i < n; i++) {
    		a[i] = sc.nextInt();
    	}
    	if(prePermutation(a)) {
    		for(int i = 0 ; i < n; i++) {
    			System.out.print(a[i] + " ");
    		}
    		
    	}else {
    		System.out.println(-1);
    	}
    }
}
