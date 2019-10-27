package dynamicProgramming;
//Bottom Up
import java.util.*;
public class No16194_BottomUp {
	static int[] d,p;
	static final int MAX = 1000*10000;
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	d = new int[n+1];
    	p = new int[n+1];
    	for(int i = 1; i <= n; i++) {
    		d[i] = MAX;
    		p[i] = sc.nextInt();
    	}
    	for(int i = 1; i <= n; i++) {
    		for(int j = 1; j <= i; j++) {
    			if (d[i] == MAX || d[i] > d[i-j] + p[j]) {
                    d[i] = d[i-j] + p[j];
                }
    		}
    	}
    	System.out.println(d[n]);
    }
}
