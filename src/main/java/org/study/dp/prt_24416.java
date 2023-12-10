package org.study.dp;

import java.util.Scanner;

public class prt_24416 {
    static int fibCount = 0;
    static int dpCount = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        fib(num);
        dp(num);
        System.out.println(fibCount+ " "+ dpCount);
    }
    public static int fib(int n){
        if(n == 1 || n == 2){
            fibCount++;
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }
    public static int dp(int n){
        dpCount++;
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i =3; i < n; i++){ //3번째부터 계산
            dp[i] = dp[i-1] + dp[i-2];
            dpCount++;
        }
        return dpCount;
    }
}
