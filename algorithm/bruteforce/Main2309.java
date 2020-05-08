import java.util.Arrays;
import java.util.Scanner;

public class Main2309 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = new int[9];
        int sum = 0;
        for(int i = 0; i < 9; i++) {
            input[i] = scanner.nextInt();
            sum += input[i];
        }
        Arrays.sort(input);
        for(int i = 0; i < 8; i++) {
            for(int j = i+1; j < 9; j++) {
                if(sum-input[i]-input[j] == 100) {
                    for(int k = 0; k < 9; k ++) {
                        if(input[k] == input[i] || input[k] == input[j]) {
                            continue;
                        }
                        System.out.println(input[k]);
                    }
                    return;
                }
            }
        }
    }
}
