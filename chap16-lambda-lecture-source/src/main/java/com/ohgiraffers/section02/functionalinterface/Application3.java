package com.ohgiraffers.section02.functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;

public class Application3 {

    public static void main(String[] args) {

        /* comment. 표준 함수적 인터페이스 중 Function에 대해 이해하고 사용할 수 있다. */
        /* 1. Function<T, R>#apply(T t) : R : 객체 T를 R로 매핑한다. */
        Function<String, Integer> function = (str) -> Integer.parseInt(str);
        String strValue = "12345";
        System.out.println(function.apply(strValue) + " : " + function.apply(strValue).getClass().getName());

        /* 2. BiFunction<T, U, R>#apply(T t, U u) : R : 객체 T랑 U를 R로 매핑한다. */
        BiFunction<String, String, Integer> biFunction = (str1, str2) -> Integer.parseInt(str1) + Integer.parseInt(str2);
        String str1 = "12345";
        String str2 = "67890";
        System.out.println(biFunction.apply(str1, str2) + " : " + biFunction.apply(str1, str2).getClass().getName());

        /* 3. IntFunction<R>#apply(int value) : R : int를 R로 매핑한다. */
        IntFunction<String> intFunction = intvalue -> String.valueOf(intvalue);
        int intValue = 123;
        System.out.println(intFunction.apply(intValue) + " : " + intFunction.apply(intValue).getClass().getName());
    }
}
