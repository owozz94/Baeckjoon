package org.study.hash;

import java.util.HashMap;
import java.util.Scanner;
//할리갈리
public class prt_27160 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        HashMap<String, Integer> fruitList = new HashMap<>(3);

        for (int i = 0; i < n; i++) {
            //과일
            String s = in.next();
            //개수
            int x = in.nextInt();

            if (fruitList.containsKey(s) && fruitList.size() > 0) {
                int fruitVal = fruitList.get(s) + x;
                fruitList.put(s, fruitVal);
            }
           else {
                fruitList.put(s, x);
            }
        }
        String result = "NO";
        for(Integer val : fruitList.values()){
            if(val == 5){
                result = "YES";
                break;
            }
        }
        System.out.println(result);
    }
}
