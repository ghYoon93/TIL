package no16234;
import java.util.*;
class Pair{
	int x, y;
	Pair(int x, int y){
		this.x = x; this.y = y;
	}
}
public class Main {
    final static int[] dx = {0, 0, 1, -1};
    final static int[] dy = {-1, 1, 0, 0};
    static boolean bfs(int[][] a, int l, int r){
    	int n = a.length;
    	boolean[][] c = new boolean[n][n];
    	for(int i=0; i<n; i++){
    		for(int j=0; j<n; j++){
    			c[i][j] = false;
    		}
    	}
    	boolean ok = false;
    	for(int i=0; i<n; i++){
    		for(int j=0; j<n; j++){
    			if(c[i][j] == false);
    			Queue<Pair> q = new LinkedList<>();
    			q.add(new Pair(i, j));
    			c[i][j] = true;
    			Queue<Pair> s = new LinkedList<>();
    			s.add(new Pair(i, j));
    			int sum = a[i][j];
    			while(!q.isEmpty()){
    				Pair p = q.remove();
    				int x = p.x;
    				int y = p.y;
    				for(int k=0; k<4; k++){
    					int nx = x+dx[k];
    					int ny = y+dy[k];
    					if(nx<0 || nx>=n || ny<0 || ny>=n) continue;
    					if(c[nx][ny]) continue;
    					int diff = Math.abs(a[nx][ny] - a[x][y]);
    					if(diff <l || diff>r) continue;
    					q.add(new Pair(nx, ny));
    					s.add(new Pair(nx, ny));
    					c[nx][ny] = true;
    					ok = true;
    					sum += a[nx][ny];
    				}
    			}
    			
    			int val = sum/(s.size());
    			while(!s.isEmpty()){
    				Pair p = s.remove();
    				int x = p.x;
    				int y = p.y;
    				a[x][y] = val;
    			}
    		}
    	}
    	return ok;
    }
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int l = sc.nextInt();
    	int r = sc.nextInt();
    	
    	int[][] a = new int[n][n];
    	for(int i=0; i<n; i++){
    		for(int j=0; j<n; j++){
    			a[i][j] = sc.nextInt();
    		}
    	}
    	int ans = 0;
    	while(true){
    		if(bfs(a, l, r)){
    			ans+=1;
    		}else{
    			break;
    		}
    	}
    	System.out.println(ans);
    }
}
