package com.ohgiraffers.bronze.tier3.bj2588;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int input1 = scanner.nextInt();
        scanner.nextLine();
        String input2 = scanner.nextLine();

        int a = Character.getNumericValue(input2.charAt(2));
        int b = Character.getNumericValue(input2.charAt(1));
        int c = Character.getNumericValue(input2.charAt(0));

        int mul1 = input1 * a;
        int mul2 = input1 * b;
        int mul3 = input1 * c;

        int result = mul1 + mul2 * 10 + mul3 * 100;

        System.out.println(mul1);
        System.out.println(mul2);
        System.out.println(mul3);
        System.out.println(result);

    }
}
