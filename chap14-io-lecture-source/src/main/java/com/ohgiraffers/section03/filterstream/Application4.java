package com.ohgiraffers.section03.filterstream;

import com.ohgiraffers.section03.filterstream.dto.MemberDTO;

import java.io.*;

public class Application4 {

    public static void main(String[] args) {
        /* comment. 객체단위 입출력 보조스트림을 이해하고 사용할 수 있다. */

        MemberDTO[] outputMembers = {
                new MemberDTO("user01", "pass01", "홍길동", "hong@gmail.com", 25, '남', 1250.7),
                new MemberDTO("user02", "pass02", "유관순", "yoo@gmail.com", 16, '여', 1221.6),
                new MemberDTO("user03", "pass03", "이순신", "lee@gmail.com", 22, '남', 1234.7)};

        ObjectOutputStream objOut = null;

        try {
            objOut = new ObjectOutputStream
                        (new BufferedOutputStream
                            (new FileOutputStream("src/main/java/com/ohgiraffers/section03/filterstream/testObjectStream.txt")));

            for(int i = 0; i < outputMembers.length; i++) {
                objOut.writeObject(outputMembers[i]);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(objOut != null) {
                try {
                    objOut.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        /* 직렬화?
        *  자바 시스템 내부에서 사용되는 객체 또는 데이터를 외부에서도 사용할 수 있도록
        *  바이트(byte)형태로 데이터를 변환하는 기술을 말한다.
        *  반대로 바이트로 변환된 데이터를 다시 객체로 변환하는 기술을 역직렬화라고 한다.
        * */

//        MemberDTO[] inputMembers = new MemberDTO[3];
        ObjectInputStream objIn = null;

        try {
            objIn = new ObjectInputStream(new BufferedInputStream(new FileInputStream("src/main/java/com/ohgiraffers/section03/filterstream/testObjectStream.txt")));

            while (true) {
                System.out.println(objIn.readObject());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (EOFException e) {
            System.out.println("끝!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(objIn != null) {
                try {
                    objIn.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

}
