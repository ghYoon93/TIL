package lecture01;

import java.util.Scanner;

public class No1978 {
	public static boolean prime(int n){
		if(n < 2){
			return false;
		}
		for(int i = 2; i*i <= n; i++){
			if(n%i == 0){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int answer = 0;
		while(N-->0){
			int check = sc.nextInt();
			if(prime(check)){
				answer ++;
			}
		}
		System.out.println(answer);
	}

}
