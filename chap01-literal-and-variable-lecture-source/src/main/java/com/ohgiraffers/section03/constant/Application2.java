package com.ohgiraffers.section03.constant;

public class Application2 {

    public static void main(String[] args) {

        /* comment. 상수의 명명 규칙에 대해 이해할 수 있다. */
        /* 상수의 명명 규칙은 변수의 명명규칙과 컴파일 에러를 발생시키는 규칙은 동일하다.
        *  단, 개발자들끼리의 암묵적인 규칙에서 일부 차이를 보인다.
        *  1. 모든 문자는 영문자 대문자 혹은 숫자만 사용한다.
        *  2. 단어와 단어 연결은 언더스코어(_) 사용한다.
        * */

        final int AGE1 = 20;
        final int AGE2 = 30;
        final int age3 = 40;    // 소문자로 사용은 가능하지만 변수와 구분하기 힘듦

        final int MAX_AGE = 60;
        final int MIN_AGE = 20;
        final int minAge = 30;  // camel-case 사용이 가능하지만 역시 변수와 구분하기 힘들다.
    }
}
