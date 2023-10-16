/*
 * Name: Pratik Kumar Sahoo
 * Reg No: 2241019104
 * PS LINK: https://cses.fi/problemset/task/1618
 */

import java.util.Scanner;

public class Q7_1618 {

    public static long findFact(long num){
        if(num == 1){
            return 1;
        }

        return num * findFact(num - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        long sum = 0;
        for(long i=5; i<=num; i=i*5){
            sum += (num/i);
        }

        System.out.println(sum);
        
    }
}
