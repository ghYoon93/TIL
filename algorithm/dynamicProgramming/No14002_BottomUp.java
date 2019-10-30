package dynamicProgramming;
//Bottom Up
import java.util.*;
public class No14002_BottomUp {
	static int[] d, a, v;
	static void go(int p) {
		if(p == -1) return;
	    go(v[p]);
		System.out.print(a[p]+" ");
	}
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	a = new int[n+1];
    	for(int i = 1; i<=n; i++) {
    		a[i] = sc.nextInt();
    	}
    	int ans = 0;
    	d = new int[n+1];
    	v = new int[n+1];
    	for(int i = 1; i<=n; i++) {
    		d[i] = 1;
    		v[i] = -1;
    		for(int j = 1; j<i; j++) {
    			if(a[i]>a[j] &&d[i]<d[j]+1) {
    				d[i] = d[j]+1;
    				v[i] = j;
    			}
    			
    		}
    		if(d[ans]<d[i]) ans = i;
    	}
    	System.out.println(d[ans]);
    	go(ans);
    }
}
