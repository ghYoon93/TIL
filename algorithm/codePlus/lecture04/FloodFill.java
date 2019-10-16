package lecture04;

import java.util.*;

class Pair{
	int x; 
	int y;
	Pair(int x, int y){
		this.x = x;
		this.y = y;
	}
}
public class FloodFill {
	static int[][] d;
	static int[][] a;
	static int[] dx = {0, 0, 1, -1}; //순서는 중요하지 않음
	static int[] dy = {1, -1, 0, 0};
	static void bfs(int x, int y, int cnt, int n){
    	Queue<Pair> q = new LinkedList<Pair>();
    	q.add(new Pair(x, y));
    	d[x][y] = cnt; //(x, y) => (nx, ny)
    	
    	while(!q.isEmpty()){
    		Pair p = q.remove();
    		x = p.x;
    		y = p.y;
    		for(int k = 0; k<4; k++){
    			int nx = x + dx[k];
    			int ny = y + dy[k];
    			if(0<=nx && nx<n && 0<=ny && ny<n){
    				if(a[nx][ny] == 1 && d[nx][ny] == 0){
    					q.add(new Pair(nx, ny));
    					d[nx][ny] = cnt;
    				}
    			}
    		}
    	}
    }
	
	public static void main(String[] args){
    	/**
    	 * 단지번호붙이기
    	 * 정사각형 모양의 지도가 있다. (NXN)
    	 * 0은 집이 없는 곳, 1은 있는곳 (1X1)
    	 * 지도를 가지고 연결된 집의 모임인 단지를 정의하고, 단지에 번호를 붙이려고 한다.
    	 * 연결: 좌우 아래위로 집이 있는 경우
    	 * 연결 요소의 개수를 찾는 것과 상당히 유사
    	 * 1을 정점, 1과 1이 연결되있는 것을 간선으로 생각
    	 * 인접 행렬, 인접 리스트를 만들지 않아도 된다.
    	 * DFS나 BFS를 이용해서 확인
    	 * d[i][j] = (i, j)를 방문안했으면 0, 했으면 단지 번호
    	 */
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		a = new int[n][n];
		for(int i = 0; i<n; i++){
			String[] line = sc.nextLine().split("");
			for(int j = 0; j<n; j++){
				a[i][j] = Integer.parseInt(line[j]);
			}
		}
		
		int cnt = 0;
		
		d = new int[n][n];
		for(int i = 0; i<n; i++){
			for(int j = 0; j<n; j++){
				if(a[i][j]==1 && d[i][j] == 0){
					bfs(i, j, ++cnt, n);
				}
			}
		}
		int[] ans = new int[cnt];
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(d[i][j]!=0){
					ans[d[i][j]-1] +=1;
				}
			}
		}
		Arrays.sort(ans);
		System.out.println(cnt);
		for(int i=0; i<cnt; i++){
			System.out.println(ans[i]);
		}
    }
    
}
