package Honja4;

// while 문
// 1 부터 10까지 출력
// while 문은 한 번 실행할 때 루프 카운터 변수인 i 값을 출력하고 i를 1증가 시킴
// 조건문은 i가 10이하일때까지 true 가 되므로 while 문은 총 10번 반복
public class WhilePrintFrom1To10Example {
    public static void main(String[] args) {
        int i = 1;
        while(i<=10) {
            System.out.println(i);
            i++;
        }
    }
}
