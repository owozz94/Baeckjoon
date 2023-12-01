package org.study.search;

import java.io.IOException;
import java.util.*;

public class prt_2798 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum = 0;
        int M = in.nextInt();
        int round = num/2 + 1; //총 도는 횟수
        int[] arr = new int[num];
        ArrayList<Integer> maxArr = new ArrayList<>();
        for(int i = 0; i < num; i++){
            arr[i] = Math.abs(in.nextInt());
        }
        // 앞에서 3개씩 경우의 수 maxArr에 add 567, 568 , 569 578, 579 ...
        for(int k = 0; k < round; k++) {
            for (int j = 1+k; j < round + 1; j++) {
                for (int m = 1 + j; m < num; m++) {
                    sum =  arr[k] +  arr[j] +  arr[m];
                    maxArr.add(sum);
                }
            }
        }
        Collections.sort(maxArr); //경우의 수 정렬
        int max = 0; //최대값이랑 사용자가 입력한 값 비교
        for(int z = 0; z < maxArr.size(); z++){
            if(maxArr.get(z) <= M){
                max = maxArr.get(z);
            }else{
                break;
            }
        }
        System.out.println(max);
    }
}
