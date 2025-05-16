package com.ohgiraffers.section03.filterstream;

import java.io.*;

public class Application3 {

    public static void main(String[] args) {

        /* comment. 데이터입출력보조스트림을 이해하고 사용할 수 있다. */
        /* 외부 데이터로부터 읽어오는 데이터를 바이트형, 정수, 문자, 문자열로만 읽어오면
        *  여러 데이터 타입을 취급하는 경우 별도로 처리를 해주어야 한다.
        *  데이터 자료형 별로 처리하는 기능을 추가한 보조스트림을 제공하고 있다.
        * */

        /* DataInputStream/DataOutputStream */

        DataOutputStream dout = null;

        try {
            dout = new DataOutputStream(new FileOutputStream("src/main/java/com/ohgiraffers/section03/filterstream/score.txt"));

            dout.writeUTF("홍길동");
            dout.writeInt(95);
            dout.writeChar('A');

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(dout != null) {
                try {
                    dout.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        DataInputStream din = null;

        try {
            din = new DataInputStream(new FileInputStream("src/main/java/com/ohgiraffers/section03/filterstream/score.txt"));

            /* 파일에 기록한 순서대로 읽어들이지 않는 경우 에러 발생함 */
            while (true) {
                System.out.println(din.readUTF() + ", " + din.readInt() + ", " + din.readChar());
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (EOFException e) {
            System.out.println("파일 읽기 완료!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
