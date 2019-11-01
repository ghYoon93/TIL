package no16235;

import java.io.*;
import java.util.*;

class Tree implements Comparable<Tree>{
	int x, y, age;
	public int compareTo(Tree t){
		return this.age>t.age?1:-1;
	}
}

public class Main{
	static final int[] dx ={-1, -1, -1, 0, 0, 1, 1, 1};
	static final int[] dy ={-1, 0, 1, -1, 1, -1, 0, 1};
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);
		int k = Integer.parseInt(input[2]);

		int[][] map = new int[n][n];
		int[][] robot = new int[n][n];
		for(int i=0; i<n; i++){
			input = br.readLine().split(" ");
			for(int j=0; j<n; j++){
				map[i][j] =5;
				robot[i][j] = Integer.parseInt(input[j]);
			}
		}
		
		PriorityQueue<Tree>[] pq = new PriorityQueue[2];
		int cur=0, next=0;
		for(int i = 0; i<pq.length; i++){
			pq[i] = new PriorityQueue();
		}
		
		

		for(int i=0; i<m; i++){
			input = br.readLine().split(" ");
			Tree t = new Tree();
			t.x = Integer.parseInt(input[0])-1;
			t.y = Integer.parseInt(input[1])-1;
			t.age = Integer.parseInt(input[2]);
			pq[cur].offer(t); //현재 존재 나무들
		}

		int numTree = pq.length;
		for(int i=0; i<k; i++){
			if(numTree == 0) break;
			next = (cur+1)%2;
			Queue<Tree> liveT = new LinkedList<>();
			Queue<Tree> deadT = new LinkedList<>();
			
			//봄
			while(!pq[cur].isEmpty()){
				Tree nT = pq[cur].peek();
				pq[cur].poll();
				
				if(map[nT.x][nT.y] >= nT.age){
					map[nT.x][nT.y] -= nT.age;
					Tree aT = new Tree();
					aT.x = nT.x;
					aT.y = nT.y;
					aT.age = nT.age+1;
					liveT.add(aT);
					pq[next].add(aT);
				}else{
					if(nT.age>=2){
						deadT.add(nT);
					}
				}
			}
			
			//여름
			while(!deadT.isEmpty()){
				Tree nT = deadT.peek();
				deadT.poll();
				map[nT.x][nT.y] += nT.age/2;
			}
			
			//가을
			while(!liveT.isEmpty()){
				Tree nT = liveT.peek();
				liveT.poll();
				if(nT.age%5 == 0){
					for(int d = 0; d<8; d++){
						Tree aT = new Tree();
						aT.x = nT.x + dx[d];
						aT.y = nT.y + dy[d];
						aT.age = 1;
						if(0<=aT.x && aT.x<n && 0<=aT.y && aT.y<n){
							pq[next].add(aT);
						}
					}
				}
			}
			
			//겨울
			for(int r=0; r<n; r++){
				for(int c=0; c<n; c++){
					map[r][c] += robot[r][c];
				}
			}
			cur = next;
			numTree = pq[next].size();
		}
		System.out.println(numTree);
	}
}