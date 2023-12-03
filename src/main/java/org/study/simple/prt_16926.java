package org.study.simple;

import java.util.Scanner;
import java.util.StringTokenizer;
// 배열 돌리기
public class prt_16926 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(in.nextLine());

        int h = Integer.parseInt(st.nextToken()); //가로
        int w = Integer.parseInt(st.nextToken()); //세로
        int n = Integer.parseInt(st.nextToken());
        int[][] arr = new int[h][w];
        for(int i=0; i<h; i++) { //일단 배열에 순서대로 집어넣음
            st = new StringTokenizer(in.nextLine());
            for(int j=0; j<w; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int count = Math.min(h, w) / 2; //돌아가는 라인 개수
        for(int i=0; i<n; i++) { //회전 횟수만큼 반복

            for(int j=0; j<count; j++) { //맨 가장자리 라인 먼저 돌리고 안에 라인 돌리기
                int temp = arr[j][j]; //시작되는 위치 (왼쪽 꼭지점)

                for(int k=j+1; k<w-j; k++) //윗변
                    arr[j][k-1] = arr[j][k];

                for(int k=j+1; k<h-j; k++) //오른쪽변
                    arr[k-1][w-1-j] = arr[k][w-1-j];

                for(int k=w-2-j; k>=j; k--) //아랫변
                    arr[h-1-j][k+1] = arr[h-1-j][k];

                for(int k=h-2-j; k>=j; k--) //왼쪽변
                    arr[k+1][j] = arr[k][j];

                arr[j+1][j] = temp;
            }
        }

        for(int j=0; j<h; j++) {
            for(int k=0; k<w; k++) {
                System.out.print(arr[j][k] + " ");
            }
            System.out.println();
        }
    }
}