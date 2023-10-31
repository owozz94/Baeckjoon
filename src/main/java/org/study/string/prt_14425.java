package org.study.string;

import java.util.Scanner;

public class prt_14425 {

    public static void result() {

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] strArr = str.split(" ");

        int m = Integer.parseInt(String.valueOf(strArr[0]));
        int s = Integer.parseInt(String.valueOf(strArr[1]));
        int end = s + m;
        String allStrArr[] = new String[end];
        int result = 0;
        //총 루프 횟수는 m + s s.contains m 의 갯수 새기. 일단 전체를 다 배열에 저장.
        //이후 배열의 값을 indexOf를 이용해서 포함되어 있는지 순차 비교. 배열 m 0번째부터 배열s0번째부터 차레롤 비교
        for (int i = 0; i < end; i++) {
            allStrArr[i] = in.nextLine();
        }
        for (int k = 0; k < m; k++) {
            for (int i = m; i < end; i++) {
                if (allStrArr[k].equals(allStrArr[i])) {
                    result++;
                }
            }
        }
        System.out.println(result);
    }
    public static void main(String[] args){
        result();
    }

}
