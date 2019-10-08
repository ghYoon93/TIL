package lecture01;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class No9613 {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	int T = Integer.parseInt(br.readLine());
    	for(int i = 0; i < T; i ++){
    		long sum = 0;
    		String[] arr = br.readLine().split(" ");
    		for(int j = 1; j < arr.length - 1; j++){
    			for(int k = j + 1; k < arr.length; k++){
    				int A = Integer.parseInt(arr[j]);
    				int B = Integer.parseInt(arr[k]);
    				while(B != 0){
    					int r = A%B;
    					A = B;
    					B = r;
    				}
    				sum += A;
    			}
    		}
    		bw.write(sum + "\n");
    	}
    	bw.flush();
    	bw.close();
    }
}
