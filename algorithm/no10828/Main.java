package no10828;
/**
 * 
 * @author YGH
 * 정수를 저장하는 스택을 구현#한 다음, 입력으로 주어지는 명령#을 처리하는 프로그램을 작성하시오.
 * push X: 정수 X를 스택에 넣는 연산이다.#
 * pop: 스택에서 가장 위에 있는 정수를 빼고,# 그 수를 출력한다.# 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.#
 * size: 스택에 들어있는 정수의 개수를 출력한다.#
 * empty: 스택이 비어있으면 1,# 아니면 0을 출력한다.#
 * top: 스택의 가장 위에 있는 정수를 출력한다.# 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.#
 * 첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다.# 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다.# 
 * 주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다.# 문제에 나와있지 않은 명령이 주어지는 경우는 없다.#
 * 출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.#
 */
import java.util.*;
public class Main {
    static int N;
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	N = sc.nextInt(); // 명령의 수 N (1 ≤ N ≤ 10,000)
    	//System.out.println(N);
    	sc.nextLine();
    	Stack<Integer> s = new Stack<Integer>(); // 정수를 저장하는 스택을 구현
    	while(N-->0){
    		//System.out.println(N);
    		String[] input = sc.nextLine().split(" ");
    		String cmd = input[0]; // 입력으로 주어지는 명령
    		switch(cmd){
    		case "push":
    			int num = Integer.parseInt(input[1]);
    			s.push(num);
    			//System.out.println(cmd);
    			break;
    		case "pop":
    			if(!s.isEmpty()){
    				int pop = s.pop(); // 스택에서 가장 위에 있는 정수를 빼고
        			System.out.println(pop); // 그 수를 출력한다.
        			//System.out.println(cmd);
    			}else{
    				System.out.println(-1); // 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    				//System.out.println(cmd);
    			}
    			
    			break;
    		case "size":
    			//System.out.println(cmd);
    			System.out.println(s.size()); // 스택에 들어있는 정수의 개수를 출력한다.
    			break;
    		case "empty":
    			if(s.isEmpty()){
    				//System.out.println(cmd);
    				System.out.println(1); // 스택이 비어있으면 1, 
    			}else{
    				//System.out.println(cmd);
    				System.out.println(0); // 아니면 0을 출력한다.
    			}
    			break;
    		case "top":
    			if(!s.isEmpty()){
    				//System.out.println(cmd);
    				int top = s.peek();
    				System.out.println(top); // 스택의 가장 위에 있는 정수를 출력한다. 
    			}else{
    				//System.out.println(cmd);
    				System.out.println(-1); // 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    			}
    			break;
    		}
    	}
    }
}
