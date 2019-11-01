package dynamicProgramming;
//Top-Down
import java.util.*;
public class No9095_TopDown {
	static int[] d = new int[11];
	static int go(int n) {
		if(n <= 1) return 1;
		if(n == 2) return 2;
		if(d[n]>0) return d[n];
		d[n] = go(n-1) +go(n-2)+go(n-3);
		return d[n];
	}
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	while(t-->0) {
    		int n = sc.nextInt();
        	System.out.println(go(n));	
    	}
    	
    }
}
