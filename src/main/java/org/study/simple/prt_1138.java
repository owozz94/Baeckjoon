package org.study.simple;

import java.io.IOException;
import java.util.Scanner;
//한줄서기
public class prt_1138 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int num = Integer.parseInt(in.nextLine()); //총 입력 개수
        boolean[] visit = new boolean[num]; //넣으려는 곳에 값이 있을 때 true

        int[] result = new int[num];
        for (int i = 0; i < num; i++) {
            int n = in.nextInt();
            int count = 0;
            for (int k = 0; k < num; k++) {
                if (!visit[k]) { //false일 때
                    if (count == n) {
                        visit[k] = true;
                        result[k] = i + 1;
                        break;
                    }
                    count++;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < num ; i++)
            sb.append(result[i]+" ");
        System.out.println(sb);
    }

}
