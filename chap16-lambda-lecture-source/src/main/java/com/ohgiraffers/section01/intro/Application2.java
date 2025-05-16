package com.ohgiraffers.section01.intro;

public class Application2 {

    public static void main(String[] args) {

        /* comment. 람다식 활용을 위한 내부 인터페이스 관리 기법에 대해 이해할 수 있다. */
        OuterCalculator.Sum sum = (x, y) -> x + y;
        OuterCalculator.Minus minus = (x, y) -> x - y;
        OuterCalculator.Multiple multi = (x, y) -> x * y;
        OuterCalculator.Divide divide = (x, y) -> x / y;

        System.out.println("20과 10의 합 : " + sum.sumTwoNumber(20, 10));
        System.out.println("20과 10의 차 : " + minus.minusTwoNumber(20, 10));
        System.out.println("20과 10의 곱 : " + multi.multiplyTwoNumber(20, 10));
        System.out.println("20과 10의 나누기 : " + divide.divideTwoNumber(20, 10));
    }
}
