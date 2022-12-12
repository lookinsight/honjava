package Honja4;

// 1부터 100까지 합을 출력
// 변수 i를 for문 초기화식에서 선언하지 않고 for문 전에 선언하였다면 for 문 내부뿐 아니라 for 문 벗어나도 사용 가능
public class ForSumFrom1To100Example2 {
    public static void main(String[] args) {
        int sum = 0;               // 합계 변수

        int i = 0;
        for(i=1; i<=100; i++) {
            sum += i;
        }
        System.out.println("1~" + (i-1) + " 합: " + sum);
    }
}
