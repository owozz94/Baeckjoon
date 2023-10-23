package org.study.string;

import java.util.Scanner;
//문자열 반복
public class prt_2675 {

    public static String result() {
        int s = 0;
        int input = 0;
        String r = "";
        String p = "";
        String sAray;

        Scanner in = new Scanner(System.in);
        input = Integer.parseInt(in.nextLine());

        for(int k = 0; k<input;k++) {
            r = in.nextLine();
            //반복할 횟수. 공백 기준으로 앞에서 인덱스 1개 자름.
            s = Integer.parseInt(r.split(" ")[0]);
            //반복될 문자열. 입력받은 문자열을 한 개씩 자름.
            sAray = r.split(" ")[1];

            for (int i = 0; i < sAray.length(); i++) {
                p = String.valueOf(sAray.charAt(i));
                System.out.print(p.repeat(s));
            }
            System.out.println();
        }
        return p;
    }
    public static void main(String[] args) {
        result();
    }
}
