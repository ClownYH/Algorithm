package com.ohgiraffers.bronze.tier1.bj1546;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");

        int[] grades = new int[n];
        for (int i = 0; i < n; i++) {
            grades[i] = Integer.parseInt(input[i]);
        }

        int m = 0;
        for (int i = 0; i < n; i++) {
            if(grades[i] > m){
                m = grades[i];
            }
        }

        double[] newGrades = new double[n];
        for (int i = 0; i < n; i++) {
            newGrades[i] = ((double) grades[i] / m) * 100;
        }

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += newGrades[i];
        }

        bw.write(Double.toString(sum / n));
        bw.flush();
        bw.close();
    }
}
