package bruteForce;
/**
 * 
 * @author YGH
 * 다음 순열
 * 1부터 N까지의 수로 이루어진 순열이 있다. 
 * 이때, 사전순으로 다음에 오는 순열을 구하는 프로그램을 작성하시오.
 * 사전 순으로 가장 앞서는 순열은 오름차순으로 이루어진 순열이고, 가장 마지막에 오는 순열은 내림차순으로 이루어진 순열이다.
 * N = 3인 경우에 사전순으로 순열을 나열하면 다음과 같다.
 * 첫째 줄에 N(1 ≤ N ≤ 10,000)이 주어진다. 
 * 둘째 줄에 순열이 주어진다.
 * 첫째 줄에 입력으로 주어진 순열의 다음에 오는 순열을 출력한다. 
 * 만약, 사전순으로 마지막에 오는 순열인 경우에는 -1을 출력한다.

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
