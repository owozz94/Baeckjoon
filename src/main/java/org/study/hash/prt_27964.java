package org.study.hash;

import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;
//콰트로치즈피자
public class prt_27964 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = Integer.parseInt(in.nextLine());
        int count = 0;
        HashSet<String> set = new HashSet<>();
        StringTokenizer st = new StringTokenizer(in.nextLine());
        for(int i = 0; i < num; i++){
            set.add(st.nextToken());
        }
        for(String s : set){
            if(s.length()>5 && s.substring(s.length()-6,s.length()).equals("Cheese")){
                count++;
            }
        }
        System.out.println(count >= 4 ? "yummy":"sad");
    }
}
