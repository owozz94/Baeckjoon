package org.study.simple;

import java.util.Scanner;
//단어의 개수
public class prt_1152 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        String str = in.nextLine();
        //입력받은 문자의 앞뒤 공백 제거
        str = str.trim();
        //앞뒤 공백이 제거된 문자를 배열에 대입
        String[] strArr = str.split(" ");
        for(String s : strArr) {
            if(s.isEmpty()){
                //공백만 들어온경우 0 출력
                System.out.println(0);
                return;
            }
            count++;
        }
        System.out.println(count);
    }
}
