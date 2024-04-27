package com.ohgiraffers.bronze.tier2.bj5622;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        char[] chars = input.toCharArray();

        int count = 0;

        for(int i = 0; i < chars.length; i++){

            switch(chars[i]){
                case 'A', 'B', 'C' : count += 3; break;
                case 'D', 'E', 'F' : count += 4; break;
                case 'G', 'H', 'I' : count += 5; break;
                case 'J', 'K', 'L' : count += 6; break;
                case 'M', 'N', 'O' : count += 7; break;
                case 'P', 'Q', 'R', 'S' : count += 8; break;
                case 'T', 'U', 'V' : count += 9; break;
                case 'W', 'X', 'Y', 'Z' : count += 10; break;
                default : break;
            }
        }

        System.out.println(count);
    }
}
