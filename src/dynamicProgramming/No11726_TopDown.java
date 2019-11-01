package dynamicProgramming;
//Top-Down

import java.util.*;

public class No11726_TopDown {
	static int n;
	static int[] d;
	
	static int go(int n){
		if(n<0) return 0;
		if(n <= 1) return 1;
		if(d[n] > 0) return d[n];
		d[n] = go(n-1) + go(n-2);
		d[n] %= 10007;
		return d[n];
	}
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	n = sc.nextInt();
    	d = new int[n+1];
    	System.out.println(go(n));
    }
}
