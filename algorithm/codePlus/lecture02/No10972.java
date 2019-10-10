// 다음 순열
package lecture02;

import java.util.Scanner;

public class No10972 {
	public static boolean nextPermutation(int[] arr, int n){
		int i = n-1;
		while(i>0 && arr[i-1]>=arr[i]) i--; // arr[i-1]<arr[i]를 만족하는 가장 큰 i를 찾는다.
		if(i<=0) return false; // 없으면 마지막 순열
		
		int j = n-1;
		while(arr[j] <= arr[i-1]) j--; // j>=i이면서 arr[j]>arr[i-1]를 만족하는 가장 큰 j를 찾는다.
		
		// arr[i-1]과 arr[j]를 swap한다.
		int tmp = arr[i-1];
		arr[i-1] = arr[j];
		arr[j] = tmp;
		
		// arr[i]부터 순서를 뒤집는다.
		j = n-1;
		while(i<j){
			tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
			i++;
			j--;
		}
		return true;
	}
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int[] arr = new int[n];
    	for(int i=0; i<n; i++){
    		arr[i] = sc.nextInt();
    	}
    	if(nextPermutation(arr, n)){
    		for(int i = 0; i<n; i++){
    			System.out.format("%d ", arr[i]);
    		}
    		System.out.println();
    	}else{
    		System.out.println("-1");
    	}
    	
    }
}
