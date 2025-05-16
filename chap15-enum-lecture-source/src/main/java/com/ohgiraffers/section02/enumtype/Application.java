package com.ohgiraffers.section02.enumtype;

public class Application {

    public static void main(String[] args) {

        /* comment. 열거형(Enum)을 이용하여 상수 열거 패턴의 단점을 해결하는 것을 이해할 수 있다. */
        /* 1. 열거 타입으로 선언된 인스턴스는 싱글톤으로 관리되며 인스턴스가 한 개 임을 보장한다. */
        Subjects subject1 = Subjects.JAVA;
        Subjects subject2 = Subjects.HTML;

        if(subject1 == subject2) {
            System.out.println("두 과목은 같은 과목입니다.");
        } else {
            System.out.println("두 과목은 다른 과목입니다.");
        }

        /* 단일 인스턴스임을 보장하기에 == 비교가 가능하다. */
        System.out.println(subject1 == Subjects.JAVA);

        /* 2. 이름 충돌 방지를 위해 접두사를 쓰지 않아도 Enum 타입별로 네임스페이스를 가진다. */
        /* 동일한 이름의 상수가 필요한 경우 네임스페이스를 다르게 한다.
        * public enum Backend { JAVA, ORACLE, JDBC, JAVASCRIPT }
        * public enum Frontend { HTML, CSS, JAVASCRIPT }
        * */

        /* 3. toString()을 이용하여 문자열로 변경하기 쉽다. */
        System.out.println(Subjects.JAVA.toString());

        /* 4. values()를 이용하여 상수값 배열을 반환하고 이를 이용해 연속처리 할 수 있다. */
        Subjects[] subjects = Subjects.values();
        for(Subjects s : subjects) {
            System.out.println(s);
        }

        /* 5. 타입 안전성이 보장한다. */
        printSubject(Subjects.HTML);
//        printSubject(2);  // Enumtype은 인스턴스이기 때문에 정수를 사용하는 경우 타입불일치로 컴파일 에러 발생
    }

    public static void printSubject(Subjects subject) {
        System.out.println(subject.toString());
    }
}
