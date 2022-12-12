package honja6.chap06.package2;   // 패키지가 다름
/*
클래스의 접근 제한(3)
생성자의 접근 제한(3)
필드아 메소드의 접근 제한(3)
 */
import honja6.chap06.package1.A;

//public class C {
////    A a;   // (X)          > A 클래스 접근 불가(컴파일 에러)
//    B b;   // (O)
//}
//public class C {
//    // 필드
//    A a1 = new A(true);   // (O)
//    A a2 = new A(1);      // (x)   default 생성자 접근 불가(컴파일 에러)
//    A a3 = new A("문자열");   // (X)  private 생성자 접근 불가(컴파일 에러)
//}
public class C {
    public C() {
        A a = new A();
        a.field1 = 1;         // (O)
//        a.field2 = 1;         // (X) default 필드 접근 불가(컴파일 에러)
//        a.field3 = 1;         // (x) private 필드 접근 불가(컴파일 에러)

        a.method1();          //(O)
//        a.method2();          //(X)  default 메소드 접근 불가(컴파일 에러)
//        a.method3();          //(X)  private 메소드 접근 불가(컴파일 에러)
    }
}