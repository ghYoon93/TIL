package no1019;
import java.util.*;
public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	String n = sc.nextLine();
    	String[] answer = n.split("\\.");
    	int [] time = new int[3];
    	
    	for(int i = 0; i < answer.length; i ++){
    		time[i] = Integer.parseInt(answer[i]);
    	}
    	System.out.format("%04d.%02d.%02d",time[0], time[1], time[2]);
    	
    }
}
