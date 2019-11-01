package lecture01;

import java.util.Scanner;

public class No1929 {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int m = sc.nextInt();
    	int n = sc.nextInt();
    	
    	boolean[] check = new boolean[n+1];
    	check[0] = check[1] = true;
    	
    	
    	for(int i = 2; i <= n; i++){
    		if(check[i] == true){
    			continue;
    		}
			for(int j = i+i; j<=n; j+=i){
				check[j] = true;
			}
    	}
    	for(int i = m; i <=n; i++){
    		if(!check[i]){
    			System.out.println(i);
    		}
    	}
    	
    	
    }
}
