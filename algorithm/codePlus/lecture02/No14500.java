package lecture02;

import java.util.Scanner;

public class No14500 {
    static int[][][] block = {
    		{{0,1}, {0,2}, {0,3}},
    		{{1,0}, {2,0}, {3,0}},
    		{{0,1}, {1,0}, {1,1}},
    		{{1,0}, {2,0}, {2,1}},
    		{{0,1}, {0,2}, {1,0}},
    		{{0,1}, {1,1}, {2,1}},
    		{{0,1}, {0,2}, {-1,2}},
    		{{0,1}, {-1,1}, {-2,1}},
    		{{1,0}, {1,1}, {1,2}},
    		{{0,1}, {1,0}, {2,0}},
    		{{0,1}, {0,2}, {1,2}},
    		{{1,0}, {1,1}, {2,1}},
    		{{0,1}, {1,0}, {1,-1}},
    		{{1,0}, {1,-1}, {2,-1}},
    		{{0,1}, {1,1}, {1,2}},
    		{{0,1}, {0,2}, {1,1}},
    		{{0,1}, {-1,1}, {1,1}},
    		{{0,1}, {-1,1}, {0,2}},
    		{{1,0}, {1,1}, {2,0}}
    };
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int m = sc.nextInt();
    	
    	int[][] paper = new int[n][m];
    	
    	for(int i = 0; i < n; i++){
    		for(int j = 0; j < m; j++){
    			paper[i][j] = sc.nextInt();
    		}
    	}
    	int ans = 0;
    	for(int i = 0; i < n; i++){
    		for(int j = 0; j < m; j++){
    			for(int k = 0; k < 19; k++){
    				boolean check = true;
    				int sum = paper[i][j];
    				for(int l = 0; l <3; l++){
    					int x = i+block[k][l][0];
    					int y = j+block[k][l][1];
    					
    					if((0<=x && x<n)&&(0<=y && y<m)){
    						sum+= paper[x][y];
    					}else{
    						check = false;
    						break;
    					}
    				}
    				if(check && ans < sum){
    					ans = sum;
    				}
    			}
        	}
    	}
    	System.out.println(ans);
    }
}
