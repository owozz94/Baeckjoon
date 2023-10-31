package org.study.string;

import java.util.Scanner;

public class prt_1316 {
    public static void result() {
        Scanner in = new Scanner(System.in);
        int roopCount = Integer.parseInt(in.nextLine());
        String input = "";
        char[] chrArr = new char[roopCount];
        boolean toggle = true;
        for (int i = 0; i < roopCount; i++) {
            input = in.nextLine();
            chrArr = input.toCharArray();
        }
        //0번째 인덱스 기준으로 다음 인덱스가 같으면 continue, 다르면 true, 같은 문자가 나오면 false
        for (int i = 0; i < chrArr.length; i++) {
            for (int k = 1; k < chrArr.length; k++) {
                if (String.valueOf(chrArr[i]).equals(String.valueOf(chrArr[k]))){
                    continue;
                }
            }
        }
    }

    public static void main(String[] args){
        result();
    }
}
