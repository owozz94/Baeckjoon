package org.study.dp;

import java.util.Scanner;

public class prt_11727 {
    static int[] arr;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        arr = new int[num+1];
        arr[0] = 1;
        arr[1] = 1;
        for(int i = 2; i <= num; i++) {
            arr[i] = (arr[i-1] + arr[i-2] *2) % 10007;
        }
        System.out.println(arr[num]);
    }
}
