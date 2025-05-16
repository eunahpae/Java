package com.ohgiraffers.section01.usertype;

public class Application {

    public static void main(String[] args) {

        /* comment. 클래스가 무엇인지 이해하고 작성할 수 있다. */
        /* 지금까지 자바에서 제공되는 자료들을 취급하는 자료형에 대해 학습했다.
        *  이제 조금 더 복잡한 자료를 취급할 수 있는 방법을 배워보자
        *  우선 지금까지 배운 내용을 가지고 값을 저장하고 출력해본다.
        * */

        /* 1. 변수를 이용한 회원 데이터 관리 */
        String id = "user01";
        String pwd = "pass01";
        String name = "홍길동";
        int age = 20;
        char gender = '남';
        String[] hobby = {"축구", "볼링", "테니스"};

        System.out.println("id = " + id);
        System.out.println("pwd = " + pwd);
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        for(int i = 0; i < hobby.length; i++) {
            System.out.print(hobby[i] + " ");
        }
        System.out.println();

        /* 2. 사용자 정의의 자료형 사용하기 */
        /* 2-1. 변수 선언 및 객체 생성 */
        /* 자료형 변수명 = new 클래스명(); <- 객체를 생성하는 구문이다.
        *  사용자 정의의 자료형인 클래스를 이용하기 위해서는 new 연산자로 heap에 할당을 해야 한다.
        *  객체를 생성하게 되면 클래스에 정의한 필드와 메소드 대로 객체(instance)가 생성된다.
        *  위의 회원 정보들을 연속된 메모리 주소에서 사용하도록 heap에 공간을 만들어보자.
        * */
        Member member = new Member();

        /* 2-2. 생성된 인스턴스의 초기값 확인하기 */
        /* 이렇게 객체를 생성하고 나면 서로 다른 자료형들을 하나의 member라는 이름으로
        *  관리할 수 있도록 공간을 생성한 것이다.
        *  heap에 생성되기 때문에 jvm 기본값으로 초기화 된다.
        * */

        /* 필드에 접근하기 위해서는 레퍼런스변수명.필드명 으로 접근한다.
        *  '.'은 참조연산자라고 하는데, 레퍼런스 변수가 참고하고 있는 주소로 접근한다는 의미를 가진다.
        *  각 공간은 필드명으로 접근한다. (배열은 인덱스로 접근, 객체는 필드명으로 접근한다.)
        * */
        System.out.println(member.id);
        System.out.println(member.pwd);
        System.out.println(member.name);
        System.out.println(member.age);
        System.out.println(member.gender);
        System.out.println(member.hobby);

        /* 2-3. 필드에 접근해서 변수 사용하듯 사용하기 */
        member.id = "user01";
        member.pwd = "pass01";
        member.name = "홍길동";
        member.age = 20;
        member.gender = '남';
        member.hobby = new String[] {"축구", "볼링", "테니스"};

        System.out.println(member.id);
        System.out.println(member.pwd);
        System.out.println(member.name);
        System.out.println(member.age);
        System.out.println(member.gender);
        System.out.println("hobby : ");
        for(int i = 0; i < member.hobby.length; i++) {
            System.out.print(member.hobby[i] + " ");
        }
        System.out.println();
    }
}
