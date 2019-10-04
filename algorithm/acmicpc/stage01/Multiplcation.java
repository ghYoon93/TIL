import java.util.Scanner;

public class Multiplcation {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int b1 = b / 100 * 100;
		int b2 = (b - b1) / 10 * 10;
		int b3 = b - b1 - b2;
		
		int answer01 = a * b3;
		int answer02 = a * b2 / 10;
		int answer03 = a * b1 / 100;
		int answer04 = a * b;
		System.out.println(answer01);
		System.out.println(answer02);
		System.out.println(answer03);
		System.out.println(answer04);
		
		
	}
}
