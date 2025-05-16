package com.ohgiraffers.section02.encapsulation.problem4;

public class Application {

    public static void main(String[] args) {

        /* comment. 접근제한자에 대해 이해하고 직접 필드에 접근하지 못하게 강제화 할 수 있다. */

        /* 1. private 필드에 직접 접근 하여 compile error 발생 확인 */
        Monster monster1 = new Monster();
//        monster1.kinds = "프랑켄슈타인";
//        monster1.hp = 200;

        /* 선언한 필드대로 공간은 생성되어 있지만 직접 접근하지 못하고
        *  public으로 접근을 허용한 메소드만 이용할 수 있도록 해 놓은 것이다.
        *  이것을 캡슐화 라고 한다.
        * */

        /* 2. public 메소드를 이용하여 필드에 간접 접근 */
        monster1.setKinds("프랑켄슈타인");
        monster1.setHp(200);

        System.out.println(monster1.getInfo());
    }
}
