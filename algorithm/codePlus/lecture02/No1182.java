//�κм����� ��
package lecture02;

import java.util.*;

public class No1182 {
	static int go(int[] a, int n, int s, int sum, int index){
		
		//������ ���
		if(index == n && sum == s) return 1;
		//�Ұ����� ���
		if(index == n && sum != s) return 0;
		
		
		return go(a, n, s, sum+a[index], index+1) + go(a, n, s, sum, index+1);
	}
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt(); // ������ ����
    	int s = sc.nextInt(); // �κ� ������ ��
    	int[] a = new int[n];
    	for(int i = 0; i<n; i++){
    		a[i] = sc.nextInt();
    	}
    	int ans = go(a, n, s, 0, 0);
    	if(s == 0) ans -= 1;
    	System.out.println(ans);
    }
}
