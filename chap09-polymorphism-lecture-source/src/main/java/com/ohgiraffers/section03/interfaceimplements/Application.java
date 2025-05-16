package com.ohgiraffers.section03.interfaceimplements;

public class Application {

    public static void main(String[] args) {

        /* comment. 인터페이스에 대해 이해할 수 있다. */
        /* 인터페이스란?
        *  여기서 다루는 인터페이스는 자바 클래스와 유사한 형태이지만
        *  추상메소드와 상수 필드만 가질 수 있는 클래스의 변형체를 말한다.
        * */

        /* 인터페이스의 사용 목적
        *  1. 추상클래스와 비슷하게 필요한 기능을 공통화 해서 강제성을 부여할 목적으로 사용한다.
        *  2. 자바의 단일상속의 단점을 극복할 수 있다. (다중 상속)
        * */

//        InterProduct interProduct = new InterProduct();

        InterProduct interProduct = new Product();

        interProduct.nonStaticMethod();
        interProduct.abstMethod();

        interProduct.defaultMethod();

        /* 인터페이스명.메소드명(); */
        InterProduct.staticMethod();

        /* 인터페이스명.필드명(); */
        System.out.println(InterProduct.MAX_NUM);
        System.out.println(InterProduct.MIN_NUM);
    }
}
