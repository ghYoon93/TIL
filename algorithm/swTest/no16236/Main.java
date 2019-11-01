package no16236;

import java.util.*;
import java.io.*;

class Pair{
	int x, y;
	Pair(int x, int y){
		this.x = x;
		this.y = y;
	}
}

class Shark{
	int x, y, size, cnt;
	public Shark(int x, int y, int size, int cnt){
		this.x = x;
		this.y = y;
		this.size = size;
		this.cnt = cnt;
	}
}

class Fish implements Comparable<Fish>{
	int x, y, distance;
	Fish(int distance, int x, int y){
		this.distance = distance;
		this.x = x;
		this.y = y;
	}
	
	public int compareTo(Fish f){
		if(this.distance>f.distance){
			return 1;
		}else if(this.distance<f.distance){
			return -1;
		}else{
			if(this.x>f.x){
				return 1;
			}else if(this.x<f.x){
				return -1;
			}else{
				if(this.y>f.y){
					return 1;
				}else if(this.y<f.y){
					return -1;
				}
				return 0;
			}
		}
	}
}

public class Main {
    static int[] dx = {-1, 0, 0, 1};
    static int[] dy = {0, 1, -1, 0};
    static Shark shark;

    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String[] input = br.readLine().split(" ");
    	int n = Integer.parseInt(input[0]);
    	int[][] map = new int[n][n];
    	
    	
    	for(int i=0; i<n; i++){
    		input = br.readLine().split(" ");
    		for(int j=0; j<n; j++){
    			if(Integer.parseInt(input[j])<9){
    				map[i][j] = Integer.parseInt(input[j]);	
    			}else{
    				map[i][j] = 0;
    				shark = new Shark(i, j, 2, 0);
    			}
    			
    		}
    	}
    	int time = 0;
    	while(true){
    		int[][] dist = new int[n][n];
        	for(int i=0; i<n; i++){
        		for(int j=0; j<n; j++){
        			dist[i][j] = -1;
        		}
        	}
        	//System.out.format("shark.x = %d shark.y = %d \n", shark.x, shark.y);
        	dist[shark.x][shark.y] = 0;
        	Queue<Pair> q = new LinkedList<>();
        	q.add(new Pair(shark.x, shark.y));
        	PriorityQueue<Fish> pq = new PriorityQueue<>();
        	
        	while(!q.isEmpty()){
        		Pair p = q.remove();
        		int x = p.x;
        		int y = p.y;
        		
        		for(int k=0; k<4; k++){
        			//System.out.format("k = %d\n", k);
        			int nx = x + dx[k];
        			int ny = y + dy[k];
        			if(0>nx || nx>=n || 0>ny || ny>=n) continue;
        			//System.out.println("범위 안");
        			//System.out.format("dist[%d][%d] = %d\n", nx, ny, dist[nx][ny]);
        			if(dist[nx][ny] != -1) continue;
        			//System.out.println("방문 x");
        			if(map[nx][ny]>shark.size) continue;
        			//System.out.println("크기 작음");
        			dist[nx][ny] = dist[x][y]+1;
        			//System.out.println("q add");
        			q.add(new Pair(nx, ny));
        			//System.out.format("map[%d][%d] = %d, shark.size = %d\n", nx, ny, map[nx][ny], shark.size);
        			if(map[nx][ny]<shark.size && map[nx][ny] != 0){
        				//System.out.println("pq add");
        				pq.add(new Fish(dist[nx][ny], nx, ny));
        			}
        		}	
        	}
        	
        	if(pq.isEmpty()) break;
        	//System.out.println("Not empty");
        	map[shark.x][shark.y] = 0;
    		Fish f = pq.remove();
    		time += f.distance;
    		shark.x = f.x;
    		shark.y = f.y;
    		shark.cnt ++;
    		map[shark.x][shark.y] = 9;
    		if(shark.cnt == shark.size){
    			shark.size++;
    			shark.cnt = 0;
    		}
    	}
    	System.out.println(time);

    }
}
