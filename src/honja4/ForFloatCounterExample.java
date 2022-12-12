package Honja4;

// float 타입 카운터 변수
// for 문 초기화식에서 로프 카운터 변수 선언할 때 부동 소수점을 쓰지 말아야 하는 이유
// 이론적으로 for 문은 10번 반복해야 하는데 
// 0.1은 float 타입으로 정확하게 표현할 수 없어서 로프 카운터 변수 x에 더해지는 실제 값은 0.1보다 약간 큼
// 결국 루프는 9번만 실행 됨
public class ForFloatCounterExample {
    public static void main(String[] args) {
        for(float x=0.1f; x<=1.0f; x+=0.1f) {
            System.out.println(x);
        }
    }
}
