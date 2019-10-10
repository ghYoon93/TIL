package lecture02;

import java.util.Scanner;
import java.util.Arrays;

public class No10819 {
	static boolean nextPermutation(int[] a,int n){
		int i = n - 1;
		while(i > 0 && a[i - 1] >= a[i] ) i--;
		if(i <= 0) return false;
		
		int j = n - 1;
		while(a[j] <= a[i - 1])j--;
		int temp = a[j];
		a[j] = a[i - 1];
		a[i - 1] = temp;
		
		j = n - 1;
		while(i < j){
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
    	for(int i = 0; i < n; i++){
    		a[i] = sc.nextInt();
    	}
    	Arrays.sort(a);
    	int ans = 0;
    	do{
    		int temp = 0;
        	for(int i = 0; i < n-1; i++){
        		temp+=Math.abs(a[i]-a[i+1]);
        	}
        	if(ans < temp){
        		ans = temp;
        	}
    	}while(nextPermutation(a, n));
    	
    	System.out.println(ans);
    	
    }
}
