package org.study.hash;

import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;
//Slice String 구분자 병합자
public class prt_30034 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashSet<String> sliceSet = new HashSet<>();
        boolean flag = false;
        int N = Integer.parseInt(br.readLine());
        //숫자 구분자
        StringTokenizer st = new StringTokenizer(br.readLine());

        //문자 구분자
        while (N-- > 0) {
            sliceSet.add(st.nextToken());
        }
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        while (M-- > 0) {
            sliceSet.add(st.nextToken());
        }
        int K = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        //병합자
        while (K-- > 0) {
            String ss = st.nextToken();
            if (sliceSet.contains(ss)) {
                sliceSet.remove(ss);
            }
        }
        //문자열
        int str = Integer.parseInt(br.readLine());
        ArrayList<Character> strArr = new ArrayList<>(str);
        String strTmp = br.readLine();
        while (!strTmp.isEmpty()) {
            strArr.add(strTmp.charAt(0));
            strTmp = strTmp.substring(1, strTmp.length());
        }
        for (int i = 0; i < strArr.size(); i++) {
            if (sliceSet.contains(String.valueOf(strArr.get(i))) || strArr.get(i) == ' ') {
                if (flag) {
                    sb.append("\n");
                    flag = false;
                }
                continue;
            } else {
                sb.append(String.valueOf(strArr.get(i)));
                flag = true;
            }
        }
        System.out.println(sb);
    }
}
