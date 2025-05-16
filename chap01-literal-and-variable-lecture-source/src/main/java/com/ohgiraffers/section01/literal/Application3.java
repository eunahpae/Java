package com.ohgiraffers.section01.literal;

public class Application3 {

    public static void main(String[] args) {

        /* comment. 문자열 합치기 결과를 예측하고 사용할 수 있다. */
        /* 1. 두 개의 문자열 합치기 */
        System.out.println("========= 두 개의 문자열 합치기 =========");
        System.out.println(9 + 9);
        System.out.println("9" + 9);
        System.out.println(9 + "9");
        System.out.println("9" + "9");

        /* 2. 세 개의 문자열 합치기 */
        System.out.println("========= 세 개의 문자열 합치기 =========");
        System.out.println(9 + 9 + "9");    // '+' 연산 방향은 왼쪽에서 오른쪽이다.
        System.out.println(9 + "9" + 9);
        System.out.println("9" + 9 + 9);

        System.out.println("9" + (9 + 9));

        /* 3. 문자열 합치기 응용 */
        System.out.println(10 + 20);
        System.out.println(10 - 20);
        System.out.println(10 * 20);
        System.out.println(10 / 20);
        System.out.println(10 % 20);

        System.out.println("========== 결과 보기 좋게 출력 ============");
        System.out.println("10과 20의 합 : " + (10 + 20));
        System.out.println("10과 20의 차 : " + (10 - 20));
        System.out.println("10과 20의 곱 : " + (10 * 20));
        System.out.println("10과 20의 나누기 한 몫 : " + (10 / 20));
        System.out.println("10과 20의 나누기 한 나머지 : " + (10 % 20));
    }
}
