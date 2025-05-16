package com.ohgiraffers.section01.method;

public class Application7 {

    public static void main(String[] args) {

        /* comment. 매개변수와 리턴값을 복합적으로 활용하는 것을 이해하고 활용할 수 있다. */

        int first = 20;
        int second = 10;

        Application7 app7 = new Application7();
        System.out.println(app7.plusTwoNumbers(first, second));
        System.out.println(app7.minusTwoNumbers(first, second));
        System.out.println(app7.multipleTwoNumbers(first, second));
        System.out.println(app7.divideTwoNumbers(first, second));
    }

    public int plusTwoNumbers(int first, int second) {

        return first + second;
    }

    public int minusTwoNumbers(int first, int second) {

        return first - second;
    }

    public int multipleTwoNumbers(int first, int second) {

        return first * second;
    }

    public int divideTwoNumbers(int first, int second) {

        return first / second;
    }
}
