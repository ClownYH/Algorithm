package com.ohgiraffers.bronze.bj1001;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        System.out.println(a - b);
    }
}
