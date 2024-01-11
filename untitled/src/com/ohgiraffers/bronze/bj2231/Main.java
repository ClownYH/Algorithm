package com.ohgiraffers.bronze.bj2231;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 자연수 M을 입력한다.
        int M = scanner.nextInt();
        // N을 선언(생성자)
        int N = 0;
        // N + 1자리 + 10자리 + 100자리 + ... + n자리 = M
        for (int i = 0; i < M; i++) {
            // 각자리 수의 합
            int sum = 0;
            // N = i
            int num = i;
            // 각자리 수 구하기
            while(num > 0){
                // 1자리의 수 구하기
                sum += num % 10;
                // 1/10으로 그 다음 자리를 1의 자리로 만든다. 0을 넘는 수가 나오지 않을 때까지 반복
                num /= 10;
            }

            if(i + sum == M){
                N = i;
                break;
            }
        }

        System.out.println(N);

    }
}
