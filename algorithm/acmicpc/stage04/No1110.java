package stage04;

import java.util.Scanner;

public class No1110 {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	
    	int N = sc.nextInt();
    	
    	int cycle = 0;
    	int newNumber = N;
    	
    	
    	do{
    		cycle++;
			newNumber = (newNumber%10)*10 + ((newNumber/10) + (newNumber%10))%10;
			System.out.println("else" + newNumber);
    		
    	}while(N != newNumber);
    	System.out.println(cycle);
    	
    }
}
