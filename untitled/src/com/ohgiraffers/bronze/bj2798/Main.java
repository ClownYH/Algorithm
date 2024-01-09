package com.ohgiraffers.bronze.bj2798;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] arg){
        // 기본 조건 : N(3 ≤ N ≤ 100), M(10 ≤ M ≤ 300,000)
        // 카드의 개수 N를 배열의 크기로 둔다. -> Cards[N]
        // 딜러가 외친 수 M은 최종 조건에 사용한다고 가정한다.
        Scanner scanner = new Scanner(System.in);

        System.out.println("N과 M 값을 입력하세요.(띄어쓰기로 구분)");
        String input1 = scanner.nextLine();
        String nm[] = input1.split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

//        N만큼 숫자를 입력한다.
        System.out.println(n + " 개의 숫자를 입력해주세요.(띄어쓰기로 구분)");
        String input2 = scanner.nextLine();
        String num[] = input2.split(" ");
        List<Integer> draw = new ArrayList<>();
        for(int i = 0; i < n; i++){
            draw.add(Integer.parseInt(num[i]));
        }

//        반복문을 이용하여 배열 안에서 3개의 수를 N개의 카드 안에서 중복 없이 랜덤하게 선택하도록 한 후 그 값을 더한다. 그 합을 sum으로 둔다.
        Random random = new Random();
        List<Integer> hand = new ArrayList<>();
        int sum = 0;
        List<Integer> sumList = new ArrayList<>();

        loop : while (true){
            while(hand.size() < 3){
                int randomNo = draw.get(random.nextInt(n));
                if(hand.contains(randomNo)){
                   continue loop;
                }else{
                    hand.add(randomNo);
                }
            }
            System.out.println(hand);
            sum = hand.get(0) + hand.get(1) + hand.get(2);
            sumList.add(sum);

            if(sumList.contains(m-sum == 0)){
                System.out.println(sum);
                return;
            }
        }




//                반복문으로 result[] 내부의 값을 꺼내 M-result를 계산한다.
//                조건문으로 M-result이 가장 작은 값 중 0이상인 result를 출력한다.

    }
}
