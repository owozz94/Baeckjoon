package org.study.queue;
//요세푸스
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class prt_11866 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String[] num = in.nextLine().split(" ");
        int N = Integer.parseInt(num[0]); //사람 수
        int K = Integer.parseInt(num[1]); //제거되는 순서
        int first = 0;
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }
        while (!queue.isEmpty()) {
            //K번째는 poll
            for(int i = 1; i < K; i++){
                first = queue.poll();
                queue.add(first);
            }
            if(queue.size() == 1){
                sb.append(queue.poll());
                break;
            }
            sb.append(queue.poll()+", ");
        }
        System.out.println("<"+sb+">");
    }
}
