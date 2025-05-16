package com.ohgiraffers.section03.math;

public class Application1 {

    public static void main(String[] args) {

        /* comment. Math 클래스에서 제공하는 static 메소드를 호출할 수 있다. */
        /* API란?
        *  Application Programming Interface는 응용프로그램에서 사용할 수 있도록
        *  운영체제가 프로그래밍 언어가 제공하는 기능을 제어할 수 있도록 만든 인터페이스를 뜻한다.
        *  쉽게 말해 우리가 구현할 수 없거나 구현하기 번거로운 기능들을 JDK를 설치하면 사용할 수 있도록 제공해놓은
        *  소스코드(클래스나 인터페이스)들을 의미한다.
        *  더 쉽게 말해 누가 작성해놓은 소스코드이니 가져다 쓰는 방법을 본다는 말이다.
        *  모든 코드를 우리가 다 외울 수 없으니 API 문서를 별도로 제공해주고 있다.
        * */

        /* java.lang.Math
        *  Math 클래스는 수학에서 자주 사용하는 상수들과 함수들을 미리 구현해놓은 클래스이다.
        *  모든 메소드가 static 메소드로 작성되어 있다.
        * */

        /* 1. 절대값 출력 */
        /* 1-1. 클래스의 full-name을 다 적은 경우 */
        System.out.println("-7의 절대값 : " + (java.lang.Math.abs(-7)));

        /* 1-2. import를 해서 사용 */
        System.out.println(Math.abs(-1.25));

        /* 2. 최대값, 최소값 출력 */
        System.out.println(Math.min(10, 20));
        System.out.println(Math.max(20, 30));

        System.out.println(Math.PI);

        /* 3. 난수 출력 */
        System.out.println(Math.random());
    }
}