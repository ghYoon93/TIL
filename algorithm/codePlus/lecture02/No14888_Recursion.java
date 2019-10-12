package lecture02;

import java.util.*;

class Pair {
    public int min, max;
    Pair(int min, int max) {
        this.min = min;
        this.max = max;
    }
}

public class No14888_Recursion {
	
	static Pair go(int[] a, int n, int plus, int minus, int mul, int div, int index, int cur){
		if(index == n){
			return new Pair(cur, cur);
		}
		ArrayList<Pair> res = new ArrayList<>();
		if(plus > 0){
		    res.add(go(a, n, plus-1, minus, mul, div, index+1, cur+a[index]));
		}
		if(minus > 0){
		    res.add(go(a, n, plus, minus-1, mul, div, index+1, cur-a[index]));
		}
		if(mul > 0){
			res.add(go(a, n, plus, minus, mul-1, div, index+1, cur*a[index]));	
		}
		if(div > 0){
			res.add(go(a, n, plus, minus, mul, div-1, index+1, cur/a[index]));
		}
		Pair ans = res.get(0);
		for(Pair p : res){
			if(ans.max < p.max){
				ans.max = p.max;
			}
			if(ans.min > p.min){
				ans.min = p.min;
			}
		}
		return ans;
	}
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int[] a = new int[n];
    	int[] b = new int[4];
    	int m = 0;
        for(int i = 0; i<n; i++){
        	a[i] = sc.nextInt();
        }
        int plus = sc.nextInt();
        int minus = sc.nextInt();
        int mul = sc.nextInt();
        int div = sc.nextInt();
        
        Pair ans = go(a, n, plus, minus, mul, div, 1, a[0]);
        System.out.println(ans.max);
        System.out.println(ans.min);
    }
}
