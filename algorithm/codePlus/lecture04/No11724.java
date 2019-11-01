package lecture04;

import java.util.*;

public class No11724 {
	static ArrayList<Integer>[] a;
	static boolean[] c;
	
	static void dfs(int x){
		if(c[x]){
			return;
		}
		c[x] = true;
		for(int y : a[x]){
			if(c[y] == false){
				dfs(y);
			}
		}
	}
	
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int m = sc.nextInt();
    	a = new ArrayList[n+1];
    	for(int i = 0; i<=n; i++){
    		a[i] = new ArrayList<Integer>();
    	}
    	for(int i = 0; i<m; i++){
    		int u = sc.nextInt();
    		int v = sc.nextInt();
    		a[u].add(v);
    		a[v].add(u);
    	}
    	c = new boolean[n+1];
    	int ans = 0;
    	for(int i = 1; i<=n; i++){
    		if(c[i]==false){
    			dfs(i);
    			ans += 1;
    		}
    	}
    	System.out.println(ans);
    	
    }
}
