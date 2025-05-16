package com.ohgiraffers.section03.copy;

public class Application2 {

    public static void main(String[] args) {

        /* comment. 얕은 복사를 활용하여 매개변수와 리턴값으로 활용할 수 있다. */
        /* 얕은 복사의 활용
        *  주로 메소드 호출 시 인자로 사용하는 경우와
        *  리턴값으로 동일한 배열을 리턴해주고 싶은 경우 사용한다.
        * */

        String[] names = {"홍길동", "유관순", "이순신"};

        System.out.println("names의 hashcode : " + names.hashCode());

        /* 1. 인자와 매개변수로 활용 */
        /* 다른 메소드에서 동일한 배열을 사용하고 싶을 경우 얕은 복사를 이용한다. */
        print(names);

        /* 2. 리턴값으로 활용 */
        String[] animals = getAnimals();

        System.out.println("리턴 받은 animals hashcode : " + animals.hashCode());

        print(animals);

    }

    public static void print(String[] sarr) {

        // 전달받은 배열의 hashcode
        System.out.println("sarr의 hashcode : " + sarr.hashCode());

        // 전달받은 배열의 값
        for(int i = 0; i < sarr.length; i++) {
            System.out.print(sarr[i] + " ");
        }

        System.out.println();
    }

    public static String[] getAnimals() {

        String[] animals = new String[] {"낙타", "호랑이", "나무늘보"};

        // 얕은 복사 확인을 위한 hashcode 출력
        System.out.println("새로 만든 animals의 hashcode : " + animals.hashCode());

        return animals;
    }
}
