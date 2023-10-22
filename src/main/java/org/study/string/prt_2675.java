package org.study.string;

import java.util.Scanner;

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
            s = Integer.parseInt(r.split(" ")[0]);
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
