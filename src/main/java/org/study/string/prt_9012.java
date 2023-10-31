package org.study.string;

import java.util.Scanner;
import java.util.Stack;

public class prt_9012 {
    public static void result() {
        Scanner in = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        String roopCount = in.nextLine();
        String input = "";
        for (int k = 0; k<Integer.parseInt(roopCount); k++) {
            input = in.nextLine();
            char[] charArr = input.toCharArray();
            for (int i = 0; i < charArr.length; i++) {
                //왼 괄호가 기준
                if (String.valueOf(charArr[i]).equals("(")) {
                    stack.push(String.valueOf(charArr[i]));
                } else {
                    int size = stack.size();
                    //오른쪽 괄호가 들어왔을 경우
                    if(size == 0){
                        stack.push(String.valueOf(charArr[i]));
                        break;
                    }
                    else{
                        stack.pop();
                    }
                }
            }
            if(stack.empty()){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            stack.clear();
        }
    }
    public static void main(String[] args){
        result();
    }
}
