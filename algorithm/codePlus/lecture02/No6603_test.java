package lecture02;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class No6603_test {
	static boolean nextPermutation(int[] a, int k){
		int i = k-1;
		while(i>0 && a[i-1] >= a[i]) i--;
		if(i<=0){
			return false;
		}
		
		int j = k-1;
		while(a[j] <= a[i-1]) j--;
		int temp = a[j];
		a[j] = a[i-1];
		a[i-1] = temp;
		
		j = k-1;
		while(i<j){
			temp = a[j];
			a[j] = a[i];
			a[i] = temp;
			i++;
			j--;
		}
		return true;
	}
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        while(true){
        	int k = sc.nextInt();
        	if(k == 0){
        		break;
        	}
        	int[] a = new int[k];
        	for(int i = 0; i < k; i++){
        		a[i] = sc.nextInt();
        	}
        	int[] d = new int[k];
        	for(int i = 0; i < k; i++){
        		if(i <k-6) d[i] = 0;
        		else d[i] = 1;
        	}
        	ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        	do{
        		ArrayList<Integer> cur = new ArrayList<>();
        		for(int i = 0; i < k; i++){
        			if(d[i] == 1){
        				cur.add(a[i]);
        			}
        		}
        		ans.add(cur);
        	}while(nextPermutation(d, k));
        	
        	for(ArrayList<Integer> v : ans){
        		for(int x : v){
        			System.out.print(x + " ");
        		}
        		System.out.println();
        	}
        	System.out.println();
        	
        	Collections.sort(ans, new Comparator<ArrayList<Integer>>() {
                public int compare(ArrayList<Integer> l1, ArrayList<Integer> l2) {
                    int n = l1.size();
                    int m = l2.size();
                    System.out.format("l1.size() = %d \n",n);
                    System.out.format("l2.size() = %d \n\n",m);
                    
                	System.out.format("l1 = [%d, %d, %d, %d, %d, %d]\n", l1.get(0),l1.get(1),l1.get(2),l1.get(3),l1.get(4),l1.get(5));
                	System.out.format("l2 = [%d, %d, %d, %d, %d, %d]\n", l2.get(0),l2.get(1),l2.get(2),l2.get(3),l2.get(4),l2.get(5));
                    
                    int i = 0;
                    while (i < n && i < m) {
                        int t1 = l1.get(i);
                        int t2 = l2.get(i);
                        System.out.format("l1.get(%d) = %d \n",i, l1.get(i));
                        System.out.format("l2.get(%d) = %d \n",i, l2.get(i));
                        if (t1 < t2) {
                        	System.out.println("return -1");
                        	return -1;
                        }
                        else if (t1 > t2) {
                        	System.out.println("return 1");
                        	return 1;
                        }
                        i += 1;
                    }
                    if (i == n && i != m) {
                    	System.out.println("return -1");
                    	return -1;
                    }
                    else if (i != n && i == m) {
                    	System.out.println("return 1");
                    	return 1;
                    }
                    System.out.println("return 0");
                    return 0;
                }
            });
            for (ArrayList<Integer> v : ans) {
                for (int x : v) {
                    System.out.print(x + " ");
                }
                System.out.println();
            }
            System.out.println();
        	
        	
        }
    }
}
