package dynamicProgramming;
import java.util.*;
public class No11057_BottomUp {
	static final int MOD = 10007;
	static final int MAX = 1000;
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int[][] d = new int[MAX+1][10];
    	for(int i = 1; i<=MAX; i++) {
    		for(int j = 0; j<10; j++) {
    			if(i == 1) {
    				d[i][j] = 1;
    			}else {
    				//d[i][j] = 
    			}
    		}
    	}
    	int n = sc.nextInt();
    }
}
