package com.ohgiraffers.section01.exception;

public class Application1 {

    public static void main(String[] args) throws Exception {

        /* comment. 예외에 대해 이해하고 처리하기 위한 문법을 이용할 수 있다. */
        /* 예외처리
        *  자바 프로그램 작성 시 자바 문법에 맞지 않는 경우
        *  코드를 컴파일 하려고 할 때 컴파일 에러를 발생시킨다. 엄밀히 말하면 문법상의 오류 이다.
        *  혹은 자바 문법에 맞게 작상하여 컴파일에 문제가 없더라도, 실행되면서 예상치 못하게 오류가 발생할 수 있다.
        *  컴퓨터 프로그램이 동작하는 도중에 예상치 못한 사태가 발생하여
        *  실행중인 프로그램이 영향을 받는 것을 오류(Error)와 예외(Exception) 두 가지로 구분할 수 있다.
        *
        *  오류(Error)
        *  시스템 상에서 프로그램에 심각한 문제를 발생하여 실행중인 프로그램이 종료되는 것을 말한다.
        *  이러한 오류는 개발자가 미리 예측하여 처리하는 것이 불가능하며, 오류에 대한 처리는 할 수 없다.
        *
        *  예외(Exception)
        *  오류와 마찬가지로 실행중인 프로그램을 비정상적으로 종료시키지만
        *  발생할 수 있는 상황을 미리 예측하고 처리할 수 있는 미약한 오류를 말한다.
        *  개발자는 이러한 예외에 대해 예외처리를 통해 예외 상황을 적절히 처리하여 코드의 흐름을 컨트롤 할 수 있다.
        * */

        /* 강제로 예외를 발생
        *  - throw new 예외클래스명();
        *  예외 처리 방법
        *  1. throws로 위임
        *  2. try-catch로 처리
        * */

        /* 1. throws로 위임 */
        ExceptionTest et = new ExceptionTest();

        et.checkEnoughMoney(10000, 50000);
        et.checkEnoughMoney(50000, 10000);
    }
}
