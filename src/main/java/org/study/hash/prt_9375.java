package org.study.hash;

import java.util.HashMap;
import java.util.Scanner;
//패션왕 신혜빈
public class prt_9375 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = Integer.parseInt(in.nextLine());
        for (int i = 0; i < num; i++) {
            HashMap<String, Integer> map = new HashMap<>();
            int costume = in.nextInt();
            for (int k = 0; k < costume; k++) {
                String name = in.next(), type = in.next();
                map.put(type, map.getOrDefault(type, 0) + 1);
            }
            int count = 1;
            for(Integer val : map.values()){
                //경우의 수 공식
              count *= val +1;
            }
            //전부 벗는 경우의 수는 xxx
            System.out.println(count -1);
        }

    }
}