package org.study.queue;
//절댓값 힙
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

import static java.lang.Math.abs;

public class prt_11286 {

    public static void main(String[] args) throws IOException {
        BufferedReader sb = new BufferedReader(new InputStreamReader(System.in));
        int sbSize = Integer.parseInt(sb.readLine());
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>((o1, o2) ->{
            int firstValue = abs(o1);
            int secondValue = abs(o2);
            //두 값의 절댓값이 같은 경우
            if(firstValue == secondValue) {
                //음수 출력
                return o1 > o2 ? 1 : -1;
            }
            //두 값이 같지 않은 경우 작은 값 출력
            return firstValue - secondValue;
        });

        int result = 0;

        for(int i = 0; i< sbSize; i++) {
            int input = Integer.parseInt(sb.readLine());

            if (input == 0) {
                //입력값이 0이면서 큐가 비어있을 때 0 출력
                if (priorityQueue.isEmpty()) {
                    System.out.println("0");
                //비교값 출력
                } else {
                    System.out.println(priorityQueue.poll());
                }
            }else{
                priorityQueue.add(input);
            }
        }
    }
}