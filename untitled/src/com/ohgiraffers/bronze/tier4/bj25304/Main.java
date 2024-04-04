package com.ohgiraffers.bronze.tier4.bj25304;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalPrice = sc.nextInt();
        int num = sc.nextInt();
        int sumPrice = 0;
        sc.nextLine(); // 엔터를 소비

        for (int i = 0; i < num; i++){
            String priceAndAccount = sc.nextLine();

            int price = Integer.parseInt(priceAndAccount.split(" ")[0]);
            int account = Integer.parseInt(priceAndAccount.split(" ")[1]);

            sumPrice += price * account;
        }

        if(sumPrice == totalPrice){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
