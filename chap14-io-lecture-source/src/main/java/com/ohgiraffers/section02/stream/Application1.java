package com.ohgiraffers.section02.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Application1 {

    public static void main(String[] args) {

        /* comment. 입출력 스트림에 대해 이해하고 파일을 대상으로 하는 FileInputStream을 사용할 수 있다. */
        /* 입출력 스트림 개요
        *  우리는 프로그래밍을 할 때 많은 종류의 데이터를 다루어야 한다.
        *  하지만 데이터는 프로그램 내부에 있을 수도 있지만, 프로그램 외부의 데이터를 가져와서 사용해야 할 수도 있다.
        *  또한 프로그램에서 생성한 데이터를 외부로 출력할 수도 있다.
        *
        *  외부 데이터란 프로그램 외부에 존재하는 모든 데이터를 의미한다.
        *  외부 데이터를 대상으로 작업할 때 가장 먼저 해야 할 일은 자바 프로그램과 외부 데이터를 연결하는 것이다.
        *  프로그램과 외부 데이터가 연결된 길을 스트림(stream)이라고 한다.
        *  스트림은 단방향이기 때문에 데이터를 읽어오기 위한 길은 입력 스트림, 데이터를 출력하기 위한 길은 출력 스트림이라고 부른다.
        *
        *  입출력과 관련된 API는 java.io 패키지에서 제공하고 있다.
        *  InputStream/OutputStream, Reader/Writer 로 끝난다.
        *  이러한 클래스 모두가 외부 데이터를 읽어오는 기능을 가진 스트림이다.
        *
        *  그 중에 InputStream과 Reader는 데이터를 읽어오는 입력스트림이고,
        *  OutputStream과 Writer는 데이터를 내보내는 출력스트림이다.
        *  또한 InputStream과 OutputStream은 데이터를 1바이트 단위로 입/출력을 하고
        *  Reader와 Writer계열을 글자(2바이트 혹은 3바이트) 단위로 작업을 한다.
        * */

        FileInputStream fin = null;

        try {
            fin = new FileInputStream("src/main/java/com/ohgiraffers/section02/stream/testInputStream.txt");

            int value;

            /* read() : 파일에 기록된 값을 순차적으로 읽어오고 더 이상 읽어올 데이터가 없는 경우 -1을 반환 */
            while ((value = fin.read()) != -1) {

                System.out.println(value);

                System.out.println((char) value);
            }

            System.out.println("파일의 길이 : " + new File("src/main/java/com/ohgiraffers/section02/stream/testInputStream.txt").length());

            /* 1 byte씩 읽어와야 하는 경우도 존재하긴 하지만 대부분 경우 굉장히 비효율적이다.
            *  byte 배열을 이용해서 한 번에 데이터를 읽어오는 방법도 제공한다.
            *  파일의 길이 만큼의 byte 배열을 만든다. */
            int fileSize = (int) new File("src/main/java/com/ohgiraffers/section02/stream/testInputStream.txt").length();
            byte[] bar = new byte[fileSize];

            fin.read(bar);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // fin 인스턴스가 null이 아닌 경우 자원 반납을 해야 한다.
            if(fin != null) {
                try {
                    /* 자원 반납을 해야하는 경우
                    *  1. 장기간 실행중인 프로그램에서 스트림을 닫지 않는 경우 다양한 리소스에서 누수(leak)가 발생한다.
                    *  2. 뒤에서 배우는 버퍼를 이용하는 경우 마지막에 flush()로 버퍼에 있는 데이터를 강제로 전송해야 한다.
                    *     만약 잔류 데이터가 남은 상황에서 추가로 스트림을 사용한다면 데드락(deadlock)상태가 된다.
                    *     판단하기 어렵고 의도하지 않는 상황에서도 이런 현상이 발생할 수 있기 때문에 마지막에는 flush()를
                    *     무조건 실행해주는 것이 좋다.
                    *     close()메소드는 자원을 반납하며 flush()를 해 주기 때문에 close()만 제대로 해줘도 된다.
                    *     따라서 close() 메소드는 외부 자원을 사용하는 경우 반드시 마지막에 호출해줘야 한다.
                    * */
                    fin.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
