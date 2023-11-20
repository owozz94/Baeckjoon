package org.study.simple;
//셀프넘
public class prt_4673 {
    public static void main(String[] args) {        int[] check_list = new int[10001];
        StringBuilder sb = new StringBuilder(); //결과값
        for (int i=1;i<10001;i++) {
            int n = d(i); //계산한 값이 들어있는 변수
            //셀프넘이 아닌 경우 1을 넣음
            if(n<10001) {
                check_list[n] = 1;
            }
        }
        for(int i=1;i<10001;i++) {
            if(check_list[i]!=1) {
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);
    }
    public static int d(int n) {
        int sum = n; //생성자 저장값
        while(n !=0) {
            sum = sum + (n%10); // 나머지
            n = n/10; //몫
        }
        return sum;
    }

}
