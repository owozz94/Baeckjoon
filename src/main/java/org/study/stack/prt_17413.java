package org.study.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class prt_17413 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        //꺾새여부 판별
        boolean flag = false;
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < str.length(); i++){

            if(str.charAt(i) == '<'){
                while (!stack.isEmpty()) { //닫히는 태그 시작. springbuilder에 넣고 문자열 뒤집기(stack.pop() )
                    sb.append(stack.pop());
                }
                flag = true;
            }
            //닫힌꺽새를 만났을 경우, flag를 false로 입력 후 > 저장
            else if(str.charAt(i) == '>'){
                flag = false;
                sb.append(str.charAt(i));
                continue;
            }
            //flag가 true일 경우, '>'를 만나기 전까지 그대로 입력.
            if(flag == true){
                sb.append(str.charAt(i));
            }
            //flag가 false인 경우 괄호 이외의 문자를 처리 문자열 뒤집는용도
            else if(flag == false){
                //해당 인덱스의 i 번째 문자가 공백일 경우, 모든 원소를 pop 수행 후 공백 후가
                if(str.charAt(i) == ' '){
                    while(!stack.isEmpty()){
                        sb.append(stack.pop());
                    }
                    sb.append(' ');
                    continue;
                }else{
                    //그 외의 경우 stack에 문자 추가
                    stack.push(str.charAt(i));
                }
            }
            //반복문이 마지막 횟수일 때, 스택이 비어있지 않다면 원소 추가
            if(i == str.length() -1){
                while (!stack.isEmpty()){
                    sb.append(stack.pop());
                }
            }
        }
        System.out.println(sb);
    }
}
