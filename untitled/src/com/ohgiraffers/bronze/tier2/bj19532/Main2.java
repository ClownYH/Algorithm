package com.ohgiraffers.bronze.tier2.bj19532;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args){
        // 브루트 포스 방식
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputList = input.split(" ");
        int a = Integer.parseInt(inputList[0]);
        int b = Integer.parseInt(inputList[1]);
        int c = Integer.parseInt(inputList[2]);
        int d = Integer.parseInt(inputList[3]);
        int e = Integer.parseInt(inputList[4]);
        int f = Integer.parseInt(inputList[5]);

        int x = 0;
        int y = 0;

        // abcdef의 범위 -999 < abcdef < 999
        for (int i = -999; i <= 999 ; i++) {
            for (int j = -999; j <= 999 ; j++) {
                // ax + by = c, dx + ey = f
                // 위의 두 식이 동시에 성립해야 한다.
                if((a * i) + (b * j) == c && (d * i) + (e * j) == f){
                    x = i;
                    y = j;
                    System.out.println(x + " " + y);
                }
            }
        }
    }
}
