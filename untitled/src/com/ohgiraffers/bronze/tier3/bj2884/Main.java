package com.ohgiraffers.bronze.tier3.bj2884;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] time = sc.nextLine().split(" ");

        int hour = Integer.parseInt(time[0]);
        int minute = Integer.parseInt(time[1]);

        if(minute < 45){

            int answerHour;

            if(hour == 0){
                answerHour = 23;
            }else {
                answerHour = hour - 1;
            }
            int answerMin = 60 + (minute - 45);

            System.out.println(answerHour + " " + answerMin);
        }else {
            System.out.println(hour + " " + (minute - 45));
        }
    }
}
