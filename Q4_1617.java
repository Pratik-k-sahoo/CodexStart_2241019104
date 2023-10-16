/*
 * Name: Pratik Kumar Sahoo
 * Reg No: 2241019104
 * PS LINK: https://cses.fi/problemset/task/1617
 */

import java.util.Scanner;

public class Q4_1617{

    static long mod = (long)(1e9 + 7);

    public static long count(long zeroOne, long num, long mod){
        long result = 1;
        //Update zeroOne as it may be more than mod;
        zeroOne = zeroOne % mod;
        
        while(num > 0){
            //Check if num is odd or not and if odd then multiply result with binary;
            if((num & 1) == 1){
                result = (result * zeroOne) % mod;
            } 
            
            num = num / 2;
            zeroOne = (zeroOne * zeroOne) % mod;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();

        long count = count(2, num, mod);
        System.out.println(count);
    }
}