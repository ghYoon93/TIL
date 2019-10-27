package dynamicProgramming;
//Bottom Up
import java.util.*;
public class No9095_BottomUp {
    static int[] d = new int[11];
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	d[0] = 1; d[1] = 1; d[2] = 2; d[3] = 4;
    	for(int i = 4; i<=10; i++) {
			d[i] = d[i-3] + d[i-2] + d[i-1];
		}
    	while(t-->0) {
    		int n = sc.nextInt();

    		
    		System.out.println(d[n]);
    	}
    }
}
