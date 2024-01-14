package com.ohgiraffers.bronze.tier2.bj19532;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        // 브루트 포스 방식이 아님

        Scanner scanner = new Scanner(System.in);

        // 6개의 숫자를 입력받고 이를 띄어쓰기로 구분
        String input = scanner.nextLine();
        String[] inputList = input.split(" ");
        int[] num = new int[6];
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(inputList[i]);
        }

        // x와 y를 구하는 식(a, b, c, d, e, f)
        // x = (bf-ce)/(bd-ae)
        int x = ((num[1] * num[5]) - (num[2] * num[4])) / ((num[1] * num[3]) -(num[0] * num[4]));

        // y = (af-cd)/(ae-bd)
        int y = ((num[0] * num[5]) - (num[2] * num[3])) / ((num[0] * num[4]) -(num[1] * num[3]));

        System.out.println(x + " " + y);
    }
}
