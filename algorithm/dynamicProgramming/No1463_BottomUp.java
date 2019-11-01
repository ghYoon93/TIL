package dynamicProgramming;
/**
 * 
 * @author YGH
 * 1�� �����
 * ���� X�� ����� �� �ִ� ������ ������ ���� �� �����̴�.
 * 1. X�� 3���� ������ ��������, 3���� ������.
 * 2. X�� 2�� ������ ��������, 2�� ������.
 * 3. 1�� ����.
 * ���� N�� �־����� ��, ���� ���� ���� �� ���� ������ ����ؼ� 1�� ������� �Ѵ�. 
 * ������ ����ϴ� Ƚ���� �ּڰ��� ����Ͻÿ�.
 * ù° �ٿ� ������ �ϴ� Ƚ���� �ּڰ��� ����Ѵ�.
 */

import java.util.*;
public class No1463_BottomUp {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int[] d = new int[N];
    	d[1] = 0;
    	for(int i=2; i<=N; i++) {
    		d[i] = d[i-1] + 1;
    		if(i%2 == 0 && d[i] > d[i/2]+1) {
    			d[i] = d[i/2] + 1;
    		}
    		if(i%3 == 0 && d[i] > d[i/3]+1) {
    			d[i] = d[i/3] + 1;
    		}
    	}
    	System.out.println(d[N]);
    	
    }
}
