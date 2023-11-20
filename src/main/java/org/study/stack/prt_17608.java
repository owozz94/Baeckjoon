package org.study.stack;

import java.util.Scanner;
import java.util.Stack;

public class prt_17608 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        int intArr[] = new int[input];
        int result = 0;
        int compare = 0;
        int stackTop = 0;
        Stack<Integer> stack = new Stack<>();
        //스택에 스캐너에서 받은 값을 넣음
        for(int i=0; i < input; i++){
            intArr[i] = in.nextInt();
            int num = intArr[i];
            stack.push(num);
        }
        //스택에서 값을 하나씩 빼면서 비교
        for(int k = 0 ; k < intArr.length; k++){
            stackTop = stack.pop();
            if(compare<stackTop){
                result++;
                compare = stackTop;
            }
        }
        System.out.println(result);
    }

}
