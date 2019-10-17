package no17143;

import java.util.*;
import java.io.*;

class Pair {
	int x, y;
	Pair(int x, int y){
		this.x = x;
		this.y = y;
	}
}
class Shark {
	int x, y, s, d, z;
	Shark(int x, int y, int s, int d, int z){
		this.x = x;
		this.y = y;
		this.s = s;
		this.d = d;
		this.z = z;
	}
}
public class Main {
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static Shark[] sharkInfo = new Shark[10001];
	
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String[] input = br.readLine().split(" ");
    	int r = Integer.parseInt(input[0]);
    	int c = Integer.parseInt(input[1]);
    	int m = Integer.parseInt(input[2]);
    	
    	int[][] map = new int[r+1][c+1];
    	
    	for(int i=0; i<m; i++){
    		input = br.readLine().split(" ");
    		
    	    int x = Integer.parseInt(input[0]);
    		int y = Integer.parseInt(input[1]);
    		int s = Integer.parseInt(input[2]);
    		int d = Integer.parseInt(input[3])-1;
    		int z = Integer.parseInt(input[4]);
    		
    		sharkInfo[z] = new Shark(x, y, s, d, z);
    		map[x][y] = z;
    	}
    	int ans = 0;
    	// 낚시왕 이동
    	for(int i=1; i<=c; i++){
    		// 상어 잡기
    		for(int j= 1; j<=r; j++){
    			if(map[j][i] == 0) continue;
    			sharkInfo[map[j][i]] = null;
    			ans+= map[j][i];
    			break;
    		}
    		
    		// 상어 이동하기
    		for(int j=1; j<=10000;j++){
    			if(sharkInfo[j] == null) continue;
    			Shark cur = sharkInfo[j];
    			int nx = cur.x;
    			int ny = cur.y;
    			int ns = cur.s;
    			int nd = cur.d;
    			int nz = cur.z;
    			map[nx][ny] = 0;
    			
    			switch(nd){
    			case 0:
    			case 1:
    				int tx = nx + (ns)*dx[nd];
    				if(tx < 0){
    					int cnt = Math.abs(tx/r);
    					if(tx%r!=0) cnt++;
    					if(cnt%2!=0) nd = 1;
    					tx = nx+Math.abs(tx%r)*dx[nd];
    				}else if(tx > r){
    					int cnt = Math.abs(tx/r);
    					if(tx%r!=0) cnt++;
    					if(cnt%2!=0) nd = 0;
    					tx =nx+Math.abs(tx%r)*dx[nd];
    				}
    				sharkInfo[nz] = new Shark(tx, ny, ns, nd, nz);
    				break;
    				
    			case 2:
    			case 3:
    				int ty = ny + (ns)*dy[nd];
    				if(ty < 0){
    					int cnt = Math.abs(ty/c);
    					if(ty%c!=0) cnt++;
    					if(cnt%2!=0) nd = 3;
    					ty = ny+Math.abs(ty%c)*dy[nd];
    				}else if(ty > c){
    					int cnt = Math.abs(ty/c);
    					if(ty%c!=0) cnt++;
    					if(cnt%2!=0) nd = 2;
    					ty =ny+Math.abs(ty%c)*dy[nd];
    				}
    				sharkInfo[nz] = new Shark(nx, ty, ns, nd, nz);
    				break;
    			}
    		}
    		
    		for(int j=1; j<=10000; j++){
    			if(sharkInfo[j] == null) continue;
    			Shark cur = sharkInfo[j];
    			System.out.format("size: %d, x: %d, y: %d\n", cur.z, cur.x, cur.y);
    			if(map[cur.x][cur.y]<cur.z){
    				sharkInfo[map[cur.x][cur.y]] = null;
    				map[cur.x][cur.y] = cur.z;
    			}
    		}
    	}
    	System.out.println(ans);
    }
}
