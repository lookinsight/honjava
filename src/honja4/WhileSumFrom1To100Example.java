package Honja4;

// 1부터 100까지 합을 출력
// while 문 내부에서 계속 누적되는 값을 갖는 루프 카운터 변수는 while 문 시작하기 전에 미리 선언
public class WhileSumFrom1To100Example {
    public static void main(String[] args) {
        int sum = 0;      // 합계 저장할 변수

        int i = 1;        // 로프 카운터 변수

        while (i <= 100) {

            sum += i;
            i++;
        }
        System.out.println("1~" + (i-1) + " 합: " + sum);
    }
}
