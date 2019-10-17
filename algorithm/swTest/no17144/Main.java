package no17144;

import java.util.*;
import java.io.*;

class Pair{
	int x, y;
    Pair(int x, int y){
    	this.x = x;
    	this.y = y;
    }
}

public class Main {
	static int[] dx = {0, -1, 0, 1};
	static int[] dy = {1, 0, -1, 0};
	static int[] dx2 = {0, 1, 0, -1};
	static int[] dy2 = {1, 0, -1, 0};
	
	
	
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String[] input = br.readLine().split(" ");
    	int r = Integer.parseInt(input[0]);
    	int c = Integer.parseInt(input[1]);
    	int t = Integer.parseInt(input[2]);
    	
    	Pair[] aircond = new Pair[2];
    	int[][] a = new int[r][c];
    	for(int i=0; i<r; i++){
    		input = br.readLine().split(" ");
    		for(int j=0; j<c; j++){
    			a[i][j] = Integer.parseInt(input[j]);
    			if(a[i][j] == -1){
    				if(aircond[0] == null){
    					aircond[0] = new Pair(i, j);
    				}else{
    					aircond[1] = new Pair(i, j);
    				}
    				
    			}
    		}
    	}
    	
    	int ans = 0;
    	while(t-->0){
    		ans = 0;
    		int[][] tmp = new int[r][c];
    		// 미세먼지 확산
    		for(int i=0; i<r; i++){
    			for(int j=0; j<c; j++){
    				if(a[i][j] < 5){
    					tmp[i][j] += a[i][j];
    					continue;
    				}
    				
    				Queue<Pair> q = new LinkedList<>();
    				for(int k=0; k<4; k++){
        				int x = i + dx[k];
        				int y = j + dy[k];
        				if(x<0 || x>=r || y<0 || y>=c) continue;
        				if(a[x][y] == -1) continue;
        				q.add(new Pair(x, y));
        			}
    				int cnt = q.size();
    				tmp[i][j] += a[i][j]-(a[i][j]/5)*cnt;
    				while(!q.isEmpty()){
    					Pair p = q.remove();
    					int x = p.x;
    					int y = p.y;
    					tmp[x][y] += a[i][j]/5;
    				}
    			}	
    		}
    		/**
    		for(int i=0; i<r; i++){
    			for(int j=0; j<c; j++){
    				System.out.print(tmp[i][j] + " ");
    			}
    			System.out.println();
    		}
    		System.out.println();
    		**/
    		//바람 순환
    		int x = aircond[0].x;
    		int y = aircond[0].y;
    		int dir = 0, swap = 0;
    		boolean check = true;
    		while(dir < 4){
    		    int nx = x + dx[dir];
    		    int ny = y + dy[dir];
    		    if(nx<0 || nx>=r || ny<0 || ny>=c){
    		    	if(!check) break;
    		    	dir++;
    		    	check = false;
    		    	continue;
    		    }
    		    if(tmp[nx][ny] == -1){
    		    	break;
    		    }
    		    int temp = swap;
    		    swap = tmp[nx][ny];
    		    tmp[nx][ny] = temp;
    		    check = true;
    		    x = nx;
    		    y = ny;
    		}
    		
    		
    		x = aircond[1].x;
    		y = aircond[1].y;
    		dir = 0;
    		swap = 0;
    		check = true;
    		while(dir < 4){
    		    int nx = x + dx2[dir];
    		    int ny = y + dy2[dir];
    		    if(nx<0 || nx>=r || ny<0 || ny>=c){
    		    	if(!check) break;
    		    	dir++;
    		    	check = false;
    		    	continue;
    		    }
    		    if(tmp[nx][ny] == -1){
    		    	break;
    		    }
    		    int temp = swap;
    		    swap = tmp[nx][ny];
    		    tmp[nx][ny] = temp;
    		    check = true;
    		    x = nx;
    		    y = ny;
    		}
    		
    		a = tmp;
    		for(int i=0; i<r; i++){
    			for(int j=0; j<c; j++){
    				if(a[i][j]<0)continue;
    				ans+=a[i][j];
    			}
    		}
    		/**
    		for(int i=0; i<r; i++){
    			for(int j=0; j<c; j++){
    				System.out.print(tmp[i][j] + " ");
    			}
    			System.out.println();
    		}
    		**/
    	}
    	System.out.println(ans);
    }
}
