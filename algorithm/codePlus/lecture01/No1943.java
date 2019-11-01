package lecture01;

import java.util.Scanner;

public class No1943 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] answer = new int[T];
		
		for(int i = 0; i < T; i++){
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = A*B;
			while(B != 0){
				int r = A % B;
				A = B;
				B = r;
			}
			answer[i] =  C / A;
		}
		for(int i = 0; i < T; i++){
			System.out.println(answer[i]);
		}
	}

}
