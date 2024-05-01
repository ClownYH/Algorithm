package com.ohgiraffers.bronze.tier1.bj1157;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine().toUpperCase();

        int[] alphabet = new int[26]; // 아스키 기준 대문자 65~90, 소문자 97~122

        for (int i = 0; i < input.length(); i++) {
            int num = input.charAt(i) - 65; // 값 - 대문자 A(65)
            alphabet[num]++;
        }

        int max = -1; // 배열 안의 초기값이 0이므로 -1 지정
        char answer = '?';

        for(int i = 0; i < alphabet.length; i++) {
            if(alphabet[i] > max) {
                max = alphabet[i];
                answer = (char)(i + 65);
            }else if(alphabet[i] == max) {
                answer = '?';
            }
        }

        System.out.println(answer);
    }
}
