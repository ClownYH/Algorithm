package com.ohgiraffers.silver.tier5.bj2941;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String[] croatiaAlphabet = {"c=", "c-", "dz=","d-", "lj", "nj", "s=", "z="};

        for(int i = 0; i < 8; i++){

            if(input.contains(croatiaAlphabet[i])){
                input = input.replace(croatiaAlphabet[i], "!"); // 해당 크로아티아 알파벳을 1자리 특수문자로 변환해서 계산하도록(특수문자로 쓴 이유는 알파벳이 겹쳐서 계산되는 것을 방지)
            }
        }

        System.out.println(input.length());
    }
}
