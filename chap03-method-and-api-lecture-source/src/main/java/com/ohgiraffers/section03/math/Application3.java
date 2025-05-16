package com.ohgiraffers.section03.math;

import java.util.Random;

public class Application3 {

    public static void main(String[] args) {

        /* comment. java.util.Random 클래스를 활용하여 사용자 지정 범위의 난수를 발생시킬 수 있다. */
        /* java.util.Random 클래스의 nextInt() 메소드를 이용한 난수 발생
        * */

        /* 원하는 범위의 난수를 구하는 공식
        *  random.nextInt(구하려는 난수의 갯수) + 구하려는 난수의 최소값
        * */

        Random random = new Random();

        /* 1. 0 ~ 9까지 난수 발생 */
        int random1 = random.nextInt(10);
        System.out.println("random1 = " + random1);

        /* 2. 1 ~ 10까지 난수 발생 */
        int random2 = random.nextInt(10) + 1;

        /* 3. 20 ~ 45까지 난수 발생 */
        int random3 = random.nextInt(26) + 20;

        /* 4. -128 ~ 127까지 난수 발생 */
        int random4 = random.nextInt(256) - 128;
    }
}