package org.study.recursion;
//종이접기
import java.util.Scanner;
public class prt_2630 {
    static int arr[][];
    static int white = 0;
    static int blue = 0;
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine()); //색종이 개수
        arr = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int k = 0; k < n; k++){
                arr[i][k] = in.nextInt();
            }
        }
        //행, 열, 길이
        paper(0, 0, n);
        System.out.println(white);
        System.out.println(blue);
    }
    private static void paper(int row, int col, int len) {
        if (colorCheck(row, col, len)) {
            if (arr[row][col] == 0) {
                white++;
            }
            else {
                blue++;
            }
            return;
        } 
        int newSize = len / 2; //절반
        
        paper(row, col, newSize); //1사분면
        paper(row, col + newSize, newSize); //2사분면
        paper(row + newSize, col, newSize); //3사분면
        paper(row + newSize, col + newSize, newSize); //4사분면
    }
    private static boolean colorCheck(int row, int col, int len) {
        int color = arr[row][col]; //첫 번째 원소를 기준으로 검사
        for(int i = row; i < row + len; i++){
            for(int j = col; j < col + len; j++){
                if(arr[i][j] != color){ //색상이 같지 않으면 분할 시작(모든 색상이 맞을 때 까지 계속 절반씩 쪼갬)
                    return false;
                }
            }
        }
        //검사가 모두 통과할 때 true
        return true;
    }
}
