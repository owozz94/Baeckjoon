package org.study.string;

import java.util.Scanner;
//팰린드롬수 
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
            //revere 함수 이용. 반대로 출력됨
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