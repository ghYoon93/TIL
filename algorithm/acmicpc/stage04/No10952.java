package stage04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class No10952 {
     public static void main(String []args) throws IOException{
    	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	 
    	 while(true){
    		 String[] input = br.readLine().split(" ");
    		 int A = Integer.parseInt(input[0]);
    		 int B = Integer.parseInt(input[1]);
    		 if(A == 0 && B == 0){
    			 bw.flush();
    			 bw.close();
    			 break;
    		 }
    		 bw.write((A+B)+"\n");
    	 }
     }
}
