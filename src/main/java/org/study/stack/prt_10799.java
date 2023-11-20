package org.study.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class prt_10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        Stack<Integer> stack = new Stack<>();
        int num = 0;
        int count = 0;
        for(int i = 0; i < input.length(); i ++){
            //추가
            if(input.charAt(i) == '('){
                stack.push(num++);
                continue;
                //빼기
            }if(input.charAt(i) == ')'){
                stack.pop();
                //() 인 경우(절삭)
                if(input.charAt(i - 1) == '('){
                    count += stack.size();
                }else{
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
