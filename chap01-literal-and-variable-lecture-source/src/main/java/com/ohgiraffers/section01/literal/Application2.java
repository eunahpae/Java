package com.ohgiraffers.section01.literal;

public class Application2 {

    public static void main(String[] args) {

        /* comment. 값을 직접 연산하여 출력할 수 있다. */
        /* 이 때 값의 형태에 따라 사용할 수 있는 연산자의 종류와 연산의 결과가 달라진다. */

        /* 1. 숫자와 숫자의 연산 */
        /* 1-1. 정수와 정수의 연산 */
        System.out.println("========== 정수와 정수의 연산 ==========");
        System.out.println(123 + 456);
        System.out.println(123 - 456);
        System.out.println(123 * 456);
        System.out.println(123 / 456);
        System.out.println(123 % 456);  // 나머지를 구하는 연산

        /* 1-2. 실수와 실수의 연산 */
        System.out.println("========== 실수와 실수의 연산 ===========");
        System.out.println(1.23 + 1.23);
        System.out.println(1.23 - 0.23);
        System.out.println(1.23 * 10.0);
        System.out.println(1.23 / 10.0);
        System.out.println(1.23 % 1.0); // 약간의 오차가 생긴다

        /* 1-3. 정수와 실수의 연산 */
        /* 결과는 항상 실수가 나온다. */
        System.out.println("========== 정수와 실수의 연산 ============");
        System.out.println(123 + 0.5);
        System.out.println(123 - 0.5);
        System.out.println(123 * 0.5);
        System.out.println(123 / 0.5);
        System.out.println(123 % 0.5);

        /* 2. 문자의 연산 */
        /* 2-1. 문자와 문자의 연산 */
        System.out.println("========== 문자와 문자의 연산 ============");
        System.out.println('a' + 'b');
        System.out.println('a' - 'b');
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');
        System.out.println('a' % 'b');

        /* 2-2. 문자와 정수의 연산 */
        System.out.println("========== 문자와 정수의 연산 ============");
        System.out.println('a' + 1);
        System.out.println('a' - 1);
        System.out.println('a' * 1);
        System.out.println('a' / 1);
        System.out.println('a' % 1);

        /* 2-3. 문자와 실수의 연산 */
        System.out.println("========== 문자와 실수의 연산 =============");
        System.out.println('a' + 1.0);
        System.out.println('a' - 1.0);
        System.out.println('a' * 1.0);
        System.out.println('a' / 1.0);
        System.out.println('a' % 1.0);

        /* 3. 문자열의 연산 */
        /* 3-1. 문자열과 문자열의 연산 */
        /* 문자열과 문자열의 '+' 연산 결과 문자열 합치기(이어 붙이기)가 된다. */
        System.out.println("=========== 문자열과 문자열의 연산 =========");
        System.out.println("hello" + "world");
//        System.out.println("hello" - "world");
//        System.out.println("hello" * "world");
//        System.out.println("hello" / "world");
//        System.out.println("hello" % "world");

        /* 3-2. 문자열과 다른 형태의 값 연산 */
        /* 문자열과의 연산은 '+' 연산만 가능하다. */
        /* 3-2-1. 문자열과 정수의 연산 */
        System.out.println("helloworld" + 123);
        /* 3-2-2. 문자열과 실수의 연산 */
        System.out.println("helloworld" + 1.23);
        /* 3-2-3. 문자열과 문자의 연산 */
        System.out.println("helloworld" + 'a');
        /* 3-2-4. 문자열과 논리값의 연산 */
        System.out.println("helloworld" + true);

        System.out.println("123" + "456");

        /* 4. 논리값 연산 */
        /* 4-1. 논리값과 논리값 연산 */
//        System.out.println(true + false);
//        System.out.println(true - false);
//        System.out.println(true * false);
//        System.out.println(true / false);
//        System.out.println(true % false);

        /* 4-2. 논리값과 정수 연산 */
//        System.out.println(true + 1);

        /* 4-3. 논리값과 실수 연산 */
//        System.out.println(true + 1.0);

        /* 4-4. 논리값과 문자 연산 */
//        System.out.println(true + 'a');

        /* 4-5. 논리값과 문자열 연산 */
        System.out.println(true + "a");
//        System.out.println(true - "a");
//        System.out.println(true * "a");
//        System.out.println(true / "a");
//        System.out.println(true % "a");
    }
}
