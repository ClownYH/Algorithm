package com.ohgiraffers.bronze.tier2.bj2798;

import java.util.Scanner;

public class Main {

    public static void main(String[] arg){
        // 기본 조건 : N(3 ≤ N ≤ 100), M(10 ≤ M ≤ 300,000)
        // n개만큼의 카드를 담는다.
        // 딜러가 외친 수 M은 최종 조건에 사용한다고 가정한다.
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String[] nm = input1.split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        // N만큼 숫자를 입력한다.
        String input2 = scanner.nextLine();
        String[] num = input2.split(" ");
        int[] card = new int[n];

        for (int i = 0; i < n; i++) {
            card[i] = Integer.parseInt(num[i]);
        }

        // 반복문을 이용하여 모든 경우의 수를 대입한다.
        int result = 0;

        // 1번 카드
        for(int i = 0; i < n - 2; i++){

            // 2번 카드(1번 카드 빼기)
            for(int j = i + 1; j < n - 1; j++){

                // 3번 카드(2번 카드도 빼기)
                for(int k = j + 1; k < n; k++){

                    int sum = card[i] + card[j] + card[k];

                    // m과 동일한 값
                    if(sum == m){
                        System.out.println(sum);
                        // 끝내지 않으면 계속 반복
                        return;
                    }

                    // 초기값 0보다 크면서 m보다 작은 값을 결과값으로 초기화
                    // 계속 반복해서 그 범위를 줄여간다.
                    if(result < sum && sum < m){
                        result = sum;
                        // 이 경우 모든 경우의 수가 아니라 1회만 하고 말더라
                        // System.out.println(result);
                        // return;
                    }
                }
            }
        }
        System.out.println(result);


    }
}
