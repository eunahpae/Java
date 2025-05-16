package com.ohgiraffers.section01.method;

public class Application2 {

    public static void main(String[] args) {

        System.out.println("main() 시작함...");

        Application2 app2 = new Application2();
        app2.methodA();
        app2.methodB();
        app2.methodC();

        System.out.println("main() 종료됨...");
    }

    public void methodA() {

        System.out.println("methodA() 호출됨...");
        System.out.println("methodA() 종료됨...");
    }

    public void methodB() {

        System.out.println("methodB() 호출됨...");
        System.out.println("methodB() 종료됨...");
    }

    public void methodC() {

        System.out.println("methodC() 호출됨...");
        System.out.println("methodC() 종료됨...");
    }
}
