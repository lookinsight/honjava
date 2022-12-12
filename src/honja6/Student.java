package honja6;

/*
클래스 선언
라이브러리로서의 코드(필드, 생성자, 메소드)
...
 */
public class Student {

    //실행하기 위한 코드
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("s1 변수가 Student 객체를 참조합니다.");

        Student s2 = new Student();
        System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
    }
}

/*
프로그램이 단 하나의 클래스로 구성된다면 위와 같이 작성하면 좋을 수 있지만,
대부분 객체 지향 프로그램은 라이브러리(부품 객체 및 완성 객체)와 실행 클래스가 분리되어 있다.
 */