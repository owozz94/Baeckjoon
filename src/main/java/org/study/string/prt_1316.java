package org.study.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prt_1316 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static boolean check() throws IOException {
        boolean[] check = new boolean[26];
        int prev = 0;
        String str = br.readLine();
        for(int i = 0; i<str.length();i++){
            int now = str.charAt(i);

       if(prev != now){
           //character 타입 a = 97 h = 104  now - 'a' 니까 알파벳 순서대로 배열에 들어감.
           if(check[now - 'a'] == false){
               check[now -'a'] =true;
               prev = now;
           }else{
               return false;
           }
       }else{
           //이전 == 이후 인덱스가 같으면 연속된 수.
           continue;
    }
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        int count = 0;
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i< N ; i++){
            if(check()){
                count++;
            }
        }
        System.out.println(count);
    }
}