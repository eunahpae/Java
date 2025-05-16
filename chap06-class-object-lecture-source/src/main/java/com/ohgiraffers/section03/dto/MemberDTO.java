package com.ohgiraffers.section03.dto;

public class MemberDTO {

    /* 취급하려고 하는 회원정보를 고려해서 필드를 우선 작성해본다.
    *  주로 화면(UI) 혹은 데이터베이스 테이블을 기준으로 한다.
    *  회원번호, 회원명, 나이, 성별, .... 을 관리할 것이다.
    *  객체가 가지는 속성(필드)를 추출하는 과정 또한 추상화라고 볼 수 있다.
    *  DTO클래스를 만들기 위해서는 모든 필드를 private로 만든다.
    * */

    private int number;
    private String name;
    private int age;
    private char gender;
    private double height;
    private double weight;
    private boolean isActivated;    // 회원탈퇴여부(활성화여부)

    /* 이렇게 필드만 만들고 나면 private로 접근이 제한되었기 때문에 각 영역에 접근을 할 수 없다.
    *  public으로 접근을 허용하는 설정자/접근자를 이용해 필드에 간접적으로 접근할 수 있도록 할 것이다.
    * */

    /* 설정자(setter)/접근자(getter)의 경우 실무에서 암묵적으로 통용되는 작성 규칙이 존재한다.
    *  설정자(setter)작성 규칙
    *  : 필드값을 변경할 목적의 매개변수를 변경하려는 필드와 같은 자료형으로 선언하고
    *    호출 당시 전달되는 매개변수의 값을 이용하여 필드의 값을 변경한다.
    *  [표현식]
    *  public void set필드명(매개변수) {
    *      필드 = 매개변수;
    *  }
    *  [작성 예시]
    *  public void setName(String name) {
    *      this.name = name;
    *  }
    *
    *  접근자(getter)작성 규칙
    *  : 필드의 값을 반환받을 목적의 메소드 집합을 의미한다.
    *    각 접근자는 하나의 필드에만 접근하도록 한다.
    *    필드에 접근해서 기록된 값을 return을 이용하여 반환하며, 이 때 반환타입은 반환하려는 값의 자료형과 일치시킨다.
    *  [표현식]
    *  public 반환형 get필드명() {
    *      return 반환값;
    *  }
    *  [작성 예시]
    *  public String getName() {
    *     return name;
    * */

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setActivated(boolean isActivated) {
        this.isActivated = isActivated;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    /* boolean의 접근자는 get으로 시작하지 않고 is로 시작하는 것이 일반적인 관례이다. */
    public boolean isActivated() {

        return isActivated;
    }
}