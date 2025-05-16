package com.ohgiraffers.section02.set.run;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Application2 {

    public static void main(String[] args) {

        /* comment. LinkedHashSet에 대해 이해하고 사용할 수 있다. */
        /* LinkedHashSet 클래스
        *  HashSet이 가지는 기능을 모두 가지고 있고,
        *  추가적으로 저장 순서를 유지하는 특징을 가진다.
        * */
        LinkedHashSet<String> lhset = new LinkedHashSet<>();

        lhset.add("java");
        lhset.add("oracle");
        lhset.add("jdbc");
        lhset.add("html");
        lhset.add("css");

        System.out.println(lhset);

        TreeSet<String> tset = new TreeSet<>(lhset);
        System.out.println(tset);
    }
}
