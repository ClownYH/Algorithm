package com.ohgiraffers.bronze.tier4.bj2480;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        int a = Integer.parseInt(input.split(" ")[0]);
        int b = Integer.parseInt(input.split(" ")[1]);
        int c = Integer.parseInt(input.split(" ")[2]);

        if(a == b && b == c){
            System.out.println(10000 + (a * 1000));
        } else if (a == b) {
            System.out.println(1000 + (a * 100));
        }else if(b == c){
            System.out.println(1000 + (b * 100));
        }else if(a == c){
            System.out.println(1000 + (c * 100));
        }else {
            int max = a;

            if(b > max){
                max = b;
            }

            if(c > max){
                max = c;
            }

            System.out.println(max * 100);
        }
    }
}
