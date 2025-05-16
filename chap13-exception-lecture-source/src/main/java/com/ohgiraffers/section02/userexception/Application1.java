package com.ohgiraffers.section02.userexception;

public class Application1 {

    public static void main(String[] args) {

        /* comment. 사용자 정의의 예외클래스 정의 후 발생한 사용자 정의의 예외를 처리할 수 있다. */

        ExceptionTest et = new ExceptionTest();

        try {
//            et.checkEnoughMoney(50000, 30000);

//            et.checkEnoughMoney(-50000, 50000);

//            et.checkEnoughMoney(50000, -60000);

            et.checkEnoughMoney(30000, 50000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
