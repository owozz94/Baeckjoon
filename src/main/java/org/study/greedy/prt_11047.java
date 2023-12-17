package org.study.greedy;

import java.util.*;

public class prt_11047 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int count = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < n;i++){
            int num = in.nextInt();
            stack.add(num);
        }
        int rear = stack.peek();
        while (!stack.isEmpty()){
            if(k == 0){ //0원일 때
                break;
            }
            if(k >= rear){
                k = k - rear;
                count++;
            }else{
                rear = stack.pop();
            }
        }
        System.out.println(count);
    }
}
