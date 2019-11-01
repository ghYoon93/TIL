package lecture01;

import java.util.Scanner;
import java.util.ArrayList;

public class No6588 {
	public static final int MAX = 1000000;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		boolean[] check = new boolean[MAX + 1];
		ArrayList<Integer> prime = new ArrayList<Integer>();
		check[0] = check[1] = true;
		for(int i = 2; i*i <= MAX; i++){
			if(check[i] == true){
				continue;
			}
			prime.add(i);
			for(int j = i+i; j<=MAX; j+=i){
				check[j] = true;
			}
		}
		while(true){
			int n = sc.nextInt();
			if(n == 0){
				break;
			}
			
			for(int i = 1; i < prime.size(); i++){
				int p = prime.get(i);
				if(check[n - p] == false){
					System.out.format("%d = %d + %d\n", n, p, (n-p));
					break;
				}
			}
			
		}
	}
}
