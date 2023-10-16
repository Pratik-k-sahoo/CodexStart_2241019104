/*
 * Name: Pratik Kumar Sahoo
 * Reg No: 2241019104
 * PS LINK: https://cses.fi/problemset/task/2205
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Q10_2205 {

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        ArrayList<String> list = new ArrayList<>();
        list.add(0 + "");
        list.add(1 + "");
        
        for(int i=1; i<num; i++){
            ArrayList<String> ans = new ArrayList<>();
            for(int j=0; j<list.size(); j++){
                ans.add(0 + list.get(j));
            }

            // for(int j=0; j<list.size(); j++){
            //     ans.add(1 + list.get(j));
            // }

            for(int j=list.size()-1; j>=0; j--){
                ans.add(1 + list.get(j));
            }

            list.clear();
            list.addAll(ans);
        }

        for(String s: list){
            System.out.println(s);
        }

    }
}
