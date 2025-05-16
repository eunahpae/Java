package com.ohgiraffers.section01.array;

public class Application5 {

    public static void main(String[] args) {

        /* comment. 배열을 사용하는 예시 (2) */
        String[] shapes = {"SPADE", "CLOVER", "HEART", "DIAMOND"};
        String[] cardNumbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE"};

        int randomShapeIndex = (int) (Math.random() * shapes.length);
        int randomCardNumberIndex = (int) (Math.random() * cardNumbers.length);

        System.out.println("당신이 뽑은 카드는 " + shapes[randomShapeIndex] + " " + cardNumbers[randomCardNumberIndex] + " 카드 입니다.");
    }
}
