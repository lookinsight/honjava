package Honja2;

// 강제 타입 변환
// 큰 자료형을 작은 자료형으로 변환
// 캐스팅
public class CastingExample {
    public static void main(String[] args) {
        int intValue = 44032;
        char charValue = (char) intValue;
        System.out.println(charValue);

        long longValue = 500;
        intValue = (int) longValue;
        System.out.println(intValue);

        double doubleValue = 3.14;
        intValue = (int) doubleValue;
        System.out.println(intValue);
    }
}
