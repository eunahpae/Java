package com.ohgiraffers.section04.time;

import java.time.*;

public class Application1 {

    public static void main(String[] args) {

        /* comment. time 패키지에서 제공하는 클래스들의 사용 용법을 이해할 수 있다. */
        /* java.time
        *     ㄴ java.time.zone : 시간대에 관련된 기능 제공
        *  LocalTime, LocalDate, LocalDateTime, ZonedDateTime 클래스들이 있다.
        * */

        LocalTime timeNow = LocalTime.now();
        System.out.println(timeNow);

        LocalTime timeOf = LocalTime.of(18, 30, 0);
        System.out.println(timeOf);

        LocalDate dateNow = LocalDate.now();
        System.out.println(dateNow);

        LocalDate dateOf = LocalDate.of(2023, 1, 19);
        System.out.println(dateOf);

        LocalDateTime dateTimeNow = LocalDateTime.now();
        System.out.println(dateTimeNow);

        LocalDateTime dateTimeOf = LocalDateTime.of(dateNow, timeNow);
        System.out.println(dateTimeOf);

        ZonedDateTime zonedDateTimeNow = ZonedDateTime.now();
        System.out.println(zonedDateTimeNow);

        ZonedDateTime zonedDateTimeOf = ZonedDateTime.of(dateOf, timeOf, ZoneId.of("Asia/Seoul"));
        System.out.println(zonedDateTimeOf);
    }
}