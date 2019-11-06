package bruteForce;
/**
 * 
 * @author YGH
 * 1, 2, 3 더하기
 * 정수 4를 1, 2, 3의 합으로 나타내는 방법은 총 7가지가 있다. 
 * 합을 나타낼 때는 수를 1개 이상 사용해야 한다.
 * 정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.
 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 
 * 각 테스트 케이스는 한 줄로 이루어져 있고, 정수 n이 주어진다. 
 * n은 양수이며 11보다 작다.
 * 각 테스트 케이스마다, n을 1, 2, 3의 합으로 나타내는 방법의 수를 출력한다.
 */
import java.util.*;
public class No9095_mutipleFor {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	
    	while(t-->0) {
    	    int n = sc.nextInt();
    	    int cnt = 0;
    	    for(int i1 = 1; i1<=3; i1++) {
    	    	if(i1 == n) {
    	    		cnt++;
    	    		continue;
    	    	}else if(i1>n) break;
    	    	for(int i2 = 1; i2<=3; i2++) {
    	    		if(i1+i2 == n) {
        	    		cnt++;
        	    		continue;
        	    	}else if(i1+i2>n) break;
    	    		for(int i3 = 1; i3<=3; i3++) {
    	    			if(i1+i2+i3 == n) {
            	    		cnt++;
            	    		continue;
            	    	}else if(i1+i2+i3>n) break;
    	    			for(int i4 = 1; i4<=3; i4++) {
    	    				if(i1+i2+i3+i4 == n) {
                	    		cnt++;
                	    		continue;
                	    	}else if(i1+i2+i3+i4>n) break;
    	    				for(int i5 = 1; i5<=3; i5++) {
    	    					if(i1+i2+i3+i4+i5 == n) {
                    	    		cnt++;
                    	    		continue;
                    	    	}else if(i1+i2+i3+i4+i5>n) break;
    	    					for(int i6 = 1; i6<=3; i6++) {
    	    						if(i1+i2+i3+i4+i5+i6 == n) {
                        	    		cnt++;
                        	    		continue;
                        	    	}else if(i1+i2+i3+i4+i5+i6>n) break;
    	    						for(int i7 = 1; i7<=3; i7++) {
    	    							if(i1+i2+i3+i4+i5+i6+i7 == n) {
                            	    		cnt++;
                            	    		continue;
                            	    	}else if(i1+i2+i3+i4+i5+i6+i7>n) break;
    	    							for(int i8 = 1; i8<=3; i8++) {
    	    								if(i1+i2+i3+i4+i5+i6+i7+i8 == n) {
                                	    		cnt++;
                                	    		continue;
                                	    	}else if(i1+i2+i3+i4+i5+i6+i7+i8>n) break;
    	    								for(int i9 = 1; i9<=3; i9++) {
    	    									if(i1+i2+i3+i4+i5+i6+i7+i8+i9 == n) {
                                    	    		cnt++;
                                    	    		continue;
                                    	    	}else if(i1+i2+i3+i4+i5+i6+i7+i8+i9>n) break;
    	    									for(int i10= 1; i10<=3; i10++) {
    	    										if(i1+i2+i3+i4+i5+i6+i7+i8+i9+i10 == n) {
                                        	    		cnt++;
                                        	    		continue;
                                        	    	}else if(i1+i2+i3+i4+i5+i6+i7+i8+i9+i10>n) break;
    	    						    	    }
    	    					    	    	
    	    					    	    }
    	    				    	    	
    	    				    	    }
    	    			    	    	
    	    			    	    }
    	    		    	    	
    	    		    	    }
    	    	    	    	
    	    	    	    }
    	        	    	
    	        	    }
    	    	    	
    	    	    }
        	    	
        	    }	
    	    }
    	    System.out.println(cnt);
    	}
    	
    }
}
