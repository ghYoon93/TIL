package stage03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class No8393 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int input = Integer.parseInt(br.readLine());
		int sum = 0;
		for(int i = 1; i < input + 1; i++){
			sum += i;
		}
		bw.write(sum + "\n");
		bw.flush();
		bw.close();
		
	}

}
