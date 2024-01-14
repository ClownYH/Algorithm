package com.ohgiraffers.bronze.tier5.bj1008;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        double a = Integer.parseInt(input[0]);
        double b = Integer.parseInt(input[1]);

        System.out.println((a / b));
    }
}