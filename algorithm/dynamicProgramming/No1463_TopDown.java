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
public class No1463_TopDown {
	static int[] d = new int[100];
	public static int go(int n) {
		if(n==1) return 0;
		if(d[n]>0) return d[n];
		d[n] = go(n-1) + 1;
		if(n%2 == 0) {
			int tmp = go(n/2) +1;
			if(d[n]>tmp) d[n] = tmp;
			}
		if(n%3 == 0) {
			int tmp = go(n/2) + 1;
				if(d[n] > tmp)d[n] = tmp;
		}
		return d[n];
	}
    public static void main(String[] ars) {
    	
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	
    	
    	
    }
}
