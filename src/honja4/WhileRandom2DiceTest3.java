package Honja4;

/*
while 문과 Math.Random() 메소드 이용해서 2개 주사위 던젼을 때 나오는 눈을 (눈1, 눈2) 행텨로 출력하고,
눈의 합이 5가 아니면 계속 주사위를 던지고, 눈의 합이 5이면 실행을 멈추는 코드 작성하기
눈의 합 5가 되는 조합은 (1,4), (4,1), (2,3),(3,2)
 */
public class WhileRandom2DiceTest3 {
    public static void main(String[] args) {
        while(true) {
            int num1 = (int) (Math.random() * 6) + 1;
            int num2 = (int) (Math.random() * 6) + 1;
            System.out.println("주사위 2개를 던져 나온 눈 : " + "(" + num1 + "," + num2 + ")");
            if(num1 + num2 == 5) {
                break;
            }
        }
        System.out.println("주사위를 그만 더져도 됩니다");
    }
}
