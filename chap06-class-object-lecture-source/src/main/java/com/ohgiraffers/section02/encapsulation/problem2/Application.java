package com.ohgiraffers.section02.encapsulation.problem2;

public class Application {

    public static void main(String[] args) {

        /* comment. 필드에 직접 접근하는 경우 발생할 수 있는 문제점을 이해할 수 있다. (2) */
        /* name -> kinds로 변경했기 때문에 직접 name 필드에 접근하는 코드는 전부 컴파일 에러를 발생시킨다.
        *  즉, Monster 클래스의 일부를 수정한 것 뿐인데, 사용하는 곳에서는 전부 함께 수정을 해야 하는 부담이 생긴 것이다.
        *  이것은 유지보수에 악영향을 미친다.
        * */

        Monster monster1 = new Monster();
        monster1.name = "드라큘라";
        monster1.hp = 200;

        Monster monster2 = new Monster();
        monster2.name = "프랑켄슈타인";
        monster2.hp = 300;

        Monster monster3 = new Monster();
        monster3.name = "미이라";
        monster3.hp = 400;

        System.out.println(monster1.name);
        System.out.println(monster1.hp);
        System.out.println(monster2.name);
        System.out.println(monster2.hp);
        System.out.println(monster3.name);
        System.out.println(monster3.hp);

    }
}
