package org.study.queue;
//카드2 카드버리기
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class prt_2164 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        //1부터 입력한 숫자만큼 리스트에 삽입
        for(int i = 1; i <= num; i ++){
            queue.add(i);
        }
        for(int k = queue.size() ; k > 1; k--){
            queue.poll(); //윗장 버리고
            queue.add(queue.peek()); //그 다음장 뒤에 넣고
            queue.poll(); //위에 값 버리고
        }
        //마지막 남은 값 출력
        System.out.println(queue.poll());
    }
}
