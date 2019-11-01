package dynamicProgramming;
//Bottom Up
import java.util.*;
public class No11053_BottomUp {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int[] a = new int[n+1];
    	for(int i = 1; i<=n; i++) {
    		a[i] = sc.nextInt();
    	}
    	int ans = 0;
    	int[] d = new int[n+1];
    	for(int i = 1; i<=n; i++) {
    		d[i] = 1;
    		for(int j = 1; j<i; j++) {
    			if(a[i]>a[j] &&d[i]<d[j]+1) {
    				d[i] = d[j]+1;
    			}
    			
    		}
    		if(ans<d[i]) ans = d[i];
    	}
    	System.out.println(ans);
    }
}
