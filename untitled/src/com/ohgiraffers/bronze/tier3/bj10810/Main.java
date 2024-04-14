package com.ohgiraffers.bronze.tier3.bj10810;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        String nm = br.readLine();
        int n = Integer.parseInt(nm.split(" ")[0]);
        int m = Integer.parseInt(nm.split(" ")[1]);

        int[] bucket = new int[n];

        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(a != b){
                for(int j = a - 1; j < b; j++){
                    bucket[j] = c;
                }
            }else {
                bucket[a - 1] = c;
            }
        }

        for(int k = 0; k < n; k++){
            bw.write(bucket[k] + " ");
        }

        bw.flush();
        bw.close();
    }
}
