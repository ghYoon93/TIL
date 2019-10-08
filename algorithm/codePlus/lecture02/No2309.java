package lecture02;

import java.util.Scanner;
import java.util.Arrays;

public class No2309 {
	public static final int N = 9;
    public static void main(String[] args){
    	Scanner sc =  new Scanner(System.in);
    	int[] arr = new int[N];
    	int sum = 0;
    	
    	for(int i = 0; i < N; i ++){
    		arr[i] = sc.nextInt();
    		sum += arr[i];
    	}
    	Arrays.sort(arr);
    	
    	for(int i = 0; i < N; i++){
    		for(int j = i+1; j<N; j++){
    			if(sum - arr[i] - arr[j] == 100){
    				for(int k = 0; k < N; k++){
    					if(i==k || j==k) continue;
    					System.out.println(arr[k]);
    				}
    				System.exit(0);
    			}
    		}
    	}
    }
}
