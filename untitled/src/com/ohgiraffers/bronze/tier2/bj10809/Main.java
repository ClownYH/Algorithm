package com.ohgiraffers.bronze.tier2.bj10809;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int[] alphabets = new int[26];

        Arrays.fill(alphabets, -1);

        for (int i = 0; i < s.length(); i++) {
            char alphabet = s.charAt(i);

            if(alphabets[alphabet - 'a'] == -1) { // 혹은 97(아스키 코드값)
                alphabets[alphabet - 'a'] = i;
            }
        }

        for (int i = 0; i < alphabets.length; i++) {
            System.out.print(alphabets[i] + " ");
        }
    }
}
