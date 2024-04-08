package com.ohgiraffers.bronze.tier5.bj11022;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int time = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for(int i = 0; i < time; i++){
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = a + b;

            bw.write("Case #" + (i + 1) + ": " + a + " + " + b + " = " + c + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
