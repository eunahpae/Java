package com.ohgiraffers.section04.overflow;

public class Application1 {

    public static void main(String[] args) {

        /* comment. 오버플로우에 대해 이해할 수 있다. */
        /* 자료형 별 값의 최대 범위를 벗어나는 경우
        *  발생한 carry를 버림처리하고 sign bit를 반전시켜 최소값으로 순환시킴
        * */

        /* 오버플로우 */
        byte num1 = 127;

        System.out.println("num1 = " + num1);   // byte의 최대 저장 범위

        num1++;

        System.out.println("num1 = " + num1);   // byte의 최소 저장 범위

        /* 언더플로우 */
        /* 오버플로우와 반대 개념으로 최소 범위보다 작은 수를 발생시키는 경우 언더플로우가 발생한다. */
        byte num2 = -128;

        System.out.println("num2 = " + num2);   // byte의 최소 저장 범휘

        num2--;

        System.out.println("num2 = " + num2);   // byte의 최대 저장 범위

        int firstNum = 1000000;
        int secondNum = 700000;

        // 범위를 벗어난 계산은 오버플로우를 발생시켜서 원하지 않는 결과값이 나오게 될 수 있다.
        int multi = firstNum * secondNum;   // 7천억이 나와야함
        System.out.println("multi = " + multi);

        /* 해결방법 - 안됨 */
        long longMulti = firstNum * secondNum;
        System.out.println("longMulti = " + longMulti);

        /* 이미 오버플로우 처리 된 결과를 가지고 변수에 담기 때문에 위에 결과랑 별 차이가 없다.
        *  계산이 처리되기 전에 long 타입으로 자료형을 변경해주어야 한다. (강제형변환 이용)
        * */
        long result = (long) firstNum * secondNum;
        System.out.println("result = " + result);
    }
}
