package com.ohgiraffers.section03.grammar;

public class Application {

    public static void main(String[] args) {

        /* comment. Enum의 문법에 대해 이해하고 사용할 수 있다. */
        UserRole admin = UserRole.ADMIN;
        System.out.println(admin);
        System.out.println(admin.getNameToLowerCase());

        UserRole2 consumer = UserRole2.CONSUMER;
        System.out.println(consumer.ordinal() + " " + consumer.name() + " " + consumer.getDescription());

        UserRole2 consumer2 = UserRole2.CONSUMER;
        System.out.println(consumer == consumer2);
    }
}
