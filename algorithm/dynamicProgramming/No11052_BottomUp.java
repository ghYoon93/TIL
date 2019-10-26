package dynamicProgramming;

import java.util.*;

public class No11052_BottomUp {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int[] d = new int[n+1];
    	int[] p = new int[n+1];
    	for(int i = 1; i <= n; i++) {
    		p[i] = sc.nextInt();
    	}
    	d[1] = p[1];
    	for(int i = 2; i <= n; i++) {
    		d[i] = p[i];
    		for(int j = 1; j < i; j++) {
    			int tmp = p[j] + d[i-j];
    			if(tmp > d[i]) d[i] = tmp;
    		}
    	}
    	System.out.println(d[n]);
    }
}
