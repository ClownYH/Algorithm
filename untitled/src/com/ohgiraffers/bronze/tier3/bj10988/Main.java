package com.ohgiraffers.bronze.tier3.bj10988;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringBuilder builder = new StringBuilder(input);

        if(input.contentEquals(builder.reverse())){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}
