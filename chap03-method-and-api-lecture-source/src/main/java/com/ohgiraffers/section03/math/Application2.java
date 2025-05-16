package com.ohgiraffers.section03.math;

public class Application2 {

    public static void main(String[] args) {

        /* comment. 사용자 지정 범위의 난수를 발생시킬 수 있다. */
        /* 난수의 활용
        *  Math.random()을 이용해 발생한 난수는 0부터 1전까지의 실수 범위의 난수값을 반환한다.
        *  필요에 따라 정수 형태의 값을 원하는 범위 만큼 발생시켜야 하는 경우들이 존재한다.
        * */

        /* 원하는 범위의 난수를 구하는 공식
        *  (int) (Math.random * 구하려는 난수의 갯수) + 구하려는 난수의 최소값
        * */

        /* 1. 0 ~ 9까지의 난수 발생 */
        int random1 = (int) (Math.random() * 10);
        System.out.println(random1);

        /* 2. 1 ~ 10까지의 난수 발생 */
        int random2 = (int) (Math.random() * 10) + 1;

        /* 3. 10 ~ 15까지의 난수 발생 */
        int random3 = (int) (Math.random() * 6) + 10;

        /* 4. -128 ~ 127까지의 난수 발생 */
        int random4 = (int) (Math.random() * 256) - 128;
    }
}