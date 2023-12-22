package org.study.recursion;

import java.util.Scanner;

public class prt_25501 {
    static int recurCount = 0;
    public static int recursion(String s, int n, int length){
        recurCount++;
        //앞이랑 뒤를 자름.
        String head = String.valueOf(s.charAt(n)); //첫번째 글자
        String tail = String.valueOf(s.charAt(length)); //마지막 글자
        if(n >= length){
            return 1;
        }else if(!head.equals(tail)){
            return 0; //앞/뒤 문자가 다르면 팰린드롬이 아니니까 0
        }
        return recursion(s,n+1,length-1);
    }
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = Integer.parseInt(in.nextLine());
        for(int i = 0; i < num; i++){
            String str = in.nextLine();
            System.out.println(isPalindrome(str)+" "+recurCount);
            recurCount = 0;
        }
    }
}
