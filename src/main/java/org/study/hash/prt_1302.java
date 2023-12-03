package org.study.hash;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
//베스트셀러
public class prt_1302 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = Integer.parseInt(in.nextLine());
        //각 책을 hashmap에 넣음. 같은게 들어오는 경우 값+1
        HashMap<String, Integer> books = new HashMap<>();
        String result = "";
        for(int i = 0; i < num; i ++){
            String book = in.nextLine().toLowerCase();
            if(books.containsKey(book)){
                books.replace(book, books.get(book)+1); //value를 계속 ++1;
            }else{
                books.put(book, 1);
            }
        }
        int max = 0;
        //결과 정렬
        List<Map.Entry<String, Integer>> entries =
                books.entrySet().stream()
                        .sorted(Map.Entry.comparingByKey())
                        .collect(Collectors.toList());

        for(Map.Entry<String, Integer> entry : entries){
            if(max < entry.getValue()){
                max = entry.getValue();
                result = entry.getKey();
            }
        }
        System.out.println(result);
    }
}
