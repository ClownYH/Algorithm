package com.ohgiraffers.bronze.tier5.bj27866;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int num = sc.nextInt();

        System.out.println(input.charAt(num - 1));
    }
}
