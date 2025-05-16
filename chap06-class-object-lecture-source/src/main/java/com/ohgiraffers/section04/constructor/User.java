package com.ohgiraffers.section04.constructor;

public class User {

    private String id;
    private String pwd;
    private String name;
    private java.util.Date enrollDate;      // 필드로 다른 클래스 자료형도 사용할 수 있다.

    /* 생성자의 작성 위치
    *  작성 위치는 문법상으로는 클래스 내부에 작성하면 되지만,
    *  통상적으로 필드 선언부와 메소드 선언부 사이에 작성하는 것이 관례이다.
    * */

    /* 생성자의 사용 목적
    *  1. 인스턴스 생성 시점에 수행할 명령이 있는 경우 사용한다.
    *  2. 매개변수 있는 생성자의 경우 매개변수로 전달받은 값으로 필드를 초기화하며 인스턴스를 생성할 목적으로 주로 사용된다.
    *  3. 작성한 생성자 외에는 인스턴스를 생성하는 방법을 제공하지 않는다는 의미를 가진다.
    *     따라서, 인스턴스를 생성하는 방법을 제한하기 위한 용도로 사용할 수도 있다. (초기값 전달 강제화)
    * */

    /* 생성자 작성 방법
    *  [표현식]
    *  접근제한자 클래스명(매개변수) {
    *       인스턴스 생성 시점에 수행할 명령 기술(주로 필드를 초기화)
    *       this.필드명 = 매개변수;        // 설정자(setter) 여러 개의 기능을 한 번의 호출로 수행할 수 있다.
    *  }
    * */

    /* 생성자 작성 시 주의할 점
    *  1. 생성자 메소드는 반드시 클래스의 이름과 동일해야 한다. (대/소문자까지 같아야함)
    *  2. 생성자 메소드는 반환형을 작성하지 않는다. (작성하는 경우 생성자가 아닌 메소드로 인식한다.)
    * */

    /* 1. 기본 생성자 */
    public User() {

        /* 수행할 내용이 아무 것도 존재하지 않는다. */
        System.out.println("User 클래스의 기본 생성자 호출함...");
    }

    // 동일한 이름의 생성자 혹은 메소드를 한 클래스 안에서 작성하는 것은 불가능하다.
//    public User() {}

    /* 2. 매개변수 있는 생성자 */
    /* 초기화할 필드가 여러개 인 경우, 초기화 하고 싶은 필드의 갯수별로 생성자를 여러 개 준비해둘 수 있다. */
    /* id, pwd, name의 초기화를 담당할 생성자 */
    public User(String id, String pwd, String name) {

        /* 매개변수 있는 생성자의 주 목적은 인스턴스 생성 시점에 매개변수로 전달 받은 값을 이용해서 필드를 초기화한다. */
        this.id = id;
        this.pwd = pwd;
        this.name = name;

        System.out.println("User 클래스의 id, pwd, name을 초기화하는 생성자 호출함...");
    }

    /* 3. id, pwd, name, enrollDate의 초기화를 담당할 생성자 (모든 필드를 초기화하는 생성자) */
    public User(String id, String pwd, String name, java.util.Date enrollDate) {

        /* 매개변수로 전달 받은 값을 이용해 모든 필드를 초기화한다. */
        /* 3-1. 각 필드에 접근하여 초기화 */
//        this.id = id;
//        this.pwd = pwd;
//        this.name = name;
//        this.enrollDate = enrollDate;

        /* 3-2. 사전에 작성되어 있는 다른 생성자 함수를 이용하여 초기화 */
        /* this() : 동일 클래스 내에 작성한 다른 생성자 메소드를 호출하는 구문이다.
        *           가장 첫 줄에 선언해야 한다.
        * */
        this(id, pwd, name);    // 미리 작성한 세 개의 필드를 초기화하는 생성자로 매개변수로 받은 값을 전달
        this.enrollDate = enrollDate;

        System.out.println("User 클래스의 모든 필드를 초기화하는 생성자 호출함...");
    }

    public String getInformation() {

        return "User [" +
                "id=" + this.id + ", " +
                "pwd=" + this.pwd + ", " +
                "name=" + this.name + ", " +
                "enrollDate=" + this.enrollDate + "]";
    }
}
