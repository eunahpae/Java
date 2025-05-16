package com.ohgiraffers.section02.stringbuilder;

public class Application1 {

    public static void main(String[] args) {

        /* comment. String과 StringBuilder의 차이점에 대해 이해하고 사용할 수 있다. */
        /* 두 클래스는 스레드 동기화 기능 제공 여부에 따라 차이점이 있다.
        *  StringBuilder : 스레드 동기화 기능 제공하지 않음
        *                  스레드 동기화처리를 고려하지 않는 상황에서 StringBuffer보다 성능이 좋음
        *  StringBuffer : 스레드 동기화 기능 제공 함
        *                 성능면에서는 StringBuilder보다 느림
        *  두 개의 차이는 스레드 동기화 유무이고, 현재 우리는 스레드를 고려하지 않기 때문에
        *  StringBuilder를 이용하여 자주 사용되는 메소드의 용법을 볼 것이다.
        * */

        StringBuilder sb1 = new StringBuilder("javaoracle");
        /* delete() : 시작 인덱스와 종료 인덱스를 이용해서 문자열에서 원하는 부분의 문자열을 제거한다.
        *  deleteCharAt() : 문자열 인덱스를 이용해서 문자 하나를 제거한다.
        *  둘 다 원본에 영향을 미친다.
        * */
        System.out.println("delete() : " + sb1.delete(2, 5));
        System.out.println("deleteCharAt() : " + sb1.deleteCharAt(0));
        System.out.println(sb1);

        /* insert() : 인자로 전달된 값을 문자열로 변환 후 지정한 인덱스 위치에 추가한다.
        *  원본에 영향을 미친다.
        * */
        System.out.println("insert() : " + sb1.insert(1, "vao"));
        System.out.println("insert() : " + sb1.insert(0, "j"));
        System.out.println("insert() : " + sb1.insert(sb1.length(), "jdbc"));

        System.out.println(sb1);

        /* reverse() : 문자열 인덱스 순번을 역순으로 재배열한다.
        *  원본에 영향을 미친다.
        * */
        System.out.println(sb1.reverse());
        System.out.println(sb1);
    }
}
