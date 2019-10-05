package stage03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class No11022 {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int T = Integer.parseInt(br.readLine());
    	for(int i = 0; i < T; i ++){
    		String input = br.readLine();
    		String[] arr = input.split(" ");
    		int A = Integer.parseInt(arr[0]);
    		int B = Integer.parseInt(arr[1]);
    		
    		System.out.format("Case #%d: %d + %d = %d\n", (i+1), A, B, (A+B));
    	}
    	
    }
}
