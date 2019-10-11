package lecture02;

import java.util.*;

public class No9095_Recursion {
	static int go(int sum, int goal){
		if(sum > goal){
			return 0;
		}else if(sum == goal){
			return 1;
		}
		int now = 0;
		for(int i = 1; i<=3; i++){
			now += go(sum+i, goal);
		}
		
		return now;
	}
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	for(int i = 0; i<n; i++){
    		int sum = 0;
    		System.out.println(go(sum ,sc.nextInt()));
    	}
    }
}
