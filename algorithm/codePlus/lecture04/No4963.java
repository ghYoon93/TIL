package lecture04;

import java.util.*;
/**
class Pair{
	int x, y;
	Pair(int x, int y){
		this.x = x;
		this.y = y;
	}
}
**/
public class No4963 {
	public static final int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
	public static final int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
	
	public static void bfs(int[][] a, int[][] group, int x, int y, int cnt, int n, int m){
	    Queue<Pair> q = new LinkedList<Pair>();
	    q.add(new Pair(x, y));
	    //Pair은 동시에 좌표 이동할 때 사용
	    group[x][y] = cnt;
	    while(!q.isEmpty()){
	    	Pair p = q.remove();
	    	x = p.x;
	    	y = p.y;
	    	for(int k=0; k<8; k++){
	    		int nx = x+dx[k];
	    		int ny = y+dy[k];
	    		if(nx<0 || nx>=n || ny<0 || ny>= m) continue; //지도를 벗어난 경우
	    		if(a[nx][ny] != 1 || group[nx][ny] != 0) continue; //땅이 아니거나 이미 그룹인 경우
	    		q.add(new Pair(nx, ny));
	    		group[nx][ny] = cnt;
	    	}
	    }
	}
	
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	
    	while(true){
    		int m = sc.nextInt();
    		int n = sc.nextInt();
    		if(m==0 && n==0) break;
    		
    		int[][] a = new int[n][m];
    		for(int i=0; i<n; i++){
    			for(int j=0; j<m; j++){
    				a[i][j] = sc.nextInt();
    			}
    		}
    		
    		int cnt = 0;
    		int[][] group = new int[n][m];
    		for(int i=0; i<n; i++){
    			for(int j=0; j<m; j++){
    				if(a[i][j]==1 && group[i][j]==0){
    					bfs(a, group, i, j, ++cnt, n, m);
    				}
    			}
    		}System.out.println(cnt);
    	}
    }
}
