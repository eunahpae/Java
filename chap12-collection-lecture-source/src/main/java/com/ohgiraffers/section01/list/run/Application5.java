package com.ohgiraffers.section01.list.run;

import java.util.LinkedList;
import java.util.Queue;

public class Application5 {

    public static void main(String[] args) {

        /* comment. Queue에 대해 이해하고 사용할 수 있다. */
        /* Queue는 선형 메모리 공간에 데이터를 저장하는
        * 선입선출(FIFO - First Input First Out)방식의 자료구조이다.
        * Queue 인터페이스를 상속받는 하위 인터페이스들은
        * Deque, BlockingQueue, BlockingDeque, TransferQueue등 다양하지만
        * 대부분의 큐는 LinkedList를 이용한다.
        * */
//        Queue<String> que = new Queue<>();

        Queue<String> que = new LinkedList<>();

        // 데이터를 넣을 때 offer()
        que.offer("first");
        que.offer("second");
        que.offer("third");
        que.offer("fourth");
        que.offer("fifth");

        System.out.println(que);

        // peek() : 해당 큐의 가장 앞에 있는 요소(먼저 들어온 요소)를 반환한다.
        // poll() : 해당 큐의 가장 앞에 있는 요소(먼저 들어온 요소)를 반환하고 제거한다.

        System.out.println(que.peek());
        System.out.println(que.peek());

        System.out.println(que);

        System.out.println(que.poll());
        System.out.println(que.poll());

        System.out.println(que);
    }
}
