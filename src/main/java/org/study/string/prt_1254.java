package org.study.string;

import java.util.Scanner;

public class prt_1254 {
    static boolean Palindrome(String str) {
        int start = 0; //시작
        int end = str.length() - 1; //마지막문자

        while (start <= end) {
            //마지막에 하나 남은 문자까지 비교.
            if (str.charAt(start) != str.charAt(end)) {
                return false; // 펠린드롬이 아님
            }
                start++;
                end--;
            }
            return true; //끝까지 탐색이 되면 팰린드롬
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        int inputLen = input.length();
        //앞글자를 단어 길이만큼 잘라서 맨앞/맨뒤 비교.
        for(int i = 0; i<inputLen ; i++){
            if(Palindrome(input.substring(i))){
                break;
            }
            //팰린드롬일때 길이 ++;
            inputLen++;
        }
        //문자열을 출력하라는게 아니라, 길이를 출력하는거라서 앞 뒤가 같지 않을때만 길이를 더해주면됨.
        System.out.println(inputLen);
    }
}