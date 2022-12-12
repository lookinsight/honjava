package Honja4;

// continue를 사용한 for 문
public class ContinueExample {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++) {
            if(i%2 != 0) {      // 2로나눈 나머지가 0이아닌 경우 = 홀수
                continue;
            }
            System.out.println(i);     // 홀수는 실행되지 않음
        }
    }
}
