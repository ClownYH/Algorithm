package com.ohgiraffers.bronze.tier5.bj9086;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        for(int i = 0 ; i < n ; i++) {
            st = new StringTokenizer(br.readLine());
            String input = st.nextToken();
            bw.write(input.charAt(0) + "" + input.charAt(input.length() - 1) + "\n");
        }

        bw.flush();
        bw.close();
    }
}
