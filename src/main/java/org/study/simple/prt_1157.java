package org.study.simple;

import java.util.*;

public class prt_1157 {
    public static void main(String[] args) {
        //영어 알파벳 배열 생성(알파벳 개수 25개)
        //알파벳이 나올 떄 마다 해당 배열에 ++;
        //각각의 배열들 최종 개수 출력
        Scanner in = new Scanner(System.in);
        int[] alphabet = new int[26];
        char[] chrArr = in.next().toUpperCase().toCharArray(); //대문자로 배열에 한 글자씩 대입
        int num = 0;
        int max = 0;
        char chr = 0;
        //A = 65
        for(int i = 0; i < chrArr.length; i++){
            num = chrArr[i] - 65;
            alphabet[num] +=1;
        }
        for(int k = 0; k< alphabet.length; k++){
            if(alphabet[k]>max){
                max = alphabet[k];
                chr = (char) (k + 'A');
            }else if(alphabet[k] == max){
                chr = '?';
            }
        }
        System.out.println(chr);
    }
}
