package com.ohgiraffers.section03.map.run;

import java.util.*;

public class Application1 {

    public static void main(String[] args) {

        /* comment. Map의 자료구조에 대해 이해하고 HashMap을 이용할 수 있다. */
        /* Map 인터페이스 특징
        * Collection 인터페이스와는 다른 저장 방식을 가진다.
        * 키(key)와 값(value)를 하나의 쌍으로 저장하는 방식을 사용한다.
        *
        *
        * 키(key)란?
        * 값(value)를 찾기 위한 역할을 하는 객체를 의미한다.
        * 1. 요소의 저장 순서를 유지하지 않는다.
        * 2. 키는 중복을 허용하지 않지만, 키가 다르면 중복되는 값은 저장 가능하다.
        *
        * HashMap, HashTable, TreeMap 등의 대표적인 클래스가 있다.
        * HashMap이 가장 많이 사용된다.
        * 해시 알고리즘을 사용하여 검색 속도가 매우 빠르다.
        * */

        HashMap hmap = new HashMap();
//        Map hmap2 = new HashMap<>();

        hmap.put("one", new Date());
        hmap.put(12, "red apple");
        hmap.put(33, 123);

        System.out.println(hmap);

        // 키는 중복 저장 되지 않음(set) : 최근 키로 override됨(덮어씀)
        hmap.put(12, "yellow banana");
        System.out.println(hmap);

        hmap.put(11, "yellow banana");
        hmap.put(9, "yellow banana");
        System.out.println(hmap);

        // 값 객체의 내용을 가져올 때 get()
        System.out.println("키 9에 대한 객체 : " + hmap.get(9));

        // 키 값을 가지고 삭제를 처리할 때
        hmap.remove(9);
        System.out.println(hmap);

        System.out.println(hmap.size());

        HashMap<String, String> hmap2 = new HashMap<>();

        hmap2.put("one", "java");
        hmap2.put("two", "oracle");
        hmap2.put("three", "jdbc");
        hmap2.put("four", "html");
        hmap2.put("five", "css");

        /* 1. keySet()을 이용해서 키만 따로 set으로 만들고, iterator() 키에 대한 목록을 만듦 */
        Iterator<String> keyIter = hmap2.keySet().iterator();

        while (keyIter.hasNext()) {
            String key = keyIter.next();
            String value = hmap2.get(key);
            System.out.println(key + " = " + value);
        }

        /* 2. 저장된 value객체들만 values()로 Collection으로 만듦 */
        Collection<String> values = hmap2.values();

        /* 2-1. Iterator()로 목록 만들어서 처리 */
        Iterator<String> valueIter = values.iterator();
        while (valueIter.hasNext()) {
            System.out.println(valueIter.next());
        }

        /* 2-2. 배열로 만들어서 처리 */
        Object[] valueArr = values.toArray();
        for(int i = 0; i < valueArr.length; i++) {
            System.out.println(i + " : " + valueArr[i]);
        }

        /* 3. Map의 내부클래스인 EntrySet을 이용 : entrySet() */
        Set<Map.Entry<String, String>> set = hmap2.entrySet();
        // Entry : 키 객체와 값 객체를 쌍으로 묶은 것
        Iterator<Map.Entry<String, String>> entryIter = set.iterator();
        while (entryIter.hasNext()) {
            Map.Entry<String, String> entry = entryIter.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
