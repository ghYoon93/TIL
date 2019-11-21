package bruteForce;
/**
 * 
 * @author YGH
 * ������ �����ֱ� (2)
 * N���� ���� �̷���� ���� A1, A2, ..., AN�� �־�����. 
 * ��, ���� �� ���̿� �������� �� �ִ� �����ڰ� �־�����. 
 * �����ڴ� ����(+), ����(-), ����(��), ������(��)���θ� �̷���� �ִ�. 
 * �������� ������ N-1���� ���� ���� �ִ�. 
 * ��� ���� ���̿��� �����ڸ� �� �� �����־�� �ϸ�, �־��� �����ڸ� ��� ������� �ʰ� ��� ���� ���̿� �����ڸ� �������� ���� �ִ�.
 * �츮�� ���� �� ���̿� �����ڸ� �ϳ��� �־, ������ �ϳ� ���� �� �ִ�. 
 * �̶�, �־��� ���� ������ �ٲٸ� �� �ȴ�.
 * ���� ���, 6���� ���� �̷���� ������ 1, 2, 3, 4, 5, 6�̰�, 
 * �־��� �����ڰ� ����(+) 3��, ����(-) 2��, ����(��) 1��, ������(��) 1���� ��쿡�� �� 250������ ���� ���� �� �ִ�. 
 * ���� ���, �Ʒ��� ���� ���� ���� �� �ִ�.
 * 1+2+3-4��5��6
 * 1��2+3+4-5��6
 * 1+2��3��4-5+6
 * 1��2��3-4+5+6
 * 1+2+3+4-5-6
 * 1+2+3-4-5��6
 * ���� ����� ������ �켱 ������ �����ϰ� �տ������� �����ؾ� �Ѵ�. 
 * ��, �������� ���� ���������� �� ���Ѵ�. ������ ����� ���� ���� C++14�� ������ ������. 
 * ��, ����� �ٲ� �� ���� ���ϰ�, �� ���� ������ �ٲ� �Ͱ� ����. �̿� ����, ���� �� 4���� ����� ����غ��� �Ʒ��� ����.
 * 1+2+3-4��5��6 = 1
 * 1��2+3+4-5��6 = 12
 * 1+2��3��4-5+6 = 5
 * 1��2��3-4+5+6 = 7
 * 1+2+3+4-5-6 = -1
 * 1+2+3-4-5��6 = -18
 * N���� ���� �����ڰ� �־����� ��, ���� �� �ִ� ���� ����� �ִ��� �Ͱ� �ּ��� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� ���� ���� N(2 �� N �� 11)�� �־�����. ��° �ٿ��� A1, A2, ..., AN�� �־�����. (1 �� Ai �� 100) 
��° �ٿ��� ���� N-1���� ũ�ų� ����, 4N���� �۰ų� ���� 4���� ������ �־����µ�, 
���ʴ�� ����(+)�� ����, ����(-)�� ����, ����(��)�� ����, ������(��)�� �����̴�. 

���
ù° �ٿ� ���� �� �ִ� ���� ����� �ִ���, ��° �ٿ��� �ּڰ��� ����Ѵ�. 
�ִ񰪰� �ּڰ��� �׻� -10�ﺸ�� ũ�ų� ����, 10�ﺸ�� �۰ų� ���� ����� ������ �Է¸� �־�����. 
����, �տ������� ������� ��, �߰��� ���Ǵ� ���� ����� �׻� -10�ﺸ�� ũ�ų� ����, 10�ﺸ�� �۰ų� ����.
 */
import java.util.*;
/**
class Pair {
    public int min, max;
    Pair(int min, int max) {
        this.min = min;
        this.max = max;
    }
}
**/
public class No15658_Recursion {
	   static Pair calc(int[] a, int index, int cur, int plus, int minus, int mul, int div) {
	        int n = a.length;
	        if (index == n) {
	            return new Pair(cur, cur);
	        }
	        ArrayList<Pair> res = new ArrayList<>();
	        if (plus > 0){
	            res.add(calc(a,index+1,cur+a[index],plus-1,minus,mul,div));
	        }
	        if (minus > 0) {
	            res.add(calc(a,index+1,cur-a[index],plus,minus-1,mul,div));
	        }
	        if (mul > 0) {
	            res.add(calc(a,index+1,cur*a[index],plus,minus,mul-1,div));
	        }
	        if (div > 0) {
	            res.add(calc(a,index+1,cur/a[index],plus,minus,mul,div-1));
	        }
	        Pair ans = res.get(0);
	        for (Pair p : res) {
	            if (ans.max < p.max) {
	                ans.max = p.max;
	            }
	            if (ans.min > p.min) {
	                ans.min = p.min;
	            }
	        }
	        return ans;
	    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        int plus = sc.nextInt();
        int minus = sc.nextInt();
        int mul = sc.nextInt();
        int div = sc.nextInt();
        Pair ans = calc(a, 1, a[0], plus, minus, mul, div);
        System.out.println(ans.max);
        System.out.println(ans.min);
    }
}
