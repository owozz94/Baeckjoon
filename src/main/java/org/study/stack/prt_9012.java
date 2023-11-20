package org.study.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class prt_9012 {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int num = Integer.parseInt(in.nextLine());
        Stack<String> stack = new Stack<>();
        String input = "";
        for(int i = 0; i < num; i++){
            input = in.nextLine();
            char[] charArr = input.toCharArray();
            for(int k = 0; k < charArr.length; k++) {
                String str = String.valueOf(charArr[k]);
                //괄호가 )로 들어온 경우

                if (str.equals("(")) {
                    stack.push(str);
                    //) 들어오고 str에 값이 있고 스택이 비어있으면
                }else if(!str.isEmpty() && str.equals(")") && stack.empty()){
                    stack.push(str);
                    break;
                }
                else
                    stack.pop();
                }

            if(stack.empty()){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
            stack.clear();
            }

        }

    }


