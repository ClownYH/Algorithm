package com.ohgiraffers.bronze.tier3.bj10818;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int account = Integer.parseInt(br.readLine());
        int[] number = new int[account];

        StringTokenizer st = new StringTokenizer(br.readLine());

        int max = -1000000;
        int min = 1000000;

        for (int i = 0; i < account; i++) {
            number[i] = Integer.parseInt(st.nextToken());

            if (max < number[i]) {
                max = number[i];
            }

            if (min > number[i]) {
                min = number[i];
            }
        }

        bw.write(min + " " + max);
        bw.newLine();

        br.close();
        bw.close();
    }
}
