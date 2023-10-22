package org.study.string;

import java.util.Scanner;

public class prt_1259 {

    public static String result(){
        String result="";
        Scanner in = new Scanner(System.in);
        while (true){

            String input= in.nextLine();
            StringBuilder sb = new StringBuilder(input);
            if(input.equals("0")){
                break;
            }
            if(sb.reverse().toString().equals(input)){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }

        }

        return result;
    }
    public static void main(String[] args) {

        result();
    }
}