package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class D_switch {

    public void testSimpleSwitchStatement() {

        /* comment. switch 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */
        /* [switch 표현식]
        *  switch(비교할변수) {
        *       case 비교값1 : 비교값1과 일치하는 경우 실행할 구문; break;
        *       case 비교값2 : 비교값2과 일치하는 경우 실행할 구문; break;
        *       default : case에 모두 해당하지 않는 경우 실행할 구문; break;
        *  }
        * */

        /* 문제 7.
        *  정수 두 개와 연산 기호 문자를 입력 받아서
        *  두 숫자의 연산 결과를 출력해보는 간단한 계산기를 만들어보자.
        * */
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수 입력 : ");
        int first = sc.nextInt();
        System.out.print("두 번째 정수 입력 : ");
        int second = sc.nextInt();
        System.out.print("연산 기호 입력(+, -, *, /, %) : ");
        char op = sc.next().charAt(0);

        int result = 0;

        switch(op) {
            case '+' :
                result = first + second;
                break;
            case '-' :
                result = first - second;
                break;
            case '*' :
                result = first * second;
                break;
            case '/' :
                result = first / second;
                break;
            case '%' :
                result = first % second;
                break;

                // 산술연산 외에 다른 문자에 대한 처리는 생략하였음
        }

        System.out.println(first + " " + op + " " + second + " = " + result);
    }

    public void testSwitchVendingMachine() {

        /* comment. switch문을 이용해서 문자열 값 비교 및 break 테스트 */
        System.out.println("===== ohgiraffers vending machine =====");
        System.out.println(" apple   banana   orange   melon   grape   ");
        System.out.println("=======================================");
        System.out.print("과일을 선택해주세요 : ");

        Scanner sc = new Scanner(System.in);
        String selectedFruits = sc.nextLine();

        int price = 0;

        String order = "";

        switch (selectedFruits) {
            case "apple" :
                order = "apple";
                price = 1000;
                break;
            case "banana" :
                order = "banana";
                price = 1500;
                break;
            case "orange" :
                order = "orange";
                price = 2000;
                break;
            case "melon" :
                order = "melon";
                price = 2500;
                break;
            case "grape" :
                order = "grape";
                price = 10000;
                break;
        }

        System.out.println(order + "를 선택하셨습니다.");
        System.out.println(price + "원을 투입해주세요~~");
    }
}
