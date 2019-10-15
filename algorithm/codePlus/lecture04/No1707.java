package lecture04;

import java.util.*;

public class No1707 {
	static ArrayList<Integer>[] a;
	static boolean c;
	static int[] color;
	
	static void dfs(int x, int y){
		color[x] = y;
		for(int z:a[x]){
			if(color[z] == 0){
				dfs(z, 3-y);	
			}
		}
		
	}
	
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    			int k = sc.nextInt();
    			while(k-->0){
    				int n = sc.nextInt();
    				int m = sc.nextInt();
    				a = new ArrayList[n+1];
    				c = true;
    				color = new int[n+1];
    				for(int i = 0; i <=n; i++){
    					a[i] = new ArrayList<Integer>();
    				}
    				for(int i = 0; i < m; i++){
    				    int u = sc.nextInt();
    				    int v = sc.nextInt();
    				    a[u].add(v);
    				    a[v].add(u);
    				}
    				for(int i = 1; i<=n; i++){
    					if(color[i] == 0){
    						dfs(i, 1);
    					}
    				}
					for(int i = 1; i<=n; i++){
						for(int j : a[i]){
							if(color[i] == color[j]){
								c = false;
							}
						}
					}
					if(c){
						System.out.println("YES");
					}else{
						System.out.println("NO");
					}
    				
    				
    			}
    }
}
