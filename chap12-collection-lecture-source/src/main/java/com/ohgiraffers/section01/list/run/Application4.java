package com.ohgiraffers.section01.list.run;

import java.util.Stack;

public class Application4 {

    public static void main(String[] args) {

        /* comment. Stack에 대해 이해하고 사용할 수 있다. */
        /* Stack은 리스트 계열 클래스의 Vector 클래스를 상속받아 구현하였다.
        *  스택 메모리 구조는 선형 메모리 공간에 데이터를 저장하며
        *  후입선출(LIFO - Last Input First Out)방식의 자료 구조라 불린다.
        * */

        Stack<Integer> integerStack = new Stack<>();

        // 값을 넣을 때 push()
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);

        System.out.println(integerStack);

        // 요소를 찾을 때 search()
        System.out.println(integerStack.search(5));

        // peek() : 해당 스택의 가장 마지막에 있는(상단에 있는) 요소 반환
        // pop() : 해당 스택의 가장 마지막에 있는(상단에 있는) 요소 반환 후 제거

        System.out.println(integerStack.peek());
        System.out.println(integerStack);

        System.out.println(integerStack.pop());
        System.out.println(integerStack.pop());
        System.out.println(integerStack.pop());
        System.out.println(integerStack.pop());
        System.out.println(integerStack.pop());
//        System.out.println(integerStack.pop());
        System.out.println(integerStack);

    }
}
