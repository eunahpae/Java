package com.ohgiraffers.section02.set.run;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application1 {

    public static void main(String[] args) {

        /* comment. Set 자료구조의 특성을 이해하고 HashSet을 이해할 수 있다. */
        /* Set 인터페이스를 구현한 Set 클래스의 특징
        *  1. 요소의 저장 순서를 유지하지 않는다.
        *  2. 같은 요소의 중복 저장을 허용하지 않는다. (null값도 중복하지 않게 하나의 null만 저장한다.)
        *
        *
        * HashSet 클래스
        * Set 컬렉션 클래스에서 가장 만힝 사용되는 클래스 중 하나이다.
        * 해시 알고리즘을 사용하여 검색 속도가 빠르다는 장점을 가진다.
        * */

        HashSet<String> hset = new HashSet<>();

//        Set hset2 = new HashSet();
//        Collection hset3 = new HashSet<>();

        hset.add("java");
        hset.add("oracle");
        hset.add("jdbc");
        hset.add("html");
        hset.add("css");

        System.out.println(hset);

        hset.add("java");

        System.out.println(hset);
        System.out.println(hset.size());
        System.out.println(hset.contains("oracle"));

        /* 저장된 객체를 하나씩 꺼내는 기능이 없다.
        * 반복문을 이용해서 연속처리하는 방법 2가지가 있다. */

        /* 1. toArray()배열로 바꾸고 반복문 사용 */
        Object[] arr = hset.toArray();
        for(int i = 0; i < arr.length; i++) {
            System.out.println(i + " : " + arr[i]);
        }

        /* 2. iterator()로 목록 만들어 연속 처리 */
        Iterator<String> iter = hset.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        hset.clear();
        System.out.println(hset.isEmpty());
    }
}
