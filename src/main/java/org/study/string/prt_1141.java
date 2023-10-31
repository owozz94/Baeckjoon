package org.study.string;

import java.util.*;

public class prt_1141 {
    public static void result() {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String[] strArr = new String[n];
        String input = "";
        int result = 0;

        for (int i = 0; i < n; i++) {
            input = in.nextLine().toLowerCase();
            strArr[i] = input;
        }
        Arrays.sort(strArr, (String s1, String s2) -> s1.length()-s2.length());
        //0번째 인덱스보다 1번째 인덱스가 크거나 같다. > 2인덱스 길이 - 1인덱스 길이
        //1번째 인덱스가 indexof(두번째 인덱스)를 했을 때, 0 이상이 나오면 ++1

        for (int i = 0; i < strArr.length; i++) { //정렬을 해서 가능한 것!
            for (int k = 1+i; k < strArr.length; k++) {
                if (i == k) {
                    continue;
                }
                if ((strArr[k]).indexOf(strArr[i])==0) {
                    result++;
                    break;
                }
            }
        }
        System.out.println(n - result);
    }
    public static void main(String[] args) {
        result();
    }
}