package org.study.search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prt_16439 {
    static int n,m;
    static int result;
    static int[][]map;
    static boolean[] check;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");

        n = Integer.parseInt(s[0]); //사람
        m = Integer.parseInt(s[1]); //치킨

        map = new int[n][m];
        check = new boolean[m]; //치킨의 개수만큼 셋팅
        //사람 X 치킨 s1 배열에 넣기
        for(int i=0; i<n; i++){
            String[] s1 = br.readLine().split(" ");
            for(int j=0; j<m; j++){
                map[i][j] = Integer.parseInt(s1[j]);
            }
        }

        dfs(0,0);

        System.out.println(result);
    }
    private static void dfs(int start, int depth){
        if(depth==3){ //3개를 고른 상태
            int sum=0;
            for(int i=0; i<n; i++){
                int temp=0;
                for(int j=0; j<m; j++){ //치킨만큼
                    if(check[j]){ //고른치킨(true)
                        temp = Math.max(temp, map[i][j]);
                    }
                }
                sum+=temp;
            }
            result = Math.max(sum,result);
            return;
        }

        for(int i=start; i<m; i++){
            //고른 치킨을 담는 boolean 배열
            if(!check[i]){
                check[i]=true; //돌아야될 곳만 true 경우의 수애만 true값을 넣음
                //start는 앞에서 선택을 했던 것은 더 이상 선택하지 않도록 하기 위해 다음에 넘길 때 i+1
                dfs(i+1, depth+1);
                check[i]=false; 
            }
        }
    }
}
