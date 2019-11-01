package dynamicProgramming;

import java.util.*;

public class No11052_TopDown {
	static int n;
	static int[] d, p;
	static int go(int n) {
		if(n == 0) return 0; 
		if(d[n]>0) return d[n];
		for(int i = 1; i<=n; i++) {
			d[n] = Math.max(d[n], go(n-i)+p[i]);
		}
		return d[n];
	}
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	n = sc.nextInt();
    	d = new int[n+1];
    	p = new int[n+1];
    	for(int i= 1; i <= n; i++) {
    	    p[i] = sc.nextInt();
    	}
    	System.out.println(go(n));
    }
}
