package bruteForce;
/**
 * 
 * @author YGH
 * 
 * ��� ����
 * N�� �־����� ��, 1���� N������ ���� �̷���� ������ ���������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ù° �ٿ� N(1 �� N �� 8)�� �־�����. 
 * ù° �ٺ��� N!���� �ٿ� ���ļ� ��� ������ ���������� ����Ѵ�.
 * 
 */
import java.util.*;
public class No10974_Permutation {
	static boolean nextPermutation(int[] a) {
		int i = a.length - 1;
		while(i > 0 && a[i-1] > a[i]) i--;
		if(i == 0) return false;
		int j = a.length - 1;
		while(j >= i && a[i-1] > a[j]) j--;
		int tmp = a[i-1];
		a[i-1] = a[j];
		a[j] = tmp;
		j = a.length - 1;
		while(i < j) {
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
        	a[i] = i+1;
        }
        do {
        	for(int i = 0; i < n; i++) {
        		System.out.print(a[i]+" ");
        	}
        	System.out.println();
        } while(nextPermutation(a));
    }
}
