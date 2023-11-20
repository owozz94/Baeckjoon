package org.study.queue;
//최소 힙
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class prt_1927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>(); //최소힙 기본. 최대힙은 Collections.reverseOrder()

        for (int i = 0; i < size; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
               if(queue.isEmpty()){
                   System.out.println("0");
               }else{
                   System.out.println(queue.poll());
               }
            }
            else {
                queue.add(num);
            }
        }
    }
}
