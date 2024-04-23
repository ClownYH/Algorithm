package com.ohgiraffers.bronze.tier4.bj11720;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String number = br.readLine();

        int sum = 0;

        for(int i = 0; i < n; i++){
            sum += Integer.parseInt(String.valueOf(number.charAt(i)));
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}
