package org.study.greedy;
import java.util.Scanner;
//전자레인지
public class prt_10162 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int result = 0;
            StringBuilder button = new StringBuilder();
            int num = in.nextInt();
            if(num >= 300){ //5 minute
                result = num/300;
                num = num % 300;
                button.append(result + " ");
            }else{
                button.append(0 + " ");
            }
            if(num >= 60){ //1 minute
                result = num/60;
                num = num % 60;
                button.append(result + " ");
            }else {
                button.append(0 + " ");
            }
            if(num >= 10){ //10 second
                result = num/10;
                num = num % 10;
                button.append(result);
            }else{
                button.append(0);
            }
            if(num > 0){
                System.out.println(-1);
                return;
            }
            System.out.println(button);
        }
    }
