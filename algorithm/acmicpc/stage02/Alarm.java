import java.util.Scanner;

public class Alarm {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int hour = sc.nextInt();
    	int min = sc.nextInt();
    	
    	if(min >= 45){
    		System.out.println(hour+" "+ (min-45));
    		
    	}else{
    		if(hour == 0) hour = 24;
    		System.out.println((hour - 1) + " " +((min + 60) - 45));
    	}
    }

}
