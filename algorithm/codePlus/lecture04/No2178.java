package lecture04;

import java.util.*;
import java.io.*;
/**
class Pair{
	int x, y;
	Pair(int x, int y){
		this.x = x;
		this.y = y;
	}
}
**/
public class No2178 {
	public static final int[] dx = {-1, 0, 1, 0};
	public static final int[] dy = {0, 1, 0, -1};
	
	public static void bfs(){
		
	}
	
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String[] input = br.readLine().split(" ");
    	int n = Integer.parseInt(input[0]);
    	int m = Integer.parseInt(input[1]);
    	
    	int[][] map = new int[n][m];
    	for(int i=0; i<n; i++){
    		String s = br.readLine();
    		for(int j=0; j<m; j++){
    			map[i][j] = s.charAt(j)-'0';
    		}
    	}
    	boolean[][] check = new boolean[n][m];
    	int[][] dist = new int[n][m];
    	Queue<Pair> q = new LinkedList<Pair>();
    	q.add(new Pair(0, 0));
    	check[0][0] = true;
    	dist[0][0] = 1;
    	while(!q.isEmpty()){
    		Pair p = q.remove();
    		int x = p.x;
    		int y = p.y;
    		for(int k=0; k<4; k++){
    			int nx = x +dx[k];
    			int ny = y +dy[k];
    			if(nx<0 || nx>=n || ny<0 || ny>=m) continue;
    			if(check[nx][ny] || map[nx][ny]!=1) continue;
    			q.add(new Pair(nx,ny));
    			dist[nx][ny] = dist[x][y]+1;
    			check[nx][ny] = true;
    		}
    	}
    	System.out.println(dist[n-1][m-1]);
    }
}
