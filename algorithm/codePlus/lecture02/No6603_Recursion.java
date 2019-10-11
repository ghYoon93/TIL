package lecture02;

import java.util.*;

public class No6603_Recursion {
	static ArrayList<Integer> lotto = new ArrayList<>();
	static void go(int[] s,int index, int cnt){
		// ������ ���
		if(cnt == 6){
			for(int num : lotto){
				System.out.print(num + " ");
			}
			System.out.println();
			return;
		}
		int n = s.length;
		// �Ұ����� ���
		if(n == index) return;
		// ���� ��� ȣ��
		// ���� O
		lotto.add(s[index]);
		go(s, index+1, cnt+1);
		// ���� X
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
