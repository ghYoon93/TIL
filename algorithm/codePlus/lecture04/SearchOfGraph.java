package lecture04;

import java.util.*;


class Search{
	public void dfsMatrix(boolean[] check, boolean[][]adjMatrix, int x, int z){
		z++;
		/**
	     * 깊이 우선 탐색(Depth First Search)
	     * 스택을 이용해서 갈 수 있는 만큼 최대한 가고
	     * 갈 수 없으면 이전 정점으로 돌아간다.	
	     */
		//인접 행렬을 이용한 구현
		int n = check.length;
		check[x] = true;
		System.out.println(x);
		for(int i = 0; i < n; i++){
			if(adjMatrix[x][i] && !check[i]){
				dfsMatrix(check, adjMatrix, i, z);
			}
		}
	}

	public void dfsList(boolean[] check, ArrayList<Integer>[] adjList, int x, int z){
		z++;
		/**
	     * 깊이 우선 탐색(Depth First Search)
	     * 스택을 이용해서 갈 수 있는 만큼 최대한 가고
	     * 갈 수 없으면 이전 정점으로 돌아간다.	
	     */
		//인접 행렬을 이용한 구현
		int n = adjList[x].size();
		check[x] = true;
		System.out.println(x);
		for(int i = 0; i < n; i++){
			int y = adjList[x].get(i);
			if(!check[y]){
				dfsList(check, adjList, y, z);
			}
		}
	}
}

public class SearchOfGraph {
	
    public static void main(String[] args){
    	int z = 0;
    	int v = 6;
    	int e = 8;
    	int[] aVertex = {0, 1, 2, 3, 4, 5};
    	ArrayList<Edge> aEdge = new ArrayList<Edge>();
		aEdge.add(new Edge(0, 1));
		aEdge.add(new Edge(0, 4));
		aEdge.add(new Edge(1, 2));
		aEdge.add(new Edge(1, 3));
		aEdge.add(new Edge(1, 4));
		aEdge.add(new Edge(2, 3));
		aEdge.add(new Edge(3, 4));
		aEdge.add(new Edge(3, 5));
		
		ArrayList<Integer>[] adjList = new ArrayList[v];
		for(int i = 0; i<v; i++){
			adjList[i] = new ArrayList<>();
		}
		for(int i=0; i<e; i++){
			int from = aEdge.get(i).from;
			int to = aEdge.get(i).to;
			adjList[from].add(to);
			adjList[to].add(from);
		}
		
    	boolean[][] adjMatrix = new boolean[v][v];
    	boolean[] check = new boolean[v];
    	
    	for(int i = 0; i<e; i++){
    		int from = aEdge.get(i).from;
    		int to = aEdge.get(i).to;
    		adjMatrix[from][to] = adjMatrix[from][to] = true;
    	}
    	
    	Search test1 = new Search();
    	Search test2 = new Search();
    	for(int i = 0; i <v; i++){
    		System.out.println(check[i]);
    	}
        test1.dfsMatrix(check, adjMatrix, 0, z);
    	System.out.println();
    	for(int i = 0; i <v; i++){
    		System.out.println(check[i]);
    	}
    	System.out.println(z);
    	test2.dfsList(check, adjList, 0, z);
    }
}
