package org.study.recursion;

import java.util.Scanner;

public class prt_1780 {
    static int[][] arr;
    static int zero, one, minus = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        arr = new int[num][num];
        for(int i = 0; i < num; i++){
            for(int j = 0; j < num; j++){
                int n = in.nextInt();
                arr[i][j] = n;
            }
        }
        //첫 번째부터 시작
        paper(0, 0, num);
        System.out.println(minus);
        System.out.println(zero);
        System.out.println(one);
    }

    public static void paper(int row,int col, int len){
        if(check(row, col, len)){
            if(arr[row][col] == 0){
                zero++;
            }
            else if(arr[row][col] == 1){
                one++;
            }else{
                minus++;
            }
            return;
        }
        int newSize = len/3; // 9등분으로 자르려고
        paper(row, col, newSize);								// 왼쪽 위
        paper(row, col + newSize, newSize);						// 중앙 위
        paper(row, col + 2 * newSize, newSize);					// 오른쪽 위

        paper(row + newSize, col, newSize);						// 왼쪽 중간
        paper(row + newSize, col + newSize, newSize);			// 중앙 중간
        paper(row + newSize, col + 2 * newSize, newSize);		// 오른쪽 중간

        paper(row + 2 * newSize, col, newSize);					// 왼쪽 아래
        paper(row + 2 * newSize, col + newSize, newSize);		// 중앙 아래
        paper(row + 2 * newSize, col + 2 * newSize, newSize);	// 오른쪽 아래

    }
    public static boolean check(int row, int col, int len){
        int color = arr[row][col];
        //각 블록의 시작점부터 블럭의 끝까지 검사(row + len, col + len)
        for(int i = row; i < row + len; i++){
            for(int j = col; j < col + len; j++){
                if(arr[i][j] != color){
                    return false;
                }

            }
        }
        return true;
    }
}
