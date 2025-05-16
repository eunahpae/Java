package com.ohgiraffers.section01.method;

public class Application8 {

    public static void main(String[] args) {

        /* comment. static 메소드를 호출할 수 있다. */
        /* static 메소드를 호출하는 방법
        *  클래스명.메소드명();
        * */

        Application8.sumTwoNumbers(10, 20);

        sumTwoNumbers(20, 30);  // 동일한 클래스일 때 클래스명 생략 가능

    }

    public static int sumTwoNumbers(int first, int second) {

        return first + second;
    }
}