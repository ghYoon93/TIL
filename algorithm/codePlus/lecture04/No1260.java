package lecture04;

import java.util.*;

public class No1260 {
	static ArrayList<Integer>[] a;
	static boolean[] c;
	static void dfs(int v){
		if(c[v]){
			return;
		}
		c[v] = true;
		System.out.print(v + " ");
		for(int y : a[v]){
			if(c[y] == false){
				dfs(y);
			}
		}
	}
	static void bfs(int v){
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(v);
		c[v] = true;
		while(!q.isEmpty()){
			int x = q.remove();
			System.out.print(x + " ");
			for(int y: a[x]){
				if(c[y] == false){
					c[y] = true;
					q.add(y);
				}
			}
		}
	}
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt(); //정점의 개수
    	int m = sc.nextInt(); //간선의 개수
    	int v = sc.nextInt(); //탐색을 시작할 정점의 번호
    	
    	a = new ArrayList[n+1];
    	for(int i = 1; i<=n; i++){
    		a[i] = new ArrayList<Integer>();
    	}
    	
    	for(int i = 0; i < m; i++){
    		int from = sc.nextInt();
    		int to = sc.nextInt();
    		a[from].add(to);
    		a[to].add(from);
    	}
    	for(int i = 1; i <= n; i++){
    		Collections.sort(a[i]);
    	}
    	c = new boolean[n+1];
    	dfs(v);
    	System.out.println();
    	c = new boolean[n+1];
    	bfs(v);
    }
}
