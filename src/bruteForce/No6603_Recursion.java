package bruteForce;
/**
 * 
 * @author YGH
 * 로또
 * 독일 로또는 {1, 2, ..., 49}에서 수 6개를 고른다.
 * 로또 번호를 선택하는데 사용되는 가장 유명한 전략은 
 * 49가지 수 중 k(k>6)개의 수를 골라 집합 S를 만든 다음 그 수만 가지고 번호를 선택하는 것이다.
 * 예를 들어, k=8, S={1,2,3,5,8,13,21,34}인 경우 이 집합 S에서 수를 고를 수 있는 경우의 수는 총 28가지이다. 
 * ([1,2,3,5,8,13], [1,2,3,5,8,21], [1,2,3,5,8,34], [1,2,3,5,13,21], ..., [3,5,8,13,21,34])
 * 집합 S와 k가 주어졌을 때, 수를 고르는 모든 방법을 구하는 프로그램을 작성하시오.
 * 입력은 여러 개의 테스트 케이스로 이루어져 있다. 각 테스트 케이스는 한 줄로 이루어져 있다. 
 * 첫 번째 수는 k (6 < k < 13)이고, 다음 k개 수는 집합 S에 포함되는 수이다. S의 원소는 오름차순으로 주어진다.
 * 입력의 마지막 줄에는 0이 하나 주어진다. 
 * 각 테스트 케이스마다 수를 고르는 모든 방법을 출력한다. 이때, 사전 순으로 출력한다.
 * 각 테스트 케이스 사이에는 빈 줄을 하나 출력한다.
 */
import java.util.*;
public class No6603_Recursion {
	 static ArrayList<Integer> lotto = new ArrayList<>();
	    static void solve(int[] a, int index, int cnt) {
	        if (cnt == 6) {
	            for (int num : lotto) {
	                System.out.print(num + " ");
	            }
	            System.out.println();
	            return;
	        }
	        int n = a.length;
	        if (n == index) return;
	        lotto.add(a[index]);
	        solve(a, index+1, cnt+1);
	        lotto.remove(lotto.size()-1);
	        solve(a, index+1, cnt);
	    }
	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        while (true) {
	            int n = sc.nextInt();
	            if (n == 0) break;
	            int[] a = new int[n];
	            for (int i=0; i<n; i++) {
	                a[i] = sc.nextInt();
	            }
	            solve(a, 0, 0);
	            System.out.println();
	        }
	    }
}
