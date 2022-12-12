package Honja4;

/*
중첩 for 문 이용해 방정식 4x + 5y = 60 의 모든 해를 구해서 (x, y) 형태로 출력하기
단, x와 y는 10이하 자연수
 */
public class ForForEquationSolutionTest4 {
    public static void main(String[] args) {

        for(int x=1; x<=9; x++) {
            for(int y=1; y<=9; y++) {
                if(((4*x) + (5*y)) == 60) {
                    System.out.println("4x + 5y = 60 을 만족하는 x,y 해 : " + "(" + x + "," + y + ")");
                }
            }
        }
        System.out.println("프로그램을 종료합니다");
    }
}
