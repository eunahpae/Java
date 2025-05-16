package com.ohgiraffers.section05.overloading;

public class OverloadingTest {

    /* comment. 오버로딩에 대해 이해할 수 있다. */

    /* 오버로딩이란?
    *  매개변수 부분의 타입, 갯수, 순서를 다르게 작성하면 서로 다른 메소드나 생성자로 인식하기 때문에
    *  동일한 이름의 생성자나 메소드를 여러 개 작성할 수 있는 것을 오버로딩 이라고 한다.
    *
    *  오버로딩의 사용 이유?
    *  매개변수의 종류별로 메소드 내용을 다르게 작성해야하는 경우들이 종종 있다.
    *  이 때, 동일한 기능의 메소드를 매개변수에 따라 다르게 이름을 정의하면 복잡하고 관리하기가 매우 어렵다.
    *  따라서 동일한 이름으로 다양한 종류의 매개변수에 따라 처리해야하는 여러 메소드를 동일한 이름으로 관리하기 위해
    *  사용하는 기술을 오버로딩이라고 한다.
    *
    *  오버로딩의 조건
    *  동일한 이름을 가진 메소드의 파라미터 선언부에 매개변수의 타입, 갯수, 순서를 다르게 작성하여
    *  한 클래스 내에 동일한 이름의 메소드를 여러 개 작성할 수 있도록 한다.
    *  메소드의 시그니쳐가 다르면 다른 메소드로 인식하기 때문이다.
    *  즉, 시그니쳐 중 메소드 이름은 동일해야 하기 때문에 파라미터 선언부가 다르게 작성되어야 오버로딩이 성립된다.
    * */

    public void test() {}

//    public void test() {}

//    private void test() {}    // 접근제한자는 메소드 시그니처에 해당하지 않는다.

//    public int test() { return 0; }   // 반환형은 메소드 시그니처에 해당하지 않는다.

    public void test(int num) {}

//    public void test(int num2) {}  // 매개변수의 이름은 메소드 시그니처에 영향을 주지 않는다.

    public void test(int num1, int num2) {} // 매개변수 갯수

    public void test(int num1, String name) {}  // 매개변수 타입

    public void test(String name, int num1) {} // 매개변수 순서
}
