package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_for {

    public void testSimpleForStatement() {

        /* comment. for문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */
        /* [for의 표현식]
        *  for(초기식; 조건식; 증감식) {
        *         조건을 만족하는 경우 수행할 구문(반복할 구문);
        *  }
        * */

        /* 1부터 10까지 1씩 증가시키면서 i값을 출력하는 기본 반복문 */
        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public void testForExample1() {

        /* comment. 무엇을 반복하는지를 확인하여 반복문으로 개선할 수 있다. (1) */

        /* 10명의 학생 이름을 입력받아 이름을 출력해보자 */
        Scanner sc = new Scanner(System.in);

        System.out.print("1 번째 학생의 이름을 입력해주세요 : ");
        String student1 = sc.nextLine();
        System.out.println("1 번째 학생의 이름은 " + student1 + "입니다.");

        System.out.print("2 번째 학생의 이름을 입력해주세요 : ");
        String student2 = sc.nextLine();
        System.out.println("2 번째 학생의 이름은 " + student2 + "입니다.");

        System.out.print("3 번째 학생의 이름을 입력해주세요 : ");
        String student3 = sc.nextLine();
        System.out.println("3 번째 학생의 이름은 " + student3 + "입니다.");

        System.out.print("4 번째 학생의 이름을 입력해주세요 : ");
        String student4 = sc.nextLine();
        System.out.println("4 번째 학생의 이름은 " + student4 + "입니다.");

        System.out.print("5 번째 학생의 이름을 입력해주세요 : ");
        String student5 = sc.nextLine();
        System.out.println("5 번째 학생의 이름은 " + student5 + "입니다.");

        System.out.print("6 번째 학생의 이름을 입력해주세요 : ");
        String student6 = sc.nextLine();
        System.out.println("6 번째 학생의 이름은 " + student6 + "입니다.");

        System.out.print("7 번째 학생의 이름을 입력해주세요 : ");
        String student7 = sc.nextLine();
        System.out.println("7 번째 학생의 이름은 " + student7 + "입니다.");

        System.out.print("8 번째 학생의 이름을 입력해주세요 : ");
        String student8 = sc.nextLine();
        System.out.println("8 번째 학생의 이름은 " + student8 + "입니다.");

        System.out.print("9 번째 학생의 이름을 입력해주세요 : ");
        String student9 = sc.nextLine();
        System.out.println("9 번째 학생의 이름은 " + student9 + "입니다.");

        System.out.print("10 번째 학생의 이름을 입력해주세요 : ");
        String student10 = sc.nextLine();
        System.out.println("10 번째 학생의 이름은 " + student10 + "입니다.");

        /* 반복해야하는 내용은
        * 1. 안내문구 출력
        * 2. 학생 이름 입력 받아 변수에 저장
        * 3. 저장된 이름을 출력 */

        for(int i = 1; i <= 10; i++) {
            System.out.print(i + "번째 학생의 이름을 입력해주세요 : ");
            String student = sc.nextLine();
            System.out.println(i + "번째 학생의 이름은 " + student + "입니다.");
        }

        System.out.println("10명의 학생 이름을 입력 받고 출력하는 기능을 완료했습니다!");
    }

    public void testForExample2() {

        /* comment. 무엇을 반복하는지를 확인하여 반복문 개선 (2) */
        /* 1 ~ 10까지의 합계를 구하세요 */

        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 4;
        int num5 = 5;
        int num6 = 6;
        int num7 = 7;
        int num8 = 8;
        int num9 = 9;
        int num10 = 10;

        int sum = 0;

        sum += num1;
        sum += num2;
        sum += num3;
        sum += num4;
        sum += num5;
        sum += num6;
        sum += num7;
        sum += num8;
        sum += num9;
        sum += num10;

        System.out.println("sum = " + sum);

        /* 반복해야 할 내용
        *  1. 변수에 1씩 증가하는 값 담기
        *  2. 저장된 값을 sum에 누적시키기
        *
        *  반복하지 않을 내용
        *  1. 값을 누적해서 저장할 sum을 초기화
        *  2. sum에 누적된 값 출력
        * */

        int sum2 = 0;

        for(int i = 1; i <= 10; i++) {
            sum2 += i;
        }

        System.out.println(sum2);
    }

    public void testForExample3() {

        /* comment. 반복문으로 개선하기 (3) */

        /* 5 ~ 10사이의 난수를 발생시켜서
        *  1부터 발생한 난수까지의 합계를 구해보자.
        * */

        int random = (int) (Math.random() * 6) + 5;

        System.out.println("random = " + random);

        int sum = 0;

        if(random == 5) {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
        } else if(random == 6) {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
            sum += 6;
        } else if(random == 7) {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
            sum += 6;
            sum += 7;
        } else if(random == 8) {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
            sum += 6;
            sum += 7;
            sum += 8;
        } else if(random == 9) {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
            sum += 6;
            sum += 7;
            sum += 8;
            sum += 9;
        } else {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
            sum += 6;
            sum += 7;
            sum += 8;
            sum += 9;
            sum += 10;
        }

        System.out.println("1부터 " + random + "까지의 합은 : " + sum);

        int sum2 = 0;

        for(int i = 1; i <= random; i++) {
            sum2 += i;
        }

        System.out.println("1부터 " + random + "까지의 합은 : " + sum);
    }

    public void printSimpleGugudan() {

        /* comment. 반복문으로 개선하기 (4) */
        /* 키보드로 2 ~ 9 사이의 구구단을 입력받아
        *  2 ~ 9 사이인 경우 해당 단의 구구단을 출력하고,
        *  그렇지 않은 경우 "반드시 2 ~ 9 사이의 양수를 입력해야 합니다." 출력해보자
        *
        *  5 * 1 = 5
        *  5 * 2 = 10
        *  5 * 3 = 15
        *  .
        *  .
        *  5 * 9 = 45
        * */

        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 구구단의 단 수를 입력하세요 : ");
        int dan = sc.nextInt();

        if(dan >= 2 && dan <= 9) {
//            System.out.println(dan + " * " + 1 + " = " + (dan * 1));
//            System.out.println(dan + " * " + 2 + " = " + (dan * 2));
//            System.out.println(dan + " * " + 3 + " = " + (dan * 3));
//            System.out.println(dan + " * " + 4 + " = " + (dan * 4));
//            System.out.println(dan + " * " + 5 + " = " + (dan * 5));
//            System.out.println(dan + " * " + 6 + " = " + (dan * 6));
//            System.out.println(dan + " * " + 7 + " = " + (dan * 7));
//            System.out.println(dan + " * " + 8 + " = " + (dan * 8));
//            System.out.println(dan + " * " + 9 + " = " + (dan * 9));

            for(int su = 1; su <= 9; su++) {
                System.out.println(dan + " * " + su + " = " + (dan * su));
            }

        } else {

            System.out.println("반드시 2 ~ 9 사이의 양수를 입력해야 합니다.");
        }

        System.out.println("프로그램을 종료합니다.");

    }
}
