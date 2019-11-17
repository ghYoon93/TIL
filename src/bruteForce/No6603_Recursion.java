package bruteForce;
/**
 * 
 * @author YGH
 * �ζ�
 * ���� �ζǴ� {1, 2, ..., 49}���� �� 6���� ����.
 * �ζ� ��ȣ�� �����ϴµ� ���Ǵ� ���� ������ ������ 
 * 49���� �� �� k(k>6)���� ���� ��� ���� S�� ���� ���� �� ���� ������ ��ȣ�� �����ϴ� ���̴�.
 * ���� ���, k=8, S={1,2,3,5,8,13,21,34}�� ��� �� ���� S���� ���� �� �� �ִ� ����� ���� �� 28�����̴�. 
 * ([1,2,3,5,8,13], [1,2,3,5,8,21], [1,2,3,5,8,34], [1,2,3,5,13,21], ..., [3,5,8,13,21,34])
 * ���� S�� k�� �־����� ��, ���� ���� ��� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * �Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ִ�. 
 * ù ��° ���� k (6 < k < 13)�̰�, ���� k�� ���� ���� S�� ���ԵǴ� ���̴�. S�� ���Ҵ� ������������ �־�����.
 * �Է��� ������ �ٿ��� 0�� �ϳ� �־�����. 
 * �� �׽�Ʈ ���̽����� ���� ���� ��� ����� ����Ѵ�. �̶�, ���� ������ ����Ѵ�.
 * �� �׽�Ʈ ���̽� ���̿��� �� ���� �ϳ� ����Ѵ�.
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
