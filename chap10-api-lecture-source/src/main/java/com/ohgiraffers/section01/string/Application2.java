package com.ohgiraffers.section01.string;

public class Application2 {

    public static void main(String[] args) {

        /* comment. 문자열 객체를 만드는 다양한 방법을 숙지하고 인스턴스가 생성되는 방식을 이해할 수 있다. */
        /* 문자열 객체를 만드는 방법
        *  "" 리터럴 형태 : 동일한 값을 가지는 인스턴스를 단일 인스턴스로 관리한다. (singleton)
        *  new String("문자열") : 매번 새로운 인스턴스를 생성한다.
        * */

        String str1 = "java";
        String str2 = "java";
        String str3 = new String("java");
        String str4 = new String("java");

        System.out.println(str1 == str2);
        System.out.println(str2 == str3);
        System.out.println(str3 == str4);

        /* 동일한 문자열은 동일한 hashCode값을 반환하도록 재정의 되어있다. */
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());

        /* 문자열은 불변이라는 특징을 가진다. */
        str2 += "oracle";

        System.out.println(str1 == str2);

        /* equals() : String 클래스의 equals() 메소드는 인스턴스 비교가 아닌
        *             문자열값을 비교하여 동일한 값을 가지는 경우 true, 다른 값을 가지는 경우 false를 반환하도록
        *             Object의 equals() 메소드를 재정의 해두었다.
        *             따라서 문자열 인스턴스 생성 방식과 상관 없이 동일한 문자열인지를 비교하기 위해 == 연산 대신
        *             equals() 메소드를 사용해야 한다.
        * */
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str4));
    }
}
