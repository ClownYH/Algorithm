package com.ohgiraffers.bronze.tier5.bj10871;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nx = sc.nextLine();
        int n = Integer.parseInt(nx.split(" ")[0]);
        int x = Integer.parseInt(nx.split(" ")[1]);

        int[] num = new int[n];
        String[] number = sc.nextLine().split(" ");

        for(int i = 0; i < n; i++){
            if(Integer.parseInt(number[i]) < x){
                num[i] = Integer.parseInt(number[i]);
            }
        }

        for(int i = 0; i < num.length; i++){
            if(num[i] != 0){
                System.out.print(num[i] + " ");
            }
        }

    }
}
