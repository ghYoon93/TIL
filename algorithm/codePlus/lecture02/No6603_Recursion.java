package lecture02;

import java.util.*;

public class No6603_Recursion {
	static ArrayList<Integer> lotto = new ArrayList<>();
	static void go(int[] s,int index, int cnt){
		// 정답인 경우
		if(cnt == 6){
			for(int num : lotto){
				System.out.print(num + " ");
			}
			System.out.println();
			return;
		}
		int n = s.length;
		// 불가능한 경우
		if(n == index) return;
		// 다음 경우 호출
		// 포함 O
		lotto.add(s[index]);
		go(s, index+1, cnt+1);
		// 포함 X
		lotto.remove(lotto.size()-1);
		go(s, index+1, cnt);
	}
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	while(true){
    		int k = sc.nextInt();
    		if(k == 0) break;
    		int[] s = new int[k];
    		for(int i = 0; i<k; i++){
    			s[i] = sc.nextInt();
    		}
    		go(s, 0, 0);
    		System.out.println();
    	}
    }
}
