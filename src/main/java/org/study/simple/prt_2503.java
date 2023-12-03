package org.study.simple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class prt_2503 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken()); //테스트케이스 갯수
        boolean[] check = new boolean[1000];
        //초기 경우의 수
        for (int i = 123; i < 1000; i++) { //123~999
            String str = Integer.toString(i);
            if (str.charAt(0) == '0' || str.charAt(1) == '0' || str.charAt(2) == '0') {
                continue;
            }
            //각기 다른 숫자 3개
            if (str.charAt(0) == str.charAt(1) || str.charAt(1) == str.charAt(2) || str.charAt(0) == str.charAt(2)) {
                continue;
            }
            check[i] = true;
        }
        for (int a = 0; a < num; a++) {
            st = new StringTokenizer(br.readLine());
            int req = Integer.parseInt(st.nextToken()); //비교값
            int strike = Integer.parseInt(st.nextToken());
            int ball = Integer.parseInt(st.nextToken());
            //모든 경우의 수 탐색
            for (int start = 123; start < 1000; start++) {

                //정답 가능성이 있는 수
                if (check[start]) {
                    int tmpStrike = 0;
                    int tmpBall = 0;

                    for (int first = 0;first< 3; first++) {
                        char compareChar = Integer.toString(req).charAt(first);

                        for (int second = 0; second < 3; second++) {
                            char minhuckChar = Integer.toString(start).charAt(second);

                            if (compareChar == minhuckChar && first == second) {
                                tmpStrike++;
                            } else if (compareChar == minhuckChar) {
                                tmpBall++;
                            }
                        }

                    }
                    if (tmpStrike == strike && tmpBall == ball) {
                        check[start] = true;
                    } else {
                        check[start] = false;
                    }
                }
            }
        }
        int count = 0;
        for (int n = 123; n < check.length; n++) {
            if (check[n]) {
                count++;
            }
        }
        System.out.println(count);
    }
}