package com.ohgiraffers.bronze.tier2.bj3052;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        int[] numbers = new int[10];
        boolean result;

        for(int i = 0; i < 10; i++){
            st = new StringTokenizer(br.readLine());
            numbers[i] = Integer.parseInt(st.nextToken()) % 42;
        }

        int count = 0;
        for(int i = 0; i < 10; i++){
            result = false;
            for(int j = i + 1; j < 10; j++){
                if(numbers[i] == numbers[j]){
                    result = true;
                    break;
                }
            }

            if(!result){
                count++;
            }
        }

        bw.write(String.valueOf(count)); // BufferedWriter는 int형으로 출력할 수 없다.
        bw.flush();
        bw.close();
    }
}
