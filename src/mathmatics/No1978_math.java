package mathmatics;
/**
 * 
 * @author YGH
 * 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
 * 첫 줄에 수의 개수 N이 주어진다. 
 * N은 100이하이다. 
 * 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.
 * 주어진 수들 중 소수의 개수를 출력한다.
 */
import java.util.*;
public class No1978_math {
	static boolean prime(int x) {
		if(x<2) return false;
		for(int i = 2; i*i <= x; i++) {
			if(x%i==0) return false;
		}
		return true;
	}
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int cnt = 0;
    	for(int i = 0; i<n; i++) {
    		if(prime(sc.nextInt())) cnt++;
    	}
    	System.out.println(cnt);
    }
}
