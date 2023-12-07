package org.study.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prt_2775 {
    static int result = 0;
    static boolean flag = true;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[15][15];
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine()); //층
            int n = Integer.parseInt(br.readLine()); //호
            for(int x = 0; x<= 15; x++){
            for (int y = 0; y < 15; y++) {
                arr[x][y] = y + 1; //0층 주민
                if (x >= 1) {
                    arr[x][y] = arr[x - 1][y] + arr[x - 1][y + x];
                }
            }
            }
        }
    }

}