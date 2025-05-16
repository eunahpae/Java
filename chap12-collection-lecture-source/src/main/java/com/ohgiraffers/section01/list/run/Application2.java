package com.ohgiraffers.section01.list.run;

import com.ohgiraffers.section01.list.comparator.AscendingPrice;
import com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Application2 {

    public static void main(String[] args) {

        /* comment. ArrayList의 정렬 기능을 이용할 수 있다. */

        List<BookDTO> bookList = new ArrayList<>();

        bookList.add(new BookDTO(1, "홍길동전", "허균", 50000));
        bookList.add(new BookDTO(2, "목민심서", "정약용", 30000));
        bookList.add(new BookDTO(3, "동의보감", "허준", 40000));
        bookList.add(new BookDTO(4, "삼국사기", "김부식", 46000));
        bookList.add(new BookDTO(5, "삼국유사", "일연", 58000));

//        Collections.sort(bookList);

        for(BookDTO book : bookList) {
            System.out.println(book);
        }

        /* 가격 순으로 오름차순 정렬 */
        bookList.sort(new AscendingPrice());

        System.out.println("가격 오름차순 정렬 ==================");
        for(BookDTO book : bookList) {
            System.out.println(book);
        }

        /* 가격 내림차순 정렬 */
        bookList.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {

                // 순서를 바꾸는 경우 양수, 바꾸지 않는 경우에는 음수 반환
                return o1.getPrice() >= o2.getPrice()? -1: 1;
            }
        });

        System.out.println("가격 내림차순 정렬 ===================");
        for(BookDTO book : bookList) {
            System.out.println(book);
        }

        /* 제목 순 오름차순 정렬 */
        bookList.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {

                // 앞에 값이 더 작은 경우 음수 반환,
                // 같으면 0을 반환
                // 앞에 값이 더 큰 경우 양수 반환 ( 바꿔야 되는 경우 )
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });

        System.out.println("책 제목 순으로 오름차순 정렬=============");
        for(BookDTO book : bookList) {
            System.out.println(book);
        }

        /* 제목 순 내림차순 정렬 */
        bookList.sort((BookDTO b1, BookDTO b2) -> b2.getTitle().compareTo(b1.getTitle()));

        System.out.println("책 제목 순으로 내림차순 정렬=============");
        for(BookDTO book : bookList) {
            System.out.println(book);
        }
    }
}
