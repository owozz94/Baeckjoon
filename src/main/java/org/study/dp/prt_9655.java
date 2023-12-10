package org.study.dp;

import java.util.Scanner;
// https://dev01.tistory.com/70
public class prt_9655 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if(num % 2 == 0){
            System.out.println("CY");
        }else{
            System.out.println("SK");
        }
    }
}
