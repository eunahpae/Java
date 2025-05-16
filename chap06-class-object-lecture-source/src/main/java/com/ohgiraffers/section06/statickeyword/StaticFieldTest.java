package com.ohgiraffers.section06.statickeyword;

public class StaticFieldTest {

    private int nonStaticCount;

    private static int staticCount;

    public StaticFieldTest() {}

    public int getNonStaticCount() {
        return nonStaticCount;
    }

    /* static 필드에 접근하기 위해서는 클래스명.필드명으로 접근한다. */
    public int getStaticCount() {
        return StaticFieldTest.staticCount;
    }

    /* 필드 값을 1씩 증가시키기 위한 메소드 */
    public void increaseNonStaticCount() {
        nonStaticCount++;
    }

    public void increaseStaticCount() {
        StaticFieldTest.staticCount++;
    }
}