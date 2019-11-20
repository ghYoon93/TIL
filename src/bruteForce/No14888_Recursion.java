package bruteForce;
/**
 * 
 * @author YGH
 * ������ �����ֱ�
 * N���� ���� �̷���� ���� A1, A2, ..., AN�� �־�����. 
 * ��, ���� �� ���̿� �������� �� �ִ� N-1���� �����ڰ� �־�����. 
 * �����ڴ� ����(+), ����(-), ����(��), ������(��)���θ� �̷���� �ִ�.
 * �츮�� ���� �� ���̿� �����ڸ� �ϳ��� �־, ������ �ϳ� ���� �� �ִ�. 
 * �̶�, �־��� ���� ������ �ٲٸ� �� �ȴ�.
 * ���� ���, 6���� ���� �̷���� ������ 1, 2, 3, 4, 5, 6�̰�, 
 * �־��� �����ڰ� ����(+) 2��, ����(-) 1��, ����(��) 1��, ������(��) 1���� ��쿡�� �� 60������ ���� ���� �� �ִ�. 
 * ���� ���, �Ʒ��� ���� ���� ���� �� �ִ�.
 * 1+2+3-4��5��6
 * 1��2+3+4-5��6
 * 1+2��3��4-5+6
 * 1��2��3-4+5+6
 * ���� ����� ������ �켱 ������ �����ϰ� �տ������� �����ؾ� �Ѵ�. 
 * ��, �������� ���� ���������� �� ���Ѵ�. 
 * ������ ����� ���� ���� C++14�� ������ ������. 
 * ��, ����� �ٲ� �� ���� ���ϰ�, �� ���� ������ �ٲ� �Ͱ� ����. 
 * �̿� ����, ���� �� 4���� ����� ����غ��� �Ʒ��� ����.
 * 1+2+3-4��5��6 = 1
 * 1��2+3+4-5��6 = 12
 * 1+2��3��4-5+6 = 5
 * 1��2��3-4+5+6 = 7
 * N���� ���� N-1���� �����ڰ� �־����� ��, ���� �� �ִ� ���� ����� �ִ��� �Ͱ� �ּ��� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ù° �ٿ� ���� ���� N(2 �� N �� 11)�� �־�����. 
 * ��° �ٿ��� A1, A2, ..., AN�� �־�����. (1 �� Ai �� 100) 
 * ��° �ٿ��� ���� N-1�� 4���� ������ �־����µ�, ���ʴ�� ����(+)�� ����, ����(-)�� ����, ����(��)�� ����, ������(��)�� �����̴�. 
 */
import java.util.*;
class Pair {
    public int min, max;
    Pair(int min, int max) {
        this.min = min;
        this.max = max;
    }
}
public class No14888_Recursion {
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
