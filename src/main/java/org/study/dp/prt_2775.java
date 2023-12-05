package org.study.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prt_2775 {
    static int[][] arr;
    static int result = 0;
    static boolean flag = true;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
//        for(int i = 0; i < t; i++){
            int k = Integer.parseInt(br.readLine()); //층
            int n = Integer.parseInt(br.readLine()); //호
            arr = new int[k+1][n];
            dp(k, n); //1층 이상
        }
//    }

    private static int dp(int k, int n) {
       //1층 끝나면 다음층부터 각 호수를 더해줌
        for(int x = k-1; x <= n; x++){ //층
            int tmp = 0;
            for(int y = 0; y < n; y++){ //호수
                if(flag){
                    arr[x][y] = y+1;
                }else{
                  tmp = arr[x-x][y];
                   result += dp(x-x, n-1) + tmp; //시작

                }
            }
            flag = false;
        }
        return result;
    }
}
