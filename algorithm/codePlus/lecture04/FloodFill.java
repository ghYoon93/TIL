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
	static int[] dx = {0, 0, 1, -1}; //������ �߿����� ����
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
    	 * ������ȣ���̱�
    	 * ���簢�� ����� ������ �ִ�. (NXN)
    	 * 0�� ���� ���� ��, 1�� �ִ°� (1X1)
    	 * ������ ������ ����� ���� ������ ������ �����ϰ�, ������ ��ȣ�� ���̷��� �Ѵ�.
    	 * ����: �¿� �Ʒ����� ���� �ִ� ���
    	 * ���� ����� ������ ã�� �Ͱ� ����� ����
    	 * 1�� ����, 1�� 1�� ������ִ� ���� �������� ����
    	 * ���� ���, ���� ����Ʈ�� ������ �ʾƵ� �ȴ�.
    	 * DFS�� BFS�� �̿��ؼ� Ȯ��
    	 * d[i][j] = (i, j)�� �湮�������� 0, ������ ���� ��ȣ
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
