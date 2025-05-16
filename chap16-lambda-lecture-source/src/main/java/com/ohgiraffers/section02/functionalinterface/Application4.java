package com.ohgiraffers.section02.functionalinterface;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Application4 {

    public static void main(String[] args) {

        /* comment. 표준 함수적 인터페이스 중 Operator에 대해 이해하고 사용할 수 있다. */

        /* 1. BinaryOperator<T>#apply(T t1, T t2) : T : T와 T를 연산하여 T를 리턴한다. */
        BinaryOperator<String> binaryOperator = (str1, str2) -> str1 + str2;
        System.out.println(binaryOperator.apply("hello", "world"));

        /* 2. UnaryOperator<T>#apply(T t) : T : T를 연산하여 T를 리턴한다. */
        UnaryOperator<String> unaryOperator = (str) -> str + "world";
        System.out.println(unaryOperator.apply("hell"));
    }
}
