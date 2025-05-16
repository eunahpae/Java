package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        /* comment. 배열의 사용 방법을 익혀 배열을 사용할 수 있다. */
        /* 배열의 사용 방법
        *  1. 배열의 선언
        *  2. 배열의 할당
        *  3. 배열의 인덱스 공간에 값 대입
        * */

        /* 1. 배열의 선언 */
        /* 자료형[] 변수명; */
        /* 자료형 변수명[]; 로 선언할 수 있다. */

        /* 선언은 stack에 배열의 주소를 보관할 수 있는 공간을 만드는 것이다. */
        int[] iarr;
        char carr[];

        /* 2. 배열의 할당
        * 선언한 레퍼런스변수에 배열을 할당하여 대입할 수 있다.
        * new 연산자는 heap 영역에 공간을 할당하고 발생한 주소값을 반환하는 연산자이다.
        * 발생한 주소를 레퍼런스변수(참조형 변수)에 저장하고 이것을 참조하여 사용하기 때문에 참조자료형이라고 한다.
        * */

        /* 배열을 할당할 때는 반드시 배열의 크기를 지정해 주어야 한다. */
//        iarr = new int[];
        iarr = new int[5];
        carr = new char[10];

        /* 선언과 할당을 동시에 할 수 있다. */
        int[] iarr2 = new int[5];
        char carr2[] = new char[10];

        /* heap 메모리는 이름으로 접근하는 것이 아닌 주소로 접근하는 영역이다.
        *  stack에 저장된 주소로 heap에 할당된 배열을 찾아갈 수 있다.
        * */
        System.out.println("iarr2 = " + iarr2); // 16진수 주소값 출력
        System.out.println("carr2 = " + carr2);

        /* hashcode() : 일반적으로 객체의 주소값을 10진수로 변환하여 생성한 객체의 고유한 정수값을 반환한다.
        *  동일객체인지 비교할 때 사용할 목적으로 쓰여진다.
        * */
        System.out.println(iarr2.hashCode());
        System.out.println(carr2.hashCode());

        /* length : 배열의 길이를 알 수 있는 기능 */
        System.out.println(iarr2.length);
        System.out.println(carr2.length);

        Scanner sc = new Scanner(System.in);

        System.out.print("새로 할당할 배열의 길이를 입력하세요 : ");
        int size = sc.nextInt();

        double[] darr = new double[size];

        System.out.println(darr.hashCode());
        System.out.println(darr.length);

        darr = new double[30];

        System.out.println(darr.hashCode());
        System.out.println(darr.length);

        darr = null;

        /* NullPointerException : 아무것도 참조하지 않고 null이라는 특수한 값을 참조하고 있는 경우
        *                         참조연산자를 사용하게 될 때 발생하는 에러이다.
        * */
//        System.out.println(darr.length);
    }
}
