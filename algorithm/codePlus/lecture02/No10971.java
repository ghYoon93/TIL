package lecture02;

import java.util.Scanner;

public class No10971 {
	static boolean nextPermutation(int[] a, int n){
		int i = n-1;
		while(i > 0 && a[i-1] >= a[i]) i--;
		if(i<=0) return false;
		
		int j = n-1;
		while(a[i-1] >= a[j]) j--;
		int temp = a[j];
		a[j] = a[i-1];
		a[i-1] = temp;
		
		j = n-1;
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
    	int[][] w = new int[n][n+1];
    	for(int i = 0; i < n; i++){
    		a[i] = i;
    	}
    	for(int i = 0; i < n; i++){
    		for(int j = 0; j < n; j++){
    			w[i][j] = sc.nextInt();
    		}
    	}
    	
    	
    	int ans = Integer.MAX_VALUE; 
    	do{
    		int temp = 0;
    		boolean ok = true;
    		for(int i = 0; i < n - 1; i++){
    			if(w[a[i]][a[i + 1]] == 0) {
    				ok = false;
    			}else{
    				temp += w[a[i]][a[i + 1]];	
    			}
    			
    		}

    		if(ok && w[a[n -1 ]][a[0]] != 0){
    			temp += w[a[n-1]][a[0]];
    			if(ans > temp){
    				ans = temp;
    			}
    		}
    	}while(nextPermutation(a, n));
    	

    	System.out.println(ans);
    }
}
