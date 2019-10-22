package no1025;

import java.util.*;
import java.math.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        String[] input = sc.nextLine().split("");
        int len = input.length;
        int [] answer = new int[len];
        
        for(int i = 0; i < len; i++){
            answer[i] = Integer.parseInt(input[i]) * (int)Math.pow(10,(len- i - 1));
            System.out.format("[%d]\n", answer[i]);
        }
        
        
    }
}