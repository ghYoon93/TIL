package lecture02;

import java.util.*;

public class No14501 {
	static ArrayList<Integer> result = new ArrayList<>();
    static void go(int[] t, int[] p, int n, int index,  int pay){
    	//정답인 경우
    	if(index == n){ //index가 퇴사 당일
    		result.add(pay);
    		return;
    	}else if(index > n){ //index가 퇴사 당일 초과 시
    		return;
    	}
    	//불가능한 경우
    	
    	//포함 O
    	go(t, p, n, index + t[index], pay + p[index]);
    	//포함 X
    	go(t, p, n, index + 1, pay);
    }
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int[] t = new int[n];
    	int[] p = new int[n];
    	for(int i = 0; i<n; i++){
    		t[i] = sc.nextInt();
    		p[i] = sc.nextInt();
    	}
    	go(t, p, n, 0, 0);
    	Collections.sort(result);
    	System.out.println(result.get(result.size()-1));
    }
}
