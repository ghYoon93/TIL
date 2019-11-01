import java.util.Scanner;

public class Rest {
    public static void main(String [] args){
    	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	int c = sc.nextInt();
    	
    	int answer01 = (a+b)%c;
    	int answer02 = (a%c + b%c)%c;
    	int answer03 = (a*b) % c;
    	int answer04 = (a%c * b%c)%c;
    	System.out.println(answer01);
    	System.out.println(answer02);
    	System.out.println(answer03);
    	System.out.println(answer04);
    	
    }
}
