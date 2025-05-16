package com.ohgiraffers.section03.grammar;

public enum UserRole2 {

    GUEST("게스트"),
    CONSUMER("구매자"),
    PRODUCER("판매자"),
    ADMIN("관리자");

    private final String description;

    /* 이러한 경우 매개변수 있는 생성자가 반드시 필요하다.
    *  enum 상수의 괄호 안에 넣은 값이 해당 생성자쪽으로 전달되며 Enum 인스턴스가 생성되며,
    *  생성된 인스턴스는 싱클톤 객체이다.
    * */

    UserRole2(String description) {
        this.description = description;
        System.out.println("description : " + description);
    }

    public String getDescription() {
        return description;
    }
}
