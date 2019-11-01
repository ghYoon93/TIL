package dynamicProgramming;
/**
 * 
 * @author YGH
 * 1로 만들기
 * 정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지이다.
 * 1. X가 3으로 나누어 떨어지면, 3으로 나눈다.
 * 2. X가 2로 나누어 떨어지면, 2로 나눈다.
 * 3. 1을 뺀다.
 * 정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다. 
 * 연산을 사용하는 횟수의 최솟값을 출력하시오.
 * 첫째 줄에 연산을 하는 횟수의 최솟값을 출력한다.
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
