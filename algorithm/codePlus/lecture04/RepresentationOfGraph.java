package lecture04;

import java.util.*;

public class RepresentationOfGraph {
    public static void main(String[] args){
    	/**
    	 * 정점(Vertex)이 6개 간선(Edge)이 8개
    	 * 정점 {1, 2, 3, 4, 5, 6}
    	 * 간선{{1,2}, {1,5}, {2,3}, {2,4}, {2,5}, {3, 4}, {4, 5}, {4, 6}}
    	 **/
    	/**
    	 * 인접 행렬(Adjacency-matrix)
    	 * 정점의 개수를 V라고 했을 때,
    	 * VXV크기의 이차원 배열을 이용한다. a[i][j] = 1 (i->j 간선이 있을 때), 0(없을 때)
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
    				
    	System.out.println("인접 행렬");
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
    	 * 인접 리스트
    	 * a[i] = i와 연결된 정점을 리스트로 포함
    	 * A[1] 2 5
		 * A[2] 1 3 4 5
		 * A[3] 2 4
		 * A[4] 3 5 2 6
		 * A[5] 1 2 4
		 * A[6] 4
    	 */
    	System.out.println("인접 리스트");
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
    	 * 간선 리스트 (인접 행렬 활용)
    	 * 배열을 이용해서 구현
    	 * 간선을 모두 저장
    	 */
    	System.out.println("간선 리스트");
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
