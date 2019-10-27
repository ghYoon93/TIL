package dynamicProgramming;

//Top Down
import java.util.*;
public class No11727_TopDown {
	static int[] d;
	static int go(int n) {
		if(n == 0 || n == 1) return 1;
		if(d[n]>0) return d[n];
		d[n] = 2*go(n-2) + go(n-1);
		d[n]%=10007;
		return d[n];
	}
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	d = new int[n+1];
    	System.out.println(go(n));
    }
}
