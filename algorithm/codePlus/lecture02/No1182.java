//부분수열의 합
package lecture02;

import java.util.*;

public class No1182 {
	static int go(int[] a, int n, int s, int sum, int index){
		
		//정답인 경우
		if(index == n && sum == s) return 1;
		//불가능한 경우
		if(index == n && sum != s) return 0;
		
		
		return go(a, n, s, sum+a[index], index+1) + go(a, n, s, sum, index+1);
	}
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt(); // 정수의 개수
    	int s = sc.nextInt(); // 부분 수열의 합
    	int[] a = new int[n];
    	for(int i = 0; i<n; i++){
    		a[i] = sc.nextInt();
    	}
    	int ans = go(a, n, s, 0, 0);
    	if(s == 0) ans -= 1;
    	System.out.println(ans);
    }
}
