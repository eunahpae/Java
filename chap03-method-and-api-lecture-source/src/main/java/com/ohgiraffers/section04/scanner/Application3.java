package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application3 {

public static void main(String[] args) {
		
		/* comment. 스캐너 사용 시 주의 사항에 대해 이해하고 사용 시 주의사항을 고려하여 사용할 수 있다. */
		/*  스캐너의 next 메소드들은 입력한 내용을 버퍼로부터 토큰단위로 분리해서 읽어온다.
		 *  그래서 크게 두 가지 사항을 주의해야 한다.
		 *  1. next()로 문자열 입력 받은 후 정수, 실수, 논리값 입력 받을 때
		 *  2. 정수, 실수, 논리값 입력 후 next()로 문자열 입력받을 때
		 * */

		Scanner sc = new Scanner(System.in);

		/* 1. next()로 문자열 입력 받은 후 정수, 실수, 논리값 입력 받을 때  */
		System.out.print("문자열을 입력해주세요 : ");
		String str1 = sc.next();				//공백이나 개행문자 전 까지를 읽어온다.
		System.out.println("str1 : " + str1);

		System.out.print("숫자를 입력해주세요 : ");
		int num1 = sc.nextInt();				//정수 값을 읽어온다.
		System.out.println("num1 : " + num1);

		/*  여기까지 작성하고 나면 작성상에(compile 시)는 문제되지 않는다.
		 *  처음 실행할 때 문자열에 "안녕" 이라고 입력하고 정수를 입력하면 정상적으로 동작한다.
		 *  하지만, "안녕하세요 반갑습니다" 입력 하면 동작 시(Runtime) 숫자를 입력하기도 전에 InputMismatchException이 발생한다.
		 *
		 *  "안녕하세요 반갑습니다" <- 입력 시 공백을 기준으로 두 개의 토큰 "안녕하세요"와 "반갑습니다"로 분리가 된다.
		 *  next()는 다음 토큰인 "안녕하세요"를 읽었고, nextInt()는 다음 토큰을 정수로 읽어야 하는데 "반갑습니다"가 나왔다.
		 *  정수를 입력해야 하는데 "반갑습니다"를 읽으면 당연히 InputMismatchException이 발생하게 된다.
		 *  공백이 있는 문자열을 받을거면 nextLine()을 이용하자
		 *
		 *  혹은 입력받은 버퍼를 줄 단위로 토큰을 분리하기 때문에 해당 라인의 토큰을 다 읽고 다음 줄로 이동시키고 싶을 때는
		 *  한 라인의 모든 토큰을 읽어오는 sc.nextLine(); 호출을 중간에 한 번 넣어줘도 해결은 된다.
		 * */
		
		/* 2. 정수, 실수, 논리값 입력 후 nextLine()로 문자열 입력받을 때 */
		System.out.print("다시 숫자를 입력해주세요 : ");
		int num2 = sc.nextInt();
		System.out.println("num2 : " + num2);
		
		System.out.print("공백이 있는 문자열을 하나 입력해주세요 : ");
		
		sc.nextLine();
		
		String str2 = sc.nextLine();
		System.out.println("str2 : " + str2);		
		
		/*  입력받을 시 nextLine()을 호출한 것이 아직 행을 바꾸지 않고 한 라인을 읽어드린다고 판단해서 아무 것도 읽지 못하고 넘어간 뒤
		 *  다음 출력구문을 실행시킨 것이다.
		 *  이걸 해결하기 위해서는 sc.nextLine() 호출 전에 미리 sc.nextLine()을 한 번 호출 하면
		 *  그 행을 읽어드리는걸 다음 행으로 넘기게 되고, 그 이후 새로 입력받은 한 라인을 읽어와서 str2에 저장하게 되므로 정상 동작하게 된다.
		 * */
	}
}