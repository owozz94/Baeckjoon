package org.study.string;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class prt_11721 {

    public static String result(){
        String sliceStr = "";
        String result="";
        int count=  0;

        ArrayList<String> arr = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        int length= input.length()/10;

        while(length>count){
            sliceStr = input.substring(0,10);
            arr.add(sliceStr);
            input =  input.substring(10);
            count++;
        }
            arr.add(input);

        for(String str : arr){
            System.out.println(str);
        }
        return result;
    }

    public static void main(String[] args) {
        result();
    }

}
