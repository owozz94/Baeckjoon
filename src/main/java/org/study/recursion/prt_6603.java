package org.study.recursion;

import java.util.Scanner;
//로또
public class prt_6603 {
    static int[] s;
    static int[] result;
    static int k;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            k = in.nextInt();
            if(1 > k){ //0일때 멈춤
                break;
            }
            result = new int[k];
            s = new int[k];
            for (int i = 0; i < k; i++) {
                s[i] = in.nextInt();
            }
            dfs(0, 0);
            System.out.println();

        }
    }
    public static void dfs(int start, int depth){
        if(depth == 6){
            print();
        }
        for(int i = start; i < k; i++){
            result[i] = 1;
            dfs(i + 1, depth + 1);
            result[i] = 0;
        }
    }
    public static void print(){
        for(int i = 0; i < k; i++){
            if(result[i] == 1){
                System.out.print(s[i] + " ");
            }
        }
        System.out.println();
    }

}
