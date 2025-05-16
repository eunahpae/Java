package com.ohgiraffers.section01.array;

public class Application3 {

    /* comment. 배열에 초기화되는 자료형별 기본값을 이해할 수 있다. */

    /* 값의 형태 별 기본값
    *  정수 : 0
    *  실수 : 0.0
    *  논리 : false
    *  문자 : \u0000
    *  참조 : null
    * */
    public static void main(String[] args) {

        int[] iarr = new int[5];

        System.out.println(iarr[0]);
        System.out.println(iarr[1]);
        System.out.println(iarr[2]);
        System.out.println(iarr[3]);
        System.out.println(iarr[4]);

        for(int i = 0; i < iarr.length; i++) {
            System.out.println(iarr[i]);
        }

        /* 자바에서 지정한 기본값 외의 값으로 초기화를 하고 싶은 경우 블럭을 이용한다.
        *  블럭을 사용하는 경우 new를 사용하지 않아도 되며, 값의 갯수만큼 자동으로 크기가 설정된다.
        * */
        int[] iarr2 = {11, 22, 33, 44, 55};

        int[] iarr3 = new int[] {11, 22, 33, 44, 55};

        System.out.println("iarr2 = " + iarr2.length);
        System.out.println("iarr3 = " + iarr3.length);

        // 초기화 값 확인
        for(int i = 0; i < iarr2.length; i++) {
            System.out.println(iarr2[i]);
        }

        String[] sarr = {"apple", "banana", "grape", "orange"};

        for(int i = 0; i < sarr.length; i++) {
            System.out.println(sarr[i]);
        }
    }
}
