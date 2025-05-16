package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_while {

    public void testSimpleWhileStatement() {

        /* comment. while문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */
        /* [while문 표현식]
        *  초기식;
        *  while(조건식) {
        *       조건을 만족하는 경우 수행할 구문(반복할 구문);
        *       증감식;
        *  }
        * */

        /* 1부터 10까지 1씩 증가시키면서 i값 출력해보자 */
        int i = 1;
        while(i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    public void testWhileExample1() {

        /* comment. while문 흐름 이해하기 (1) */
        /* 입력한 문자열의 인덱스를 이용하여 문자 하나씩 출력해보기 */
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String str = sc.nextLine();

        /* charAt() : 문자열에서 인덱스에 해당하는 문자를 char형으로 반환하는 기능
        *  length() : String 클래스의 메소드로 문자열의 길이를 int형으로 반환하는 기능
        *  index는 0부터 시작하고 마지막 인덱스는 항상 길이보다 한 개 작은 숫자를 가진다.
        *  만약 존재하지 않는 인덱스에 접근하게 되면 StringIndexOutOfBoundsException이 발생한다.
        * */

        System.out.println("================ for 문 ===============");
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            System.out.println(i + " : " + ch);
        }

        System.out.println("=============== while 문 ===============");
        int index = 0;
        while(index < str.length()) {
            char ch = str.charAt(index);

            System.out.println(index + " : " + ch);

            index++;
        }
    }

    public void testWhileExample2() {

        /* comment. while문 흐름 이해하기 (2) */
        /* 정수 하나를 입력받아 1부터 입력받은 정수까지의 합계를 구해보자. */
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 하나 입력하세요 : ");
        int num = sc.nextInt();

        int i = 1;
        int sum = 0;
        while(i <= num) {
            sum += i;
            i++;
        }

        System.out.println("1부터 입력 받은 정수 " + num + "까지의 합은 " + sum + "입니다.");
    }
}
