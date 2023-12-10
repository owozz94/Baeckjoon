package org.study.dp;

import java.util.Scanner;

public class prt_1149 {

    final  static int Red = 0;
    final  static int Green = 1;
    final  static int Blue = 2;

    static int[][] arr; //비용
    static int[][] dpArr;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = Integer.parseInt(in.nextLine());
        arr = new int[num][3];
        dpArr = new int[num][3];
        for(int i = 0; i < num; i++){
            for(int k = 0; k < 3; k++){
                int n = in.nextInt();
                arr[i][k] = n;
            }
        }
        //DP의 첫 번째 값은 각 색상 비용의 첫 번째 값으로 초기화 (첫 행을 기준점으로 시작)
        dpArr[0][Red] = arr[0][Red];
        dpArr[0][Green] = arr[0][Green];
        dpArr[0][Blue] = arr[0][Blue];

        System.out.print(Math.min(dp(num- 1, Red), Math.min(dp(num - 1, Green), dp(num - 1, Blue))));

    }

    static int dp(int n, int color) {
        //탐색을 하지 않은 상태이면
        if(dpArr[n][color] == 0){
            if(color == Red){
                dpArr[n][Red] =Math.min(dp(n-1, Green), dp(n -1, Blue)) + arr[n][Red];
            }
            else if(color == Green){
                dpArr[n][Green] = Math.min(dp(n-1, Red), dp(n-1, Blue)) + arr[n][Green];
            }
            else{
                dpArr[n][Blue] = Math.min(dp(n -1 , Red), dp(n -1, Green)) + arr[n][Blue];
            }
        }
        return dpArr[n][color];
    }
}
