package bruteForce;
/**
 * 
 * @author YGH
 * 1, 2, 3 ���ϱ�
 * ���� 4�� 1, 2, 3�� ������ ��Ÿ���� ����� �� 7������ �ִ�. 
 * ���� ��Ÿ�� ���� ���� 1�� �̻� ����ؾ� �Ѵ�.
 * ���� n�� �־����� ��, n�� 1, 2, 3�� ������ ��Ÿ���� ����� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����. 
 * �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ�, ���� n�� �־�����. 
 * n�� ����̸� 11���� �۴�.
 * �� �׽�Ʈ ���̽�����, n�� 1, 2, 3�� ������ ��Ÿ���� ����� ���� ����Ѵ�.
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
