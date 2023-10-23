package org.study.string;

import java.util.Scanner;
//모음의 개수
public class prt_1264 {
    public static void result() {
        int result = 0;
        String strArr[] = {"a", "e", "i", "o", "u"};
        Scanner in = new Scanner(System.in);
        String inputArr;
        String strChr="";
        while (true) {
            inputArr = in.nextLine().toLowerCase();
            for (int k = 0; k < inputArr.length(); k++) {
                
                for (int i = 0; i < strArr.length; i++) {
                    //입력 값을 하나씩 잘라서 배열이랑 배교
                    strChr = String.valueOf(inputArr.charAt(k));
                    if(strChr.contains(strArr[i])){
                        result++;
                    }
                }
            } if(strChr.equals("#")){
                break;
            }
            System.out.println(result);
            result=0;
        }
    }
    public static void main(String[] args) {
        result();
    }
}
