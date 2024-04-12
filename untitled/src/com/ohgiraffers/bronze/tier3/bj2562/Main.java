package com.ohgiraffers.bronze.tier3.bj2562;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] num = new int[9];
        int max = 0;
        int maxI = 0;
        StringTokenizer st;
        for(int i  = 0; i < 9; i++){
            st = new StringTokenizer(br.readLine());
            num[i] = Integer.parseInt(st.nextToken());

            if(max < num[i]){
                max = num[i];
                maxI = i + 1;
            }
        }

        bw.write(max + "\n" + maxI);
        bw.flush();

        br.close();
        bw.close();
    }
}
