package com.ohgiraffers.bronze.tier3.bj2444;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                System.out.print(" ");
            }
            for(int k = i; k >= 0; k--) {
                System.out.print("*");
            }
            for(int l = i; l > 0; l--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1; i < n; i++) {
            for(int j = i; j > 0; j--) {
                System.out.print(" ");
            }
            for(int k = i; k < n; k++) {
                System.out.print("*");
            }
            for(int l = i + 1; l < n; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
