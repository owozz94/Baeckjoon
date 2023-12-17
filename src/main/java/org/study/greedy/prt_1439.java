package org.study.greedy;

import java.util.*;

public class prt_1439 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String num = in.nextLine(); //0,1 각각 묶어서 처리.
        int zero = 0;
        int one = 0;
        int tmp = 0;
        int flag = 0;
        int lastNum = Integer.parseInt(num.substring(num.length() - 1));
        ArrayList<Integer> arrayList = new ArrayList<>();

        if (Integer.parseInt(String.valueOf(num.charAt(0))) == 1) {
            zero--;
        }
        while (!num.isEmpty()) {
            int str = Integer.parseInt(String.valueOf(num.charAt(0)));
            if (str == flag) { //0부터 시작
                tmp += str;
                num = num.substring(1);
            } else {
                flag = str;
                arrayList.add(tmp);
                tmp = 0;
            }
        }
        arrayList.add(lastNum); //마지막 인덱스 삽입
        for (int n : arrayList) {
            if (n > 0) {
                one++;
            } else {
                zero++;
            }
        }
        System.out.println(one >= zero ? zero : one);
    }
}
