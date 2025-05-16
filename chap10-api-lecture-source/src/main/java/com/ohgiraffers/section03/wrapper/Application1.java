package com.ohgiraffers.section03.wrapper;

public class Application1 {

    public static void main(String[] args) {

        /* comment. Wrapper 클래스에 대해 이해할 수 있다. */
        /* 기본타입       래퍼클래스
        *  byte           Byte
        *  short          Short
        *  int            Integer
        *  long           Long
        *  float          Float
        *  double         Double
        *  char           Character
        *  boolean        Boolean
        * */

        /* 박싱(Boxing) 언박싱(UnBoxing)
        *  기본타입을 래퍼클래스의 인스턴스로 인스턴스화 하는 것을 박싱(Boxing)이라고 하며,
        *  래퍼클래스 타입의 인스턴스를 기본 타입으로 변경하는 것을 언박싱(UnBoxing)이라고 한다.
        * */

        int intValue = 20;
        Integer boxingNumber1 = Integer.valueOf(intValue);  // 박싱

        int unBoxingNumber1 = boxingNumber1.intValue();     // 언박싱

        /* 오토 박싱과 오토 언박싱 */
        Integer boxingNumber2 = intValue;       // 오토 박싱

        int unBoxingNumber2 = boxingNumber2;    // 오토 언박싱


    }
}
