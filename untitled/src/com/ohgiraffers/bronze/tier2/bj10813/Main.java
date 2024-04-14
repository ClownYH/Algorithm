package com.ohgiraffers.bronze.tier2.bj10813;

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

        for(int i = 0; i < n; i++){
            bucket[i] = i + 1;
        }

        for(int j = 0; j < m; j++){
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int x = bucket[a - 1];
            int y = bucket[b - 1];

            bucket[a - 1] = y;
            bucket[b - 1] = x;
        }

        for(int k = 0; k < n; k++){
            bw.write(bucket[k] + " ");
        }

        bw.flush();
        bw.close();
    }
}
