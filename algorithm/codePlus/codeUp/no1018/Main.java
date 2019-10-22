package no1018;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args){
    	LocalDateTime now = LocalDateTime.now();
    	int hour = now.getHour();
    	int minute = now.getMinute();
    	System.out.println(hour + ":" + minute);
    }
}
