package honja6.chap06.package1;
/*
클래스의 접근제한(1)
생성자의 접근 제한(1)
필드와 메소드의 접근 제한(1)
 */

//class A {
////}
//public class A {
//    // 필드
//    A a1 = new A(true);    // (O)
//    A a2 = new A(1);       //(O)
//    A a3 = new A("문자열");  // (O)
//    
//    // 생성자
//    public A(boolean b) []     // public 접근 제한
//    A(int b) {}                // default 접근 제한
//    private A(String s) {}     // private 접근 제한
//}
public class A {
    //필드
    public int field1;       // public 접근 제한
    int field2;              // default 접근 제한
    private int field3;      // private 접근 제한 
    
    // 생성자
    public A() {
        field1 = 1;        //(O)
        field2 = 1;        //(O)
        field3 = 1;        //(O)
        
        method1();          //(O)
        method2();          //(O)
        method3();          //(O)
    }
    
    // 메소드
    public void method1() {}     // public 접근 제한
    void method2() {}           // default 접근 제한
    private void method3() {}    // private 접근 제한
}

// A 클래스 내부에서는 접근 제한과 상관 없이 필드와 메소드 모수 사용 가능