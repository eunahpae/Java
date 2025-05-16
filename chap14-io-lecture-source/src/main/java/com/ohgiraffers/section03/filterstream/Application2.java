package com.ohgiraffers.section03.filterstream;

import java.io.*;

public class Application2 {

    public static void main(String[] args) {

        /* comment. 형변환 보조스트림에 대해 이해하고 사용할 수 있다. */
        /* 형변환 보조스트림
        *  기본 스트림이 byte 기반 스트림이고, 보조 스트림이 char 기반 스트림인 경우에 사용한다.
        * */

        /* 표준 스트림
        * 자바에서는 콘솔이나 키보드 같은 표준 입출력 장치로부터 데이터를 입출력 하기 위한 스트림을
        * 표준 스트림 형태로 제공하고 있다. System 클래스의 필드 in, out, err가 대상 데이터에 스트림을 의미한다.
        * System.in(InputStream) : 콘솔로부터 데이터를 입력받는다.
        * System.out(PrintStream) : 콘솔로 데이터를 출력한다.
        * System.err(PrintStream) : 콘솔로 데이터를 출력한다.
        * */

        /* System.in을 InputStreamReader로 변환하여 바이트기반 스트림을 문자 기반 스트림으로 변환 후
        * 버퍼를 이용한 보조스트림과 연결해보자.
        * */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("문자열 입력 : ");
            String value = br.readLine();

            System.out.println("value = " + value);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            bw.write("java mysql jdbc");

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
