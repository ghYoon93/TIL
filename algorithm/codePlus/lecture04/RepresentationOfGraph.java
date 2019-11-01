package lecture04;

import java.util.*;

public class RepresentationOfGraph {
    public static void main(String[] args){
    	/**
    	 * ����(Vertex)�� 6�� ����(Edge)�� 8��
    	 * ���� {1, 2, 3, 4, 5, 6}
    	 * ����{{1,2}, {1,5}, {2,3}, {2,4}, {2,5}, {3, 4}, {4, 5}, {4, 6}}
    	 **/
    	/**
    	 * ���� ���(Adjacency-matrix)
    	 * ������ ������ V��� ���� ��,
    	 * VXVũ���� ������ �迭�� �̿��Ѵ�. a[i][j] = 1 (i->j ������ ���� ��), 0(���� ��)
    	 */
    	int v = 6;
    	int e = 8;
    	int[] aVertex = {0, 1, 2, 3, 4, 5};
    	int[][] aEdge = {
    						{0,1}, {0,4},
    						{1,2}, {1,3}, {1,4},
    						{2,3}, 
    						{3,4}, {3,5}
    			
    					};
    				
    	System.out.println("���� ���");
    	int[][] adjMatrix = new int[v][v];
    	for(int i = 0; i < aEdge.length; i++){
    		int from = aEdge[i][0];
    		int to = aEdge[i][1];
    		adjMatrix[from][to] = 1;
    		adjMatrix[to][from] = 1;
    	}
    	for(int i = 0; i < v; i++){
    		for(int j = 0; j < v; j++){
    			System.out.print(adjMatrix[i][j] + " ");
    		}
    		System.out.println();
    	}
    	
    	/**
    	 * ���� ����Ʈ
    	 * a[i] = i�� ����� ������ ����Ʈ�� ����
    	 * A[1] 2 5
		 * A[2] 1 3 4 5
		 * A[3] 2 4
		 * A[4] 3 5 2 6
		 * A[5] 1 2 4
		 * A[6] 4
    	 */
    	System.out.println("���� ����Ʈ");
    	ArrayList<Integer>[] adjList = new ArrayList[v];
    	for(int i = 0; i < v; i++){
    		adjList[i] = new ArrayList<>();
    	}
    	for(int i = 0; i < e; i++){
    		int from = aEdge[i][0];
    		int to = aEdge[i][1];
    		adjList[from].add(to);
    		adjList[to].add(from);
    	}
    	for(int i = 0; i < adjList.length; i++){
    		for(int j = 0; j < adjList[i].size(); j++){
    			System.out.print(adjList[i].get(j)+" ");
    		}
    		System.out.println();
    	}
    	
    	/**
    	 * ���� ����Ʈ (���� ��� Ȱ��)
    	 * �迭�� �̿��ؼ� ����
    	 * ������ ��� ����
    	 */
    	System.out.println("���� ����Ʈ");
    	int[][] edgeList = new int[e*2][2];
    	int m = 0;
    	for(int i = 0; i < v; i++){
    		for(int j = 0; j < v; j++){
    			if(adjMatrix[i][j] == 1){
    				edgeList[m][0] = i;
    				edgeList[m][1] = j;
    				m++;
    			}
    		}
    		
    	}
    	for(int i = 0; i < e*2; i++){
    		for(int j = 0; j < 2; j++){
    			System.out.print(edgeList[i][j]+" ");
    		}
    		System.out.println();
    	}
    }
}
