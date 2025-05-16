package com.ohgiraffers.section01.string;

public class Application4 {

    public static void main(String[] args) {

        /* comment. 이스케이프 문자에 대해 이해하고 적용할 수 있다. */
        /* escape 문자
        *  문자열 내에서 사용하는 문자 중 특수문자를 표현하거나 특수기능을 사용할 때 사용하는 문자이다.
        *  이스케이프 문자          의미
        *      \n                개행(줄바꿈)
        *      \t                 탭
        *      \'                작은따옴표
        *      \"                큰따옴표
        *      \\                역슬래쉬 표시
        * */

        System.out.println("안녕하세요.\n저는 홍길동입니다.");
        System.out.println("안녕하세요.\t저는 홍길동입니다.");
        System.out.println("안녕하세요. 저는 '홍길동' 입니다.");
//        System.out.println(''');
        System.out.println('\'');
//        System.out.println("안녕하세요. 저는 "홍길동" 입니다.");
        System.out.println("안녕하세요. 저는 \"홍길동\" 입니다.");
        System.out.println("안녕하세요. 저는 \\홍길동\\ 입니다.");

        /* split 시 이스케이프 문자를 사용해야 하는 특수문자도 존재한다.
         *  이스케이프 문자 사용 안하는 특수문자
         *  ~ ` ! @ # % & - _ = ; : ' \ " ,  < > /
         *  이스케이프 문자를 사용하는 특수문자(\\)
         *  $ ^ * ( ) + | { } [ ] . ?
         * */
    }
}
