package com.ohgiraffers.bronze.tier2.bj2908;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        /*
        * StringBuilder는 자바의 가변적 문자열을 다루는 클래스.
        * 주요 메소드
        * 1. append() : 문자열을 객체 끝에 추가
        * 2. insert() : 지정된 인덱스 위치에 문자열 또는 다른 데이터 삽입
        * 3. delete() 및 deleteCharAt(): 특정부분 삭제
        * 4. reverse() : 문자열의 순서 뒤집기
        * 5. toString() : 일반 문자열인 String으로 변환
        * */

        int a = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        int b = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());

        System.out.println(Math.max(a, b));

    }
}
