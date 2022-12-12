package honja6.chap06.package1;       // 패키지가 동일
/*
클래스의 접근 제한(2)
생성자의 접근 제한(2)
필드와 메소드의 접근 제한(2)
 */

//public class B {
//    A a;   // (0)  A클래스 접근 가능(필드로 선언할 수 있음)ㄴ
//}
//public class B {
//    // 필드
//    A a1 = new A(true);   // (O)
//    A a2 = new A(1);      // (O)
////    A a3 = new A("문자열");    // (X) private 생성자 접근 불가
//}
public class B {
    public B() {
        A a = new A();
        a.field1 = 1;       //(O)
        a.field2 = 1;       //(O)
//        a.field3 = 1;       //(X)   private 필드 접근 불가(컴파일 에러)
        
        a.method1();        //(O)
        a.method2();        //(O)
//        a.method3();        //(X)    private 메소드 접근 불가(컴파일 에러)
    }
}

// 패키지가 동일한 B 클래스에서는 A클래스 private 필드와 메소드 제외한 다른 필드와 메소드는 사용 가능