package com.ohgiraffers.section05.logical;

public class Application1 {

    public static void main(String[] args) {

        /* comment. 논리 연산자에 대해 이해하고 활용할 수 있다. */
        /* 논리연산자의 종류
        * 1. 논리 연결 연산자 : 두 개의 피연산자를 가지는 이항 연산자이며, 연산자의 결합 방향은 왼쪽에서 오른쪽이다.
        *                     두 개의 논리식을 판단하여 참과 거짓을 판단한다.
        *    1-1. &&(논리 AND) 연산자 : 두 개의 논리식 모두 참 일 경우 참을 반환, 둘 중 한 개라도 거짓인 경우 거짓을 반환한다.
        *    1-2. ||(논리 OR) 연산자 : 두 개의 논리식 중 둘 중 하나라도 참 일 경우 참을 반환, 둘 다 모두 거짓일 경우 거짓을 반환한다.
        *
        * 2. 논리 부정 연산자 : 피연산자가 하나인 단항연산자로, 피연산자의 결합 방향을 왼쪽에서 오른쪽이다.
        *    2-1. !(논리 NOT) 연산자 : 논리식의 결과가 참이면 거짓을, 거짓이면 참을 반환한다.
        * */

        /* 1. 논리 연산자 결과값 확인 */
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println(!true);
        System.out.println(!false);

        /* 2. 논리식에 논리연산자 활용 */
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;

        System.out.println(a < b && c < d);
        System.out.println(a < b && c > d);
        System.out.println(a > b && c < d);
        System.out.println(a > b && c > d);

        System.out.println(a < b || c < d);
        System.out.println(a < b || c > d);
        System.out.println(a > b || c < d);
        System.out.println(a > b || c > d);
    }
}
