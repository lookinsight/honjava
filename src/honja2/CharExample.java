package Honja2;

// 작은따옴표로 감싼 문자는 char 타입 변수 저장 = 유니코드 저장 
// int 타입 변수로도 가능
public class CharExample {
    public static void main(String[] args) {
        char c1 = 'A';    // 문자 직접 저장
        char c2 = 65;    // 10진수로 저장
        char c3 = '\u0041';     // 16진수로 저장

        char c4 = '가';       // 문자 직접 저장
        char c5 = 44032;      // 10진수로 저장
        char c6 = '\uac00';    // 16진수로 저장

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
    }
}
