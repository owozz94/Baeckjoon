package org.study.search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class prt_14501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); //날짜 수
        for(int i = 0; i < n; i++){
            int day = Integer.parseInt(st.nextToken());
            int pay = Integer.parseInt(st.nextToken());
        }
    }



}
