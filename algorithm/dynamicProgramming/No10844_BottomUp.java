package dynamicProgramming;
//Bottom Up
import java.util.*;
import java.math.*;
public class No10844_BottomUp {
	static final long mod = 1000000000L;
	static final int MAX = 100;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[][] d = new long[MAX+1][10];
        
        for(int i = 1; i < MAX+1; i++) {
        	for(int j = 0; j<10; j++) {
        		if(i == 1) {
        			d[i][0] = 0;
        		    d[i][j] = 1;
        		    continue;
        		}
            	if(j == 0) {
            		d[i][j] = d[i-1][1];
            	}else if(j == 9) {
            		d[i][j] = d[i-1][8];
            	}else {
            		d[i][j] = d[i-1][j-1]+d[i-1][j+1];
            	}
            	d[i][j]%=mod;
            }	
        }
        long ans = 0;
        for(int i = 0; i < 10; i++) {
        	ans += d[n][i];
        }
        ans%=mod;
        System.out.println(ans);
    }
}
