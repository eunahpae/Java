package com.ohgiraffers.section02.demensinal;

public class Application1 {

    public static void main(String[] args) {

        /* comment. 다차원 배열의 구조를 이해하고 사용할 수 있다. */
        /* 다차원 배열?
        *  2차원 이상의 배열을 의미한다.
        *  배열의 인덱스마다 또 다른 배열의 주소를 보관하는 배열을 의미한다.
        *  즉, 2차원 배열은 1차원 배열 여러 개를 하나로 묶어서 관리하는 배열을 의미한다.
        *  더 많은 차원의 배열을 사용할 수 있지만 일반적으로 2차원 배열보다 더 높은 차원의 배열은 사용 빈도가 적다.
        * */

        /* 2차원 배열을 사용하는 방법
        *  1. 배열의 주소를 보관할 레퍼런스 변수 선언(stack)
        *  2. 여러 개의 1차원 배열의 주소를 관리하는 배열을 생성(heap)
        *  3. 각 인덱스에서 관리하는 배열을 할당(heap)하여 주소를 보관하는 배열에 저장
        *  4. 생성한 여러 개의 1차원 배열에 차례로 접근해서 사용
        * */

        /* 1. 배열의 주소를 보관할 레퍼런스 변수 선언(stack) */
        int[][] iarr1;
        int iarr2[][];
        int[] iarr3[];

        /* 2. 여러 개의 1차원 배열의 주소를 관리하는 배열을 생성(heap) */
//        iarr1 = new int[][];
//        iarr1 = new int[][4];   // 주소를 묶어서 관리할 배열의 크기를 지정하지 않으면 에러 발생
        iarr1 = new int[3][];

        /* 3. 각 인덱스에서 관리하는 배열을 할당(heap)하여 주소를 보관하는 배열에 저장 */
        iarr1[0] = new int[5];
        iarr1[1] = new int[5];
        iarr1[2] = new int[5];

        // 앞 부분은 주소를 관리하는 배열의 크기, 뒷 부분은 각 인덱스 할당하는 배열의 길이
        iarr2 = new int[3][5];

        /* 4. 생성한 여러 개의 1차원 배열에 차례로 접근해서 사용 */

        // 0번째 인덱스의 배열 값 출력
        for(int i = 0; i < iarr1[0].length; i++) {
            System.out.print(iarr1[0][i] + " ");
        }
        System.out.println();

        // 1번째 인덱스의 배열 값 출력
        for(int i = 0; i < iarr1[1].length; i++) {
            System.out.print(iarr1[1][i] + " ");
        }
        System.out.println();

        // 2번째 인덱스의 배열 값 출력
        for(int i = 0; i < iarr1[2].length; i++) {
            System.out.print(iarr1[2][i] + " ");
        }
        System.out.println();
    }
}
