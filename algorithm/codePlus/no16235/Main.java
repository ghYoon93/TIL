package no16235;

import java.util.*;

public class Main {
	static final int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
	static final int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int m = sc.nextInt();
    	int l = sc.nextInt();
    	
    	int[][] a = new int[n][n];
    	int[][] d = new int[n][n];
    	ArrayList<Integer>[][] tree = new ArrayList[n][n];
    	for(int i=0; i<n; i++){
    		for(int j=0; j<n; j++){
    			a[i][j] = sc.nextInt();
    			d[i][j] = 5;
    			tree[i][j] = new ArrayList<>();
    		}
    	}
    	while(m-->0){
    		int x = sc.nextInt();
    		int y = sc.nextInt();
    		int age = sc.nextInt();
    		tree[x-1][y-1].add(age);
    	}
    	while(l-->0){
    		int[][] p = new int[n][n];
    		for(int i=0; i<n; i++){
    			for(int j=0; j<n; j++){
    				ArrayList<Integer> temp = new ArrayList<>();
    				Collections.sort(tree[i][j]); //나무 나이가 오름차순으로 정렬된다. -> 나이가 어린 나무부터 양분을 먹는다.
    				int dead = 0;
    				for(int x: tree[i][j]){
    					if(x<=d[i][j]){
    						d[i][j] -= x; //나무는 자신의 나이만큼 양분을 먹는다.
    						temp.add(x+1); //나이 +1
    						if((x+1)%5 == 0){
        						for(int k=0; k<0; k++){
        							int nx = i+dx[k];
        							int ny = j+dy[k];
        							if(nx<0 || nx >=n || ny<0 || ny>=n) continue;
        							p[nx][ny] += 1; // 인접한 8개의 칸에 나이가 1인 나무가 생긴다.
        						}
        					}
    					}else{
    						dead += x/2; //죽은 나무 -> 양분
    					}
    				}
    				tree[i][j] = temp;
    				d[i][j] += dead;
    				d[i][j] += a[i][j];
    			}
    		}
    		
    		for(int i=0; i<n; i++){
    			for(int j=0; j<n; j++){
    				for(int k=0; k<p[i][j]; k++){
    					tree[i][j].add(1); //인접한 8개의 칸에 나이가 1인 나무
    				}
    			}
    		}
    	}
    	int ans = 0;
        for(int i=0; i<n; i++){
        	for(int j=0; j<n; j++){
        		ans += (int)tree[i][j].size();
        	}
        }
        System.out.println(ans);
    }
}
