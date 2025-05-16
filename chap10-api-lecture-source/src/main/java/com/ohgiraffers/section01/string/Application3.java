package com.ohgiraffers.section01.string;

import java.util.StringTokenizer;

public class Application3 {

    public static void main(String[] args) {

        /* comment. 문자열 분리에 대해 이해하고 적용할 수 있다. */
        /* 문자열을 특정 구분자로 하여 분리한 문자열을 반환하는 기능을 한다.
        *  split() : 정규표현식 이용하여 문자열을 분리한다.
        *            정규표현식을 이용하기 때문에 속도가 느리다는 단점을 가진다.
        *
        *  StringTokenizer : 문자열의 모든 문자들을 구분자로 하여 문자열을 구분한다.
        *                    split()보다 속도면에서 더 빠르다.
        * */
        String emp1 = "100/홍길동/서울/영업부"; // 모든 값 존재함
        String emp2 = "200/유관순//총무부";   // 주소 없음
        String emp3 = "300/이순신/경기도";    // 부서 없음

        String[] empArr1 = emp1.split("/");
        String[] empArr2 = emp2.split("/");
        String[] empArr3 = emp3.split("/");

        for(int i = 0; i < empArr1.length; i++) {
            System.out.println(empArr1[i]);
        }

        for(int i = 0; i < empArr2.length; i++) {
            System.out.println(empArr2[i]);
        }

        for(int i = 0; i < empArr3.length; i++) {
            System.out.println(empArr3[i]);
        }

        StringTokenizer st1 = new StringTokenizer(emp1, "/");
        StringTokenizer st2 = new StringTokenizer(emp2, "/");
        StringTokenizer st3 = new StringTokenizer(emp3, "/");

        while (st1.hasMoreTokens()) {
            System.out.println(st1.nextToken());
        }

        while (st2.hasMoreTokens()) {
            System.out.println(st2.nextToken());
        }

        while (st3.hasMoreTokens()) {
            System.out.println(st3.nextToken());
        }
    }
}
