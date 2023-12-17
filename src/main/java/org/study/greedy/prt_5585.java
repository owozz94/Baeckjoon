package org.study.greedy;

import java.util.Scanner;

public class prt_5585 {
    static int count = 0;
    static int division = 500; // 500 100 50 10 5 1
    static int div = 100;
    static int tmp = 10;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int pay = 1000 - num;
        boolean flag = true;
        //true일 떄 division(400)
        System.out.println(test(pay, flag));
    }
    public static int test(int pay,boolean flag){
        while (pay > 0) {
            if (pay >= division) {
                pay = pay - division;
                count++;
            }
            else if(flag) { //true일 떄 거스름돈을 100으로 만들어야됨.400 나누기
                tmp = division/10;  //flag가 false일 때 값을 넘겨주려고
                division = div;
                flag = false;
                continue;
            }
            else {
                div = div/10;
                division = tmp;
                flag= true;
                continue;
            }
        }
            return count;
    }

}

