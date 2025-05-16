package com.ohgiraffers.section08.initblock;

public class Product {

    /* 1. 필드를 초기화하지 않으면 JVM이 정한 기본값으로 객체가 생성된다. */
//    private String name;
//    private int price;
//    private static String brand;

    /* 2. 명시적 초기화 */
    private String name = "갤럭시";
    private int price = 1000000;
    private static String brand = "삼송";

    /* 3. 인스턴스 초기화 블럭 */
    {
        name = "사이언";
        price = 900000;
        brand = "사과";
        System.out.println("인스턴스 초기화 블럭 동작함..");
    }

    static {
        /* static 초기화 블럭에서는 non-static 필드를 초기화하지 못한다. */
//        name = "아이펀";
//        price = 10000000;
        brand = "헬지";
        System.out.println("정적 초기화 블럭 동작함..");
    }

    public Product() {}

    /* 4. 매개변수 있는 생성자
    *    : 위에서 초기화된 값을 다 무시하고 생성자에 작성한 초기화 내용으로 인스턴스를 초기화시킨다. */
    public Product(String name, int price, String brand) {
        this.name = name;
        this.price = price;
        Product.brand = brand;
        System.out.println("매개변수 있는 생성자 호출됨..");
    }

    public String getInformation() {

        return "Product [name=" + this.name + ", price=" + this.price + ", brand=" + Product.brand + "]";
    }
}
