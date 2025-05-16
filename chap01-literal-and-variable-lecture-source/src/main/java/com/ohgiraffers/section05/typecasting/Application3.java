package com.ohgiraffers.section05.typecasting;

public class Application3 {

    public static void main(String[] args) {

        /* comment. 자동 형변환과 강제 형변환을 이용하여 서로 다른 자료형끼리 연산을 수행할 수 있다. */
        int inum = 10;
        long lnum = 100;

        /* 1. 두 수의 연산 결과를 int 형으로 변한 후 int 자료형 변수에 리턴받는다. */
//        int isum = inum + lnum;
        int isum = (int) (inum + lnum);

        /* 2. long 형 값을 int 강제 형변환 한다. */
        int isum2 = inum + (int) lnum;

        /* 3. 결과 값을 long 형 자료형으로 받는다. (자동형변환 이용) */
        long lsum = inum + lnum;

        /* 주의사항. int미만 연산의 처리 결과는 int형이다. */
        byte byteNum1 = 1;
        byte byteNum2 = 2;
        short shortNum1 = 3;
        short shortNum2 = 4;

        int result1 = byteNum1 + byteNum2;
        int result2 = byteNum1 + shortNum1;
        int result3 = shortNum1 + byteNum1;
        int result4 = shortNum1 + shortNum2;

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
        System.out.println("result4 = " + result4);


    }
}
