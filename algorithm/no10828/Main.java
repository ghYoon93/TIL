package no10828;
/**
 * 
 * @author YGH
 * ������ �����ϴ� ������ ����#�� ����, �Է����� �־����� ���#�� ó���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * push X: ���� X�� ���ÿ� �ִ� �����̴�.#
 * pop: ���ÿ��� ���� ���� �ִ� ������ ����,# �� ���� ����Ѵ�.# ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.#
 * size: ���ÿ� ����ִ� ������ ������ ����Ѵ�.#
 * empty: ������ ��������� 1,# �ƴϸ� 0�� ����Ѵ�.#
 * top: ������ ���� ���� �ִ� ������ ����Ѵ�.# ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.#
 * ù° �ٿ� �־����� ����� �� N (1 �� N �� 10,000)�� �־�����.# ��° �ٺ��� N���� �ٿ��� ����� �ϳ��� �־�����.# 
 * �־����� ������ 1���� ũ�ų� ����, 100,000���� �۰ų� ����.# ������ �������� ���� ����� �־����� ���� ����.#
 * ����ؾ��ϴ� ����� �־��� ������, �� �ٿ� �ϳ��� ����Ѵ�.#
 */
import java.util.*;
public class Main {
    static int N;
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	N = sc.nextInt(); // ����� �� N (1 �� N �� 10,000)
    	//System.out.println(N);
    	sc.nextLine();
    	Stack<Integer> s = new Stack<Integer>(); // ������ �����ϴ� ������ ����
    	while(N-->0){
    		//System.out.println(N);
    		String[] input = sc.nextLine().split(" ");
    		String cmd = input[0]; // �Է����� �־����� ���
    		switch(cmd){
    		case "push":
    			int num = Integer.parseInt(input[1]);
    			s.push(num);
    			//System.out.println(cmd);
    			break;
    		case "pop":
    			if(!s.isEmpty()){
    				int pop = s.pop(); // ���ÿ��� ���� ���� �ִ� ������ ����
        			System.out.println(pop); // �� ���� ����Ѵ�.
        			//System.out.println(cmd);
    			}else{
    				System.out.println(-1); // ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
    				//System.out.println(cmd);
    			}
    			
    			break;
    		case "size":
    			//System.out.println(cmd);
    			System.out.println(s.size()); // ���ÿ� ����ִ� ������ ������ ����Ѵ�.
    			break;
    		case "empty":
    			if(s.isEmpty()){
    				//System.out.println(cmd);
    				System.out.println(1); // ������ ��������� 1, 
    			}else{
    				//System.out.println(cmd);
    				System.out.println(0); // �ƴϸ� 0�� ����Ѵ�.
    			}
    			break;
    		case "top":
    			if(!s.isEmpty()){
    				//System.out.println(cmd);
    				int top = s.peek();
    				System.out.println(top); // ������ ���� ���� �ִ� ������ ����Ѵ�. 
    			}else{
    				//System.out.println(cmd);
    				System.out.println(-1); // ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
    			}
    			break;
    		}
    	}
    }
}
