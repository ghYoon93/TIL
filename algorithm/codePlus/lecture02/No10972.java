// ���� ����
package lecture02;

import java.util.Scanner;

public class No10972 {
	public static boolean nextPermutation(int[] arr, int n){
		int i = n-1;
		while(i>0 && arr[i-1]>=arr[i]) i--; // arr[i-1]<arr[i]�� �����ϴ� ���� ū i�� ã�´�.
		if(i<=0) return false; // ������ ������ ����
		
		int j = n-1;
		while(arr[j] <= arr[i-1]) j--; // j>=i�̸鼭 arr[j]>arr[i-1]�� �����ϴ� ���� ū j�� ã�´�.
		
		// arr[i-1]�� arr[j]�� swap�Ѵ�.
		int tmp = arr[i-1];
		arr[i-1] = arr[j];
		arr[j] = tmp;
		
		// arr[i]���� ������ �����´�.
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
