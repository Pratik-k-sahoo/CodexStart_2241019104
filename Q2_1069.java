/*
 * Name: Pratik Kumar Sahoo
 * Reg No: 2241019104
 * PS LINK: https://cses.fi/problemset/task/1069
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Q2_1069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        
        char temp = line.charAt(0);
        int count = 1;
        int max = 1;

        int len = line.length();

        for(int i=1; i<len; i++){
            char c = line.charAt(i);
            if(temp == c){
                count++;
                max = Math.max(max, count);
            }else{
                max = Math.max(max, count);
                temp = c;
                count = 1;
            }
        }

        System.out.println(max);
    }
}
