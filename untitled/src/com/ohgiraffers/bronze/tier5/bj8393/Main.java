package com.ohgiraffers.bronze.tier5.bj8393;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int answer = 0;
        for(int i = 1; i <= num; i++){
            answer += i;
        }

        System.out.println(answer);
    }
}
