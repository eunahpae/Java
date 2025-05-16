package com.ohgiraffers.section02.functionalinterface;

import java.util.function.Predicate;

public class Application5 {

    public static void main(String[] args) {

        /* comment. 표준 함수적 인터페이스 중 Predicate에 대해 이해하고 사용할 수 있다. */

        /* 1. Predicate<T>#test(T t) : boolean : T를 조사하여 boolean을 리턴한다. */
        Predicate<Object> predicate = value -> value instanceof String;
        System.out.println("문자열인지 확인 : " + predicate.test("123"));
        System.out.println("문자열인지 확인 : " + predicate.test(123));
    }
}
