package stage03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class No10871 {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	String[] input = br.readLine().split(" ");
    	int N = Integer.parseInt(input[0]);
    	int X = Integer.parseInt(input[1]);
    	
    	String[] numbers = br.readLine().split(" ");
    	
    	for(int i = 0; i < N; i++){
    		if(Integer.parseInt(numbers[i]) < X){
    			bw.write(numbers[i]+" ");
    		}
    	}
    	bw.flush();
    	bw.close();
    	
    }
}
