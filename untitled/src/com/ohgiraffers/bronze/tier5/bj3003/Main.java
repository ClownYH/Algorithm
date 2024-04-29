package com.ohgiraffers.bronze.tier5.bj3003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] pieces = new int[6];
        pieces[0] = 1;
        pieces[1] = 1;
        pieces[2] = 2;
        pieces[3] = 2;
        pieces[4] = 2;
        pieces[5] = 8;

        int[] chess = new int[6];

        for (int i = 0; i < 6; i++) {
            chess[i] = Integer.parseInt(st.nextToken());
            if(chess[i] != pieces[i]){
                chess[i] = pieces[i] - chess[i];
            }else {
                chess[i] = 0;
            }

            System.out.print(chess[i] + " ");
        }

    }
}
