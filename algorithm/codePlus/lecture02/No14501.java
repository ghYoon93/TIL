package lecture02;

import java.util.*;

public class No14501 {
	static ArrayList<Integer> result = new ArrayList<>();
    static void go(int[] t, int[] p, int n, int index,  int pay){
    	//������ ���
    	if(index == n){ //index�� ��� ����
    		result.add(pay);
    		return;
    	}else if(index > n){ //index�� ��� ���� �ʰ� ��
    		return;
    	}
    	//�Ұ����� ���
    	
    	//���� O
    	go(t, p, n, index + t[index], pay + p[index]);
    	//���� X
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
