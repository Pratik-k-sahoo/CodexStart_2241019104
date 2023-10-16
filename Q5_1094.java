/*
 * Name: Pratik Kumar Sahoo
 * Reg No: 2241019104
 * PS LINK: https://cses.fi/problemset/task/1094
 */

import java.util.Scanner;

public class Q5_1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        long arr[] = new long[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        long result = 0;
        for(int i=1; i<size; i++){
            if(arr[i] < arr[i-1]){
                result = result + (arr[i-1] - arr[i]);
                arr[i] = arr[i-1];
                // System.out.println("Result is " + result + " with " + arr[i] + " and " + arr[i-1]);
            }
        }

        System.out.println(result);
    }
}
