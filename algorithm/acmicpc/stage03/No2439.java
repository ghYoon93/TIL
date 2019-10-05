package stage03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class No2439 {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int T = Integer.parseInt(br.readLine());
    	
    	for(int i = 0 ; i < T; i++){
    		for(int j = 1; j < T - i; j++ ){
    			bw.write(" ");
    		}
    		for(int j = 0; j < i + 1; j++){
    			bw.write("*");
    		}
    		bw.write("\n");
    	}
    	bw.flush();
    	bw.close();
    }
}
