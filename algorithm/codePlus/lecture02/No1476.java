package lecture02;

import java.util.Scanner;

public class No1476 {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int e = sc.nextInt();
    	int s = sc.nextInt();
    	int m = sc.nextInt();
    	
    	for(int i = 0; ; i++){
    		if(i%15==e && i%28 == s && i%19 == m){
    			System.out.println(i+1);
    			break;
    		}
    	}
    }
}
