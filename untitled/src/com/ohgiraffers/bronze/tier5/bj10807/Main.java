package com.ohgiraffers.bronze.tier5.bj10807;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        int[] number = new int[n];

        String input = sc.nextLine();
        String[] num = input.split(" ");

        int v = sc.nextInt();
        int answer = 0;

        for(int i = 0; i < n; i++){
            number[i] = Integer.parseInt(num[i]);
            if(number[i] == v){
                answer += 1;
            }
        }

        System.out.println(answer);

    }
}
