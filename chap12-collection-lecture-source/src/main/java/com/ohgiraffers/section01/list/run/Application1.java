package com.ohgiraffers.section01.list.run;

import java.util.*;

public class Application1 {

    public static void main(String[] args) {

        /* comment. 컬렉션 프레임워크에 대해 이해할 수 있다.
        *  컬렉션 프레임워크는 데이터를 효율적으로 저장하는 자료구조와
        *  데이터를 처리하는 알고리즘을 미리 구현해놓은 클래스이다.
        * */

        /* Collection Framework는 크게 3가지 인터페이스 중 한 가지를 상속받아 구현해 놓았다.
        *  1. List 인터페이스
        *  2. Set 인터페이스
        *  3. Map 인터페이스
        *
        *
        *  각 인터페이스 별 특징
        *  1. List 인터페이스
        *  - 순서 있는 데이터 집합으로 데이터의 중복 저장을 허용한다.
        *  - Vector, ArrayList, LinkedList, Stack, Queue 등이 있다.
        *  2. Set 인터페이스
        *  - 순서가 없는 데이터 집합으로 데이터의 중복을 허용하지 않는다.
        *  - HashSet, TreeSet 등이 있다.
        *  3. Map 인터페이스
        *  - 키와 값 한 쌍으로 이루어지는 데이터 집합이다.
        *  - key를 Set 방식으로 관리하기 때문에 데이터의 순서를 관리하지 않고 중복된 key를 허용하지 않는다.
        *  - value는 중복된 값을 저장할 수 있다.
        *  - HashMap, TreeMap, HashTable, Properties 등이 있다.
        * */

        /* ArrayList
        * 가장 많이 사용되는 컬렉션 클래스이다.
        * 내부적으로 배열을 이용하여 요소를 관리하며, 인덱스를 이용해 배열 요소에 빠르게 접근할 수 있다.
        *
        * ArrayList는 배열의 단점을 보완하기 위해 만들어졌다.
        * 배열은 크기를 변경할 수 없고, 요소의 추가, 삭제, 정렬 등이 복잡하다는 단점을 가지고 있다.
        * ArrayList는 저러한 배열의 단점을 보완하고자
        * 크기 변경, 요소의 추가, 삭제, 정렬 기능들을 미리 메소드로 구현해서 제공하고 있다.
        * 자동적으로 수행되는 것이지 속도가 빨라지는 것이 아니다.
        * */
        ArrayList alist = new ArrayList();

        List list = new ArrayList();

        Collection clist = new ArrayList<>();

        alist.add("apple");
        alist.add(123);
        alist.add(45.34);
        alist.add(new Date());

        System.out.println(alist);

        System.out.println(alist.size());

        for(int i = 0; i < alist.size(); i++) {
            System.out.println(i + " : " + alist.get(i));
        }

        // 데이터의 중복 저장을 허용
        alist.add("apple");
        System.out.println(alist);

        alist.add(1, "banana");
        System.out.println(alist);

        // 값을 삭제할 때
        alist.remove(2);
        System.out.println(alist);

        // 값을 수정할 때
        alist.set(1, Boolean.valueOf(true));
        System.out.println(alist);

        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
//        stringList.add(123);
        stringList.add("banana");
        stringList.add("orange");
        stringList.add("mango");
        stringList.add("grape");

        System.out.println(stringList);

        // 오름차순 정렬
        Collections.sort(stringList);

        System.out.println(stringList);

        stringList = new LinkedList<>(stringList);

        /* Iterator 반복자 인터페이스를 활용해서 역순으로 정렬한다.
        * LinkedList 타입으로 형변환 한 후 descendingIterator() 메소드를 사용하면
        * 내림차순 정렬된 Iterator 타입의 목록으로 반환을 해 준다.
        *
        * Iterator란?
        * Collection 인터페이스의 iterator() 메소드를 이용해서 인스턴스를 생성할 수 있다.
        * 컬렉션에서 값을 읽어오는 방식을 통일된 방식으로 제공하기 위해 사용한다.
        * 반복자 라고 불리우며, 반복문을 이용해서 목록을 하나씩 꺼내는 방식으로 사용하기 위함이다.
        * 인덱스로 관리되는 컬렉션이 아닌 경우에는 반복문을 사용해서 요소에 하나씩 접근할 수 없기 때문에
        * 인덱스를 사용하지 않고도 반복문을 사용하기 위한 목록을 만들어주는 역할이라고 보면 된다.
        * hasNext() : 다음 요소를 가지고 있는 경우 true, 더 이상 요소가 없는 경우 false 반환
        * next() : 다음 요소를 반환
        * */
        Iterator<String> dIter = ((LinkedList<String>) stringList).descendingIterator();

//        while (dIter.hasNext()) {
//            System.out.println(dIter.next());
//        }

        List<String> descList = new ArrayList<>();
        while (dIter.hasNext()) {
           descList.add(dIter.next());
        }
        System.out.println(descList);
    }
}
