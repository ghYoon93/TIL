package stage05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class No2920 {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringTokenizer st = null;
    	String answer = "";
    	
    	st = new StringTokenizer(br.readLine());
    	
    	int[] arr = new int[8];
    	
    	for(int i = 0; i < 8; i++){
    		arr[i] = Integer.parseInt(st.nextToken());
    	}
    	int check = arr[0];
    	
    	for(int i = 1; i < 8; i++){
    		check -= arr[i];
    		if(check == -1){
    			answer = "ascending";
    			check = arr[i];
    		}else if(check == 1){
    			answer = "descending";
    			check = arr[i];
    		}else{
    			answer = "mixed";
    			break;
    		}
    	}
    	bw.write(answer);
    	bw.flush();
    	bw.close();
    	
    }
}
