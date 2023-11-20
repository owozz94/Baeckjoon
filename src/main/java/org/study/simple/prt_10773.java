package org.study.simple;

import java.util.Scanner;
import java.util.Stack;
//제로
public class prt_10773 {
    public static void main(String[] args) {
        //최근의 수를 지우는 거니까 스택
        //0이 나오면 pop()
        Scanner in = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int k = in.nextInt();
        int[] result = new int[k];
        int sum = 0;
        for(int i = 0; i < k; i++){
            int num = in.nextInt();
            if(num == 0){
                //스택에 값이 있으면서 0일 때
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else{
                stack.push(num);
            }
        }
        if(!stack.isEmpty()) {
            while (!stack.isEmpty()) {
                sum += stack.pop();
            }
        }
        System.out.println(sum);
    }
}
