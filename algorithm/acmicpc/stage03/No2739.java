package stage03;

import java.util.Scanner;

public class No2739 {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int input = sc.nextInt();
    	
		for(int i = 1; i < 10; i++){
			System.out.format("%d * %d = %d\n", input, i, input*i);
		}
    }
}
