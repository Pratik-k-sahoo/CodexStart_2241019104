/*
 * Name: Pratik Kumar Sahoo
 * Reg No: 2241019104
 * PS LINK: https://cses.fi/problemset/task/2165
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Q3_2165 {

    static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    static int count = 0;

    public static void printTowerOfHanoi(int n, int source, int helper, int destiny) {
        if (n == 1) {
            ArrayList<Integer> ans = new ArrayList<>();
            ans.add(source);
            ans.add(destiny);
            list.add(new ArrayList<>(ans));
            count++;
            return;
        }

        count++;
        printTowerOfHanoi(n - 1, source, destiny, helper);
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(source);
        ans.add(destiny);
        list.add(new ArrayList<>(ans));
        printTowerOfHanoi(n - 1, helper, source, destiny);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printTowerOfHanoi(n, 1, 2, 3);
        System.out.println(count);
        for(int i=0; i<list.size(); i++){
            ArrayList<Integer> ans = new ArrayList<>(list.get(i));
            for(Integer res : ans){
                System.out.print(res + " ");
            }
            System.out.println();
        }
    }
}
