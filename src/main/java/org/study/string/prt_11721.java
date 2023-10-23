package org.study.string;

import java.util.ArrayList;
import java.util.Scanner;
//열 개씩 끊어 출력하기
public class prt_11721 {
    public static void result(){
        String sliceStr = "";
        String result="";
        int count=  0;

        ArrayList<String> arr = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String input = in.nextLine(); //입력 한 번만 받음.
        int length= input.length()/10; //반복할 횟수(행)

        while(length>count){
            sliceStr = input.substring(0,10);
            arr.add(sliceStr);
            input =  input.substring(10); //인덱스10~length까지 input에 넣음
            count++;
        }
            arr.add(input);

        for(String str : arr){
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        result();
    }

}
