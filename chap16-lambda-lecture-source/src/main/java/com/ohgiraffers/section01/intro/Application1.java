package com.ohgiraffers.section01.intro;

public class Application1 {

    public static void main(String[] args) {

        /* comment. 람다식에 대해 이해하고 사용할 수 있다. */
        /* 람다식(lambda)
        *  메소드를 하나의 식(expression)으로 표현한 것이다.
        *  메소드를 람다식으로 표현하면 메소드 이름이 없는 익명함수라고 할 수 있다.
        *  수학 : f(x, y) = x * y
        *  -> 람다식 : (x, y) -> x * y
        *
        *  람다식을 사용하는 장점은 단순함이다.
        *  람다식을 활용하면 컬렉션에 연계하여 데이터를 쉽게 조작할 수 있으며, 불필요한 반복되는 코드도 제거 할 수 있다.
        *  최근에는 적극적으로 활용하는 추세이다.
        *
        *  람다 표현식
        *  매개변수가 없는 경우
        *  () -> {...}
        *
        *  매개변수가 있는 경우
        *  (매개변수, ...) -> {...}
        *
        *  람다식에서 매개변수의 타입은 추론이 가능하기 때문에 명시적으로 작성하지 않아도 된다.
        *  또한, 매개변수가 한 개만 존재하는 경우 ()를 생략할 수 있으며,
        *  실행문이 한 줄인 경우 {}는 생략 가능하다.
        * */

        /* 인터페이스에 정의된 추상메소드를 활용하기 위해서는 3가지 방법이 있다.
        * 1. 인터페이스를 상속받은 클래스를 정의하여 기능을 완성 후 사용하는 방법
        * 2. 익명클래스를 활용하여 메소드 재정의 후 사용하는 방법
        * 3. 람다식을 활용하는 방법
        * */

        Calculator c1 = new CalculatorImpl();
        System.out.println("10과 20의 합은 : " + c1.sumTwoNumber(10, 20));

        Calculator c2 = new Calculator() {
            @Override
            public int sumTwoNumber(int a, int b) {
                return  a + b;
            }
        };

        System.out.println("20과 30의 합은 : " + c2.sumTwoNumber(20, 30));

        Calculator c3 = (x, y) -> x + y;
        System.out.println("40과 50의 합은 : " + c3.sumTwoNumber(40, 50));
    }
}
