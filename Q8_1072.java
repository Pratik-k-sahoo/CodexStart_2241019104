/*
 * Name: Pratik Kumar Sahoo
 * Reg No: 2241019104
 * PS LINK: https://cses.fi/problemset/task/1072
 */


import java.util.Scanner;

public class Q8_1072{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        for(int i=1; i<=k; i++){
            if(i == 1){
                System.out.println(0);
            }else if(i == 2){
                System.out.println(6);
            }else{
                long ans = i * i;
                long result = ((ans * (ans - 1)) / 2) - 4 * (i - 2) *  (i - 1);
                System.out.println(result);
            }
        }
    }
}