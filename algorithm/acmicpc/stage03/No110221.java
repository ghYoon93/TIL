package stage03;

import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class No110221 {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int T = Integer.parseInt(br.readLine());
    	
    	for(int i = 0; i < T; i++){
    		String input = br.readLine();
    		String[] arr = input.split(" ");
    		int A = Integer.parseInt(arr[0]);
    		int B = Integer.parseInt(arr[1]);
    		bw.write("Case #"+(i+1)+": " + (A + B)+"\n");
    	}
    	bw.flush();
    	bw.close();
    }
}
