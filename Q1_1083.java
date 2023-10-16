/*
 * Name: Pratik Kumar Sahoo
 * Reg No: 2241019104
 * PS LINK: https://cses.fi/problemset/task/1083
 */

import java.util.LinkedList;
import java.util.Scanner;

public class Q1_1083 {


    //Brute Force Approach
    /*
    public static long findMissing(LinkedList<Long> list, long num) {
        if (!list.contains(num)) {
            return num;
        }

        return findMissing(list, num + 1);
    }
    */


    //Optimal Approach
    public static int findMissing(int arr[], int size) {
        int xor1 = arr[0];
        int xor2 = 1;

        // For xor of all the elements currently present in array
        for (int i = 1; i < size - 1; i++)
            xor1 = xor1 ^ arr[i];

        // For xor of all the elements from 1 to n (inclusive)
        for (int i = 2; i <= size; i++)
            xor2 = xor2 ^ i;

        return (xor1 ^ xor2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Input of n:-
        int size = sc.nextInt();
        // Initiating array
        int arr[] = new int[size - 1];

        // Array input
        for (int i = 0; i < size - 1; i++) {
            arr[i] = sc.nextInt();
        }

        //Brute Force Approach
        /*
        Converting to LinkedList
        LinkedList<Long> list = new LinkedList<>();
        for(int i=0; i<size - 1; i++){
        list.add(arr[i]);
        }
        long missing = findMissing(list, 1);
        System.out.println(missing);
        */

        int missing = findMissing(arr, size);
        System.out.println(missing);
    }
}