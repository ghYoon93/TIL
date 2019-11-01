package stage05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class No2562 {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int input = 9;
		int max = 0;
		int max_index = 0;
		for(int i = 0; i < input; i++){
			int number = Integer.parseInt(br.readLine());
			if( number > max){
				max = number;
				max_index = i+1;
			}
		}
		bw.write(max + "\n" + max_index);
		bw.flush();
		bw.close();
	}

}
