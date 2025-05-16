package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application2 {

    public static void main(String[] args) {

        /* comment. 다양한 타입의 예외를 multi block을 이용해서 처리할 수 있다. */

        ExceptionTest et = new ExceptionTest();

        try {
            et.checkEnoughMoney(-20000, 30000);
        } catch (PriceNegativeException e) {
            System.out.println("PriceNagativeException 발생!");
            System.out.println(e.getMessage());
        } catch (MoneyNegativeException e) {
            System.out.println("MoneyNagativeException 발생!");
            System.out.println(e.getMessage());
        } catch (NotEnoughMoneyException e) {
            System.out.println("NotEnoughMoneyException 발생!");
            System.out.println(e.getMessage());
        } finally {
            /* 예외 발생 여부와 상관 없이 실행할 내용 */
            System.out.println("finally 블럭의 내용이 동작함");
        }
    }
}
