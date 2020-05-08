import java.util.Scanner;

public class Main {
    static final int EARTH = 15;
    static final int SUN = 28;
    static final int MOON = 19;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int earth = scanner.nextInt();
        int sun = scanner.nextInt();
        int moon = scanner.nextInt();
        int year = 1;
        int e = 1;
        int s = 1;
        int m = 1;
        while(true) {
            if(e == earth && s == sun && m == moon) {
                System.out.println(year);
                break;
            }
            e++;
            s++;
            m++;
            year++;
            
            if(e>EARTH) e = 1;
            if(s>SUN) s = 1;
            if(m>MOON) m = 1;
        }
    }
}
