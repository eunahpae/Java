package com.ohgiraffers.section01.exception;

public class Application2 {

    public static void main(String[] args) {

        /* comment. try-catch 블럭을 이용하여 예외처리를 할 수 있다. */
        /* 2. try-catch로 처리 */
        ExceptionTest et = new ExceptionTest();

        try {
            /* 예외 발생 가능성이 있는 메소드는 try 블럭 안에서 호출 */
            et.checkEnoughMoney(50000, 10000);

            /* 위의 메소드 호출 시 예외가 발생하지 않는 경우 이후 내용이 실행 */
            System.out.println("================ 상품 구입 가능 ==============");

        } catch (Exception e) {

            /* 위의 메소드 호출 시 예외가 발생하는 경우 catch 블럭의 코드가 실행 */
            System.out.println("================ 상품 구입 불가능 ===============");
        }

        System.out.println("프로그램을 종료합니다.");
    }
}
