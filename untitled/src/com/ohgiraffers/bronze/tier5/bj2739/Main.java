package com.ohgiraffers.bronze.tier5.bj2739;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = 1; i <= 9; i++){
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}