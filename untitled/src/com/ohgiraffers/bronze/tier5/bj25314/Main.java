package com.ohgiraffers.bronze.tier5.bj25314;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int time = num / 4;

        for (int i = 0; i < time; i++){
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
