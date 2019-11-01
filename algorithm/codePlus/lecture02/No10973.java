//이전 순열
package lecture02;

import java.util.Scanner;

public class No10973 {
    public static boolean prevPermutation(int[] a, int n){
    	int i = n-1;
    	while(i>0 && a[i-1]<=a[i]) i--;
    	if(i<=0) return false;
    	
    	int j = n-1;
    	while(a[j] >= a[i-1]) j--;
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
    	for(int i = 0; i <n; i++){
    		a[i] = sc.nextInt();
    	}
    	if(prevPermutation(a, n)){
    		for(int i = 0; i<n; i++){
    			System.out.format("%d ", a[i]);	
    		}
    		System.out.format("\n");
    	}else{
    		System.out.println(-1);
    	}
    	
    }
}
