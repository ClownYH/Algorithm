package com.ohgiraffers.bronze.tier3.bj2525;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String time = sc.nextLine();

        int hour = Integer.parseInt(time.split(" ")[0]);
        int minute = Integer.parseInt(time.split(" ")[1]);

        int cookingTime = sc.nextInt();

        hour += cookingTime / 60;
        minute += cookingTime % 60;

        if(minute >= 60){
            hour += 1;
            minute -= 60;
        }

        if(hour >= 24){
            hour -= 24;
        }

        System.out.println(hour + " " + minute);
    }
}
