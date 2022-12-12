package Honja4;

// 1부터 100까지 합을 출력
// for 문 작성 주의점= 초기화식에서 로프 카운티 변수 선언할 때 부동 소수점 쓰는 float 타입 X
public class ForSumFrom1To100Example {
    public static void main(String[] args) {
        int sum = 0;          // 합계 변수

        for(int i=1; i<=100; i++) {
            sum += i;
        }

        System.out.println("1 ~ 100 합 : " + sum);
    }
}
