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
public class No7576 {
	public static final int[] dx = {-1, 0, 1, 0};
	public static final int[] dy = {0, 1, 0, -1};
	
    public static void main(String[] args)throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String[] input = br.readLine().split(" ");
    	int m = Integer.parseInt(input[0]);
    	int n = Integer.parseInt(input[1]);
    	
    	int[][] map = new int[n][m];
    	int[][] dist = new int[n][m];
    	Queue<Pair> q = new LinkedList<Pair>();
    	for(int i=0; i<n; i++){
    		input = br.readLine().split(" ");
    		for(int j=0; j<m; j++){
    			map[i][j] = Integer.parseInt(input[j]);
    			dist[i][j] = -1;
    			if(map[i][j]==1) {
    				q.add(new Pair(i, j));
    				dist[i][j] = 0;
    			}
    		}
    	}
    	while(!q.isEmpty()){
    		Pair p = q.remove();
    		int x = p.x;
    		int y = p.y;
    		for(int k=0; k<4; k++){
    			int nx = x + dx[k];
    			int ny = y + dy[k];
    			if(nx<0 || nx>=n || ny<0 || ny>=m) continue;
    			if(map[nx][ny] != 0 || dist[nx][ny]!=-1) continue;
    			q.add(new Pair(nx, ny));
    			dist[nx][ny] = dist[x][y]+1;
    		}
    	}
    	
    	int day = 0;
    	for(int i=0; i<n; i++){
    		for(int j=0; j<m; j++){
    			if(day < dist[i][j]){
    				day = dist[i][j];
    			}
    		}
    	}
    	
    	for(int i=0; i<n; i++){
    		for(int j=0; j<m; j++){
    			if(map[i][j] != 0 || dist[i][j] != -1) continue;
    			day = -1;
    			
    		}
    	}
    	System.out.println(day);
    }
}
