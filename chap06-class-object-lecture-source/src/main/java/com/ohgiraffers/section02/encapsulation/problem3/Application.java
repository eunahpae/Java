package com.ohgiraffers.section02.encapsulation.problem3;

public class Application {

    public static void main(String[] args) {

        /* comment. 필드에 직접 접근하는 경우 발생할 수 있는 문제점 해결하는 방법을 이해하고 적용할 수 있다. */

        Monster monster1 = new Monster();
        monster1.setInfo("드라큘라");
        monster1.setHp(100);

        Monster monster2 = new Monster();
        monster2.setInfo("프랑켄슈타인");
        monster2.setHp(200);

        Monster monster3 = new Monster();
        monster3.setInfo("늑대인간");
        monster3.setHp(-300);

        System.out.println(monster1.getInfo());
        System.out.println(monster2.getInfo());
        System.out.println(monster3.getInfo());

        Monster monster4 = new Monster();
        monster4.name = "두치";
        monster4.hp = -500;

        System.out.println(monster4.getInfo());

    }
}
