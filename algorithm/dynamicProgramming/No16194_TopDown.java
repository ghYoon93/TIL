package dynamicProgramming;
//Top Down
import java.util.*;
public class No16194_TopDown {
	static int[] d;
	static int[] p;
	static int go(int n) {
		if(n==0) return 0;
		if(d[n] != 1000*10000) return d[n];
		for(int i = 1; i<=n; i++) {
			d[n] = Math.min(d[n], go(n-i)+p[i]);
		}
		return d[n];
	}
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	d = new int[n+1];
    	p = new int[n+1];
    	
    	for(int i = 1; i<=n; i++) {
    		p[i] = sc.nextInt();
    		d[i] = 1000*10000;
    	}
    	System.out.println(go(n));
    }
}
