package bruteForce;
/**
 * 
 * @author YGH
 * ���ǿ� ��ȸ 2
 * ���ǿ� ��ȸ ������ ����� Traveling Salesman problem (TSP) ��� �Ҹ��� ������ 
 * computer science �о߿��� ���� �߿��ϰ� ��޵Ǵ� ���� �� �ϳ��̴�. 
 * ���� ���� ���� ������ ������, ���⼭�� ���� �Ϲ����� ������ ������ ���캸��.
 * 1������ N������ ��ȣ�� �Ű��� �ִ� ���õ��� �ְ�, ���õ� ���̿��� ���� �ִ�. (���� ���� ���� �ִ�) 
 * ���� �� ���ǿ��� ��� �� ���ÿ��� ����� N���� ���ø� ��� ���� �ٽ� ������ ���÷� ���ƿ��� ��ȸ ���� ��θ� ��ȹ�Ϸ��� �Ѵ�. 
 * ��, �� �� ���� ���÷δ� �ٽ� �� �� ����. (�� �������� ������ ����ߴ� ���÷� ���ƿ��� ���� ����) 
 * �̷� ���� ��δ� ���� ������ ���� �� �ִµ�, ���� ���� ����� ���̴� ���� ��ȹ�� ������� �Ѵ�.
 * 
 * �� ���ð��� �̵��ϴµ� ��� ����� ��� W[i][j]���·� �־�����. 
 * W[i][j]�� ���� i���� ���� j�� ���� ���� ����� ��Ÿ����. 
 * ����� ��Ī������ �ʴ�. 
 * ��, W[i][j] �� W[j][i]�� �ٸ� �� �ִ�. 
 * ��� ���ð��� ����� ���� �����̴�. 
 * W[i][i]�� �׻� 0�̴�. 
 * ��쿡 ���� ���� i���� ���� j�� �� �� ���� ��쵵 ������ �̷� ��� W[i][j]=0�̶�� ����.
 * 
 * N�� ��� ����� �־����� ��, ���� ���� ����� ���̴� ���ǿ��� ��ȸ ���� ��θ� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ù° �ٿ� ������ �� N�� �־�����. (2 �� N �� 10) 
 * ���� N���� �ٿ��� ��� ����� �־�����. 
 * �� ����� ������ 1,000,000 ������ ���� �����̸�, �� �� ���� ���� 0�� �־�����. 
 * W[i][j]�� ���� i���� j�� ���� ���� ����� ��Ÿ����.
 * �׻� ��ȸ�� �� �ִ� ��츸 �Է����� �־�����.
 * ù° �ٿ� ���ǿ��� ��ȸ�� �ʿ��� �ּ� ����� ����Ѵ�.
 */

import java.util.*;
public class No10971_Permutation {
	static boolean nextPermutation(int[] a) {
		int i = a.length - 1;
		while(i > 1 && a[i-1]>a[i]) i--;
		if(i == 1) return false;
		int j = a.length - 1;
		while(i <= j && a[i-1] > a[j]) j--;
		int tmp = a[j];
		a[j] = a[i-1];
		a[i-1] = tmp;
		j = a.length - 1;
		while(i<j) {
			tmp = a[j];
			a[j] = a[i];
			a[i] = tmp;
			i++;
			j--;
		}
		
		return true;
	}
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int[] a = new int[n];
    	int[][] w = new int[n][n];
    	for(int i = 0; i < n; i++) {
    		a[i] = i;
    		for(int j = 0; j < n; j++) {
    			w[i][j] = sc.nextInt();
    		}
    	}
    	int ans = Integer.MAX_VALUE;
    	do {
    		int from, to;
    		int cost = 0;
			boolean ok = true;
    		for(int i = 0; i < n - 1; i++) {
    			from = a[i];
    			to = a[i+1];
    			if(w[from][to] == 0) ok = false;
    			cost += w[from][to];
    			
    		}
    		from = a[n - 1];
    		to = a[0];
    		if(w[from][to] == 0) ok = false;
    		
			cost += w[from][to];	
    		
    		
    		if(ok && ans > cost) {
				ans = cost;
			}
    	}	
    	while(nextPermutation(a));
        System.out.println(ans);
    }
}
