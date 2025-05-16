package com.ohgiraffers.section01.list.comparator;

import com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.Comparator;

public class AscendingPrice implements Comparator<BookDTO> {

    @Override
    public int compare(BookDTO o1, BookDTO o2) {

        int result = 0;

        if(o1.getPrice() > o2.getPrice()) {

            // 순서를 바꿔야 하는 경우 양수 반환
            result = 1;

        } else if (o1.getPrice() < o2.getPrice()) {

            // 이미 오름차순 정렬 돼서 음수 반환
            result = -1;
        } else {

            // 두 값이 같을 경우
            result = 0;
        }

        return result;
    }
}
