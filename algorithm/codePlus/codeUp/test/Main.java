package test;
import java.math.BigInteger;


public class Main {
	public static void main(String[] args){
		BigInteger big = new BigInteger("500000000000");
	    System.out.println(big);
	    big = big.add(BigInteger.valueOf(20));
	    System.out.println(big);
	    String s = "111111111";
	    System.out.println(s.length());
	    BigInteger sum = new BigInteger("0");
	    BigInteger x = new BigInteger("1000001");
	    
	    for(BigInteger i = BigInteger.ONE; i.compareTo(x) < 0; i = i.add(BigInteger.ONE)){
	    	
	    	sum = sum.add(i);
	    }
	    System.out.println(sum);
	    
	    String a = "a";
		String b = new String("a");
		System.out.format("%d", (b=="a")?1:0);
		System.out.println();
		int c = 1;
		int d = 0;
		System.out.println((c+d)/2);
	}
    
    
}
