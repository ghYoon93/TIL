package bruteForce;
/**
 * 
 * @author YGH
 * 연산자 끼워넣기
 * N개의 수로 이루어진 수열 A1, A2, ..., AN이 주어진다. 
 * 또, 수와 수 사이에 끼워넣을 수 있는 N-1개의 연산자가 주어진다. 
 * 연산자는 덧셈(+), 뺄셈(-), 곱셈(×), 나눗셈(÷)으로만 이루어져 있다.
 * 우리는 수와 수 사이에 연산자를 하나씩 넣어서, 수식을 하나 만들 수 있다. 
 * 이때, 주어진 수의 순서를 바꾸면 안 된다.
 * 예를 들어, 6개의 수로 이루어진 수열이 1, 2, 3, 4, 5, 6이고, 
 * 주어진 연산자가 덧셈(+) 2개, 뺄셈(-) 1개, 곱셈(×) 1개, 나눗셈(÷) 1개인 경우에는 총 60가지의 식을 만들 수 있다. 
 * 예를 들어, 아래와 같은 식을 만들 수 있다.
 * 1+2+3-4×5÷6
 * 1÷2+3+4-5×6
 * 1+2÷3×4-5+6
 * 1÷2×3-4+5+6
 * 식의 계산은 연산자 우선 순위를 무시하고 앞에서부터 진행해야 한다. 
 * 또, 나눗셈은 정수 나눗셈으로 몫만 취한다. 
 * 음수를 양수로 나눌 때는 C++14의 기준을 따른다. 
 * 즉, 양수로 바꾼 뒤 몫을 취하고, 그 몫을 음수로 바꾼 것과 같다. 
 * 이에 따라서, 위의 식 4개의 결과를 계산해보면 아래와 같다.
 * 1+2+3-4×5÷6 = 1
 * 1÷2+3+4-5×6 = 12
 * 1+2÷3×4-5+6 = 5
 * 1÷2×3-4+5+6 = 7
 * N개의 수와 N-1개의 연산자가 주어졌을 때, 만들 수 있는 식의 결과가 최대인 것과 최소인 것을 구하는 프로그램을 작성하시오.
 * 첫째 줄에 수의 개수 N(2 ≤ N ≤ 11)가 주어진다. 
 * 둘째 줄에는 A1, A2, ..., AN이 주어진다. (1 ≤ Ai ≤ 100) 
 * 셋째 줄에는 합이 N-1인 4개의 정수가 주어지는데, 차례대로 덧셈(+)의 개수, 뺄셈(-)의 개수, 곱셈(×)의 개수, 나눗셈(÷)의 개수이다. 
 */
import java.util.*;
public class No14888_Permutation {
	static boolean next_permutation(int[] a) {
        int i = a.length-1;
        while (i > 0 && a[i-1] >= a[i]) {
            i -= 1;
        }

        if (i <= 0) {
            return false;
        }

        int j = a.length-1;
        while (a[j] <= a[i-1]) {
            j -= 1;
        }

        int temp = a[i-1];
        a[i-1] = a[j];
        a[j] = temp;

        j = a.length-1;
        while (i < j) {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i += 1;
            j -= 1;
        }
        return true;
    }
    static int calc(int[] a, int[] b) {
        int n = a.length;
        int ans = a[0];
        for (int i=1; i<n; i++) {
            if (b[i-1] == 0) {
                ans = ans + a[i];
            } else if (b[i-1] == 1) {
                ans = ans - a[i];
            } else if (b[i-1] == 2) {
                ans = ans * a[i];
            } else {
                ans = ans / a[i];
            }
        }
        return ans;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[n-1];
        int m = 0;
        for (int i=0; i<4; i++) {
            int cnt = sc.nextInt();
            for (int k=0; k<cnt; k++) {
                b[m++] = i;
            }
        }
        Arrays.sort(b);
        ArrayList<Integer> result = new ArrayList<>();
        do {
            int temp = calc(a, b);
            result.add(temp);
        } while(next_permutation(b));
        Collections.sort(result);
        m = result.size();
        System.out.println(result.get(m-1));
        System.out.println(result.get(0));
    }
}
