package lecture02;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class No14888 {
	static boolean nextPermutation(int[] d,int n){
		int i = n - 1;
		while(i > 0 && d[i - 1] >= d[i]) i--;
		if(i <= 0) return false;
		
		int j = n - 1;
		while(d[i - 1] >= d[j]) j--;
		int temp = d[j];
		d[j] = d[i-1];
		d[i-1] = temp;
		
		j = n - 1;
		while(i < j){
			temp = d[j];
			d[j] = d[i];
			d[i] = temp;
		}
		return true;
	}
	
	static int calc(int[]a, int[] d,int n){
		int ans = a[0];
		for (int i=1; i<n; i++) {
            if (d[i-1] == 0) {
                ans = ans + a[i];
            } else if (d[i-1] == 1) {
                ans = ans - a[i];
            } else if (d[i-1] == 2) {
                ans = ans * a[i];
            } else {
                ans = ans / a[i];
            }
        }
        return ans;
	}
	
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int[] a = new int[n];
    	int[] d = new int[n-1];
    	for(int i = 0; i < n; i++){
    		a[i] = sc.nextInt();
    	}
    	int m = 0;
        for (int i=0; i<4; i++) {
            int cnt = sc.nextInt();
            for (int j=0; j<cnt; j++) {
                d[m++] = i;
            }
        }
        Arrays.sort(d);
        ArrayList <Integer> result = new ArrayList<>();
    	
    	do{
    		int temp = calc(a, d, n);
    		result.add(temp);
    	}while(nextPermutation(d, n-1));
    	Collections.sort(result);
    	m = result.size();
    	System.out.println(result.get(m-1));
    	System.out.println(result.get(0));
    }
}
