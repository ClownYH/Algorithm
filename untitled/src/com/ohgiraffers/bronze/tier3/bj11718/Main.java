package com.ohgiraffers.bronze.tier3.bj11718;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input;

        while ((input = br.readLine()) != null) {
            if(input.isEmpty()){
                break;
            }
            sb.append(input + "\n");
        }
        System.out.println(sb);
    }
}