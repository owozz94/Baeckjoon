package org.study.search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class prt_16439_fail {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); //회원의 수
        int M = Integer.parseInt(st.nextToken()); // 치킨의 수
        int round = M - 2; //도는 횟수
        int[][] arr = new int[N][M];
        ArrayList<Integer> resultList = new ArrayList<>();
        //행렬에 값 넣기
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int k = 0; k < M; k++) {
                int num = Integer.parseInt(st.nextToken());
                arr[i][k] = num;
            }
        }
        //123 124 125 126 134 135 136 ...
            for (int x = 0; x < N; x++) {
                for (int y = 1 + x; y < N+1; y++) {
                    for (int z = 1 + y; z < M; z++) {
                        resultList.add(test(arr, x, y, z, N, round - x));
                    }
                }
        }
        Collections.sort(resultList);
        System.out.println(resultList.get(resultList.size()-1));
    }

    public static int test(int[][] arr, int x, int y, int z, int N, int round) {
        int sum = 0; //총 N명의 회원의 선호도 더한값

        for (int a = 0; a < round; a++) {
            int max = arr[x + a][x]; //첫 번째 값
            //00, 01, 02 10, 11, 12 20, 21, 22 ...
            if (arr[x + a][y] > max) {
                max = arr[x + a][y];
            }
            if(arr[x + a][z] > max) {
                max = arr[x + a][z];
            }
            //인원에 따른 경우의 수의 max값 합계
            sum += max;
            if(N == 1){
                return sum;
            }
        }
        return sum;
    }
}
