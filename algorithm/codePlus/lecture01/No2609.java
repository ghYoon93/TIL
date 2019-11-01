package lecture01;

import java.util.Scanner;

public class No2609 {
	public static int getGCD(int A, int B){
		while(B != 0){
        	int r = A % B;
        	A = B;
        	B = r;
        }
		return A;
	}
	
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        
        int gcd = getGCD(A, B);
        int lcm = gcd * (A/gcd) * (B/gcd);
        System.out.println(gcd);
        System.out.println(lcm);
    }
}
