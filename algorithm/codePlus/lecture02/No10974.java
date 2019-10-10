//모든 순열
package lecture02;

import java.util.Scanner;

public class No10974 {
	static boolean nextPermutation(int[] a, int n){
		int i = n-1;
		while(i>0 && a[i-1]>=a[i]) i--;
		if(i<=0) return false;
		
		int j = n-1;
		while(a[i-1]>=a[j])j--;
		int temp = a[j];
		a[j] = a[i-1];
		a[i-1] = temp;
		
		j = n-1;
		while(i<j){
			temp = a[j];
			a[j] = a[i];
			a[i] = temp;
			i++;
			j--;
		}
		return true;
	}
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int[] a = new int[n];
    	for(int i = 0; i<n; i++){
    		a[i] = i+1;
    	}
    	
    	do{
    		for(int i=0; i<n; i++){
    			System.out.format("%d ", a[i]);	
    		}
    		System.out.println();
    	}while(nextPermutation(a, n));
    }
}
