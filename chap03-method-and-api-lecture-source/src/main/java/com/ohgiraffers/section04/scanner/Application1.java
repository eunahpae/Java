package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {
        /* comment. java.util.Scanner를 이용한 다양한 자료형 값 입력 받기 */

        /* 1. Scanner 객체 생성 */
    //    java.util.Scanner sc = new java.util.Scanner(java.lang.System.in);
    //    java.util.Scanner sc = new java.util.Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        /* 2. 자료형별 값 입력받기 */
        /* 2-1. 문자열 입력 받기 */
        /* nextLine() : 입력받은 값을 문자열로 반환해준다. */
        System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.println("입력하신 이름은 " + name + "입니다.");

        /* 2-2. 정수형 값 입력 받기 */
        /* nextInt() : 입력받은 값을 int형으로 반환한다. */
        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();
        System.out.println("입력하신 나이는 " + age + "입니다.");

        /* nextLong() : 입력받은 값을 long형으로 반환한다. */
        System.out.print("금액을 입력해주세요 : ");
        long money = sc.nextLong();
        System.out.println("입력하신 금액은 " + money + "원 입니다.");

        /* 2-3. 실수형 값 입력 받기 */
        /* nextFloat() : 입력받은 값을 float형으로 반환한다. */
        System.out.print("키를 입력해주세요 : ");
        float height = sc.nextFloat();
        System.out.println("입력하신 키는 " + height + "cm 입니다.");

        /* nextDouble() : 입력받은 값을 double형으로 반환한다. */
        System.out.print("원하는 실수를 입력하세요 : ");
        double number = sc.nextDouble();
        System.out.println("입력하신 실수는 " + number + "입니다.");

        /* 2-4. 논리형 값 입력받기 */
        /* nextBoolean() : 입력받은 값을 boolean형으로 반환한다. */
        System.out.print("참과 거짓 중에 한 가지를 true or false로 입력해주세요 : ");
        boolean isTrue = sc.nextBoolean();
        System.out.println("입력하신 논리 값은 : " + isTrue + "입니다.");

        /* 2-5. 문자형 값 입력받기 */
        sc.nextLine();
        System.out.print("아무 문자나 입력해주세요 : ");
        char ch = sc.nextLine().charAt(5);
        System.out.println("입력하신 문자는 " + ch + "입니다.");
    }
}
