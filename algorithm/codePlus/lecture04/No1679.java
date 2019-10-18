package lecture04;

import java.util.*;
import java.io.*;

/**
class Pair{
	int x, y;
	Pair(int x, int y){
		this.x = x;
		this.y = y;
	}
}
**/

public class No1679 {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String[] input = br.readLine().split(" ");
    	int n = Integer.parseInt(input[0]);
    	int k = Integer.parseInt(input[1]);
    	
    	Queue<Integer> q = new LinkedList<>();
    	boolean[] check = new boolean[100001];
    	int[] dist = new int[100001];
    	q.add(n);
    	dist[n] = 0;
    	check[n] = true;
    	while(!q.isEmpty()){
    		int x = q.remove();
    		if(x-1 >= 0 && !check[x-1]){
    			q.add(x-1);
    			check[x-1] = true;
    			dist[x-1] = dist[x]+1;
    		}
    		if(x+1 < 100001 && !check[x+1]){
    			q.add(x+1);
    			check[x+1] = true;
    			dist[x+1] = dist[x]+1;
    		}
    		if(x*2 < 100001 && !check[x*2]){
    			q.add(x*2);
    			check[x*2] = true;
    			dist[x*2] = dist[x]+1;
    		}
    	}
    	System.out.println(dist[k]);
    }
}
