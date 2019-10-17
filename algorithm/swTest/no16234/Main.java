package no16234;

import java.util.*;

class Pair{
	int x;
	int y;
	Pair(int x, int y){
		this.x = x;
		this.y = y;
	}
}
public class Main{
	static int[] dx = {0, 0, 1, -1};
	static int[] dy = {1, -1, 0, 0};
	static int[][] a;
	static int[][] d;
	static int cnt;
	static int ans;
	
	
	static void bfs(int x, int y, int n, int l, int r){
		Queue <Pair> q = new LinkedList<Pair>();
		q.add(new Pair(x, y));
		d[x][y] = cnt;
		
		while(!q.isEmpty()){
			Pair p =q.remove();
			x = p.x;
			y = p.y;
            for(int k=0; k<4; k++){
                int nx = x + dx[k];
                int ny = y + dy[k];
                
                if(0<=nx && nx<n && 0<=ny && ny<n){
                	int check = Math.abs(a[x][y]-a[nx][ny]);
                	if(l<=check && check<=r && d[nx][ny]==0){
                		q.add(new Pair(nx, ny));
                		d[nx][ny] = cnt;
                	}
                }
            }
		}
	}
	
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int l = sc.nextInt();
	    int r = sc.nextInt();
	    a = new int[n][n];
	    for(int i = 0; i<n; i++){
	    	for(int j=0; j<n; j++){
	    		a[i][j] = sc.nextInt();
	    	}
	    }
	    boolean check = true;
	    do{
	    	cnt = 0;
	    	d = new int[n][n];
		    for(int i=0; i<n; i++){
		    	for(int j=0; j<n; j++){
		    		if(d[i][j] == 0){
		    			cnt++;
		    			bfs(i, j, n, l, r);
		    		}
		    	}
		    }
		    System.out.format("cnt = %d\n", cnt);
		    int[] group = new int[cnt+1];
		    for(int i=0; i<n; i++){
		    	for(int j=0; j<n; j++){
		    		group[d[i][j]]++;
		    	}
		    }
		    
		    int[] move = new int[cnt+1];
		    for(int i=0; i<n; i++){
		    	for(int j=0; j<n; j++){
		    		move[d[i][j]] += a[i][j];
		    	}
		    }
		    
		    for(int i=1; i<=cnt; i++){	
		    	move[i] = move[i] / group[i];
		    }
		    
		    for(int i=0; i<n; i++){
		    	for(int j=0; j<n; j++){
		    		a[i][j] = move[d[i][j]];	
		    	}
		    }
		    ans++;
		    if(cnt == n*n){
		    	ans--;
		    	check = false;
		    }
	    }while(check);
	    System.out.println(ans);
	}
}