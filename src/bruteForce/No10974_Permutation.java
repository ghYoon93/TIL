package bruteForce;
/**
 * 
 * @author YGH
 * 
 * 모든 순열
 * N이 주어졌을 때, 1부터 N까지의 수로 이루어진 순열을 사전순으로 출력하는 프로그램을 작성하시오.
 * 첫째 줄에 N(1 ≤ N ≤ 8)이 주어진다. 
 * 첫째 줄부터 N!개의 줄에 걸쳐서 모든 순열을 사전순으로 출력한다.
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
