package dynamicProgramming;

public class Fibonacci_BottomUp {
	static int[] d = new int[100];
	public static int Fibonacci(int n) {
		d[0] = 0;
		d[1] = 1;
		for(int i =2; i<=n; i++) {
			d[i] = d[i-1] + d[i-2];
		}
		return d[n];
	}
    public static void main(String[] args) {
    	
    }
}
