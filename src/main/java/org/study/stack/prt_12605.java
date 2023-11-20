package org.study.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class prt_12605 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<String> stack = new Stack<>();
        String s = "";
        for(int i = 0 ; i < n ; i++){
           String str = br.readLine();
           //공백 제거 후 strArr에 삽입
            String strArr[] = str.split(" ");
            //
            for(int k = 0 ; k < strArr.length; k++){
                stack.push(strArr[k]);
            }
            while (true){
                s += stack.pop() + " ";
                if(stack.empty()){
                    break;
                }
            }
            System.out.println("Case #"+(i+1)+": "+ s.trim()); //앞뒤 공백 제거
            //문자열 초기화
            s = "";
        }

    }
}
