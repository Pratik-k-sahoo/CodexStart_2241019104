/*
 * Name: Pratik Kumar Sahoo
 * Reg No: 2241019104
 * PS LINK: https://cses.fi/problemset/task/1070
 */

import java.util.Scanner;

public class Q6_1070 {

    public static void createString(int num) {
        if (num == 1) {
            System.out.println(1);
            return;
        }

        if (num == 2 || num == 3) {
            System.out.println("NO SOLUTION");
            return;
        }

        StringBuilder str = new StringBuilder();
        if(num % 2 == 0){
            for (int i = 2; i <= num; i+=2) {
                str.append(i + " ");
            }
            for (int i = 1; i < num; i+=2) {
                str.append(i + " ");
            }
        }else{
            for (int i = 2; i <= num - 1; i+=2) {
                str.append(i + " ");
            }
            for (int i = 1; i <= num; i+=2) {
                str.append(i + " ");
            }
        }
        
        System.out.println(str);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        createString(num);

        //Brute force approach:- Using array But in array time exceeds so direct adding to String is the optimal approach
    }
        //Not working for input num = 4;
    /*
    public static void createNewArray(int[] arr, int num){
        if(num == 1){
            System.out.println(1);
            return;
        }

        if(num == 2 || num == 3){
            System.out.println("NO SOLUTION");
            return;
        }

        int input1;
        int input2;
        if(num % 2 == 0){
            input1 = num;
            input2 = 1;
        }else{
            input1 = num - 1;
            input2 = 1;
        }

        for(int i=0; i<num; i++){
            if(i<num/2){
                arr[i] = input1;
                input1 -= 2;
            }else{
                arr[i] = input2;
                input2 += 2;
            }
        }

        for(int i=0; i<num; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        if (checkBeautiful(arr)) {
            for (int i = 0; i < num; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.println("NO SOLUTION");
        }
    }
    */
}
