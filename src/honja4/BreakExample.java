package Honja4;

// break로 while문 종료
// while 문 이용해 주사위 번호 중 하나를 반복적으로 무작위로 뽑되, 6이 나오면 while 문 종료
public class BreakExample {
    public static void main(String[] args) {
        while(true) {
            int num = (int) (Math.random() * 6) + 1;
            System.out.println(num);
            if(num==6) {
                break;
            }
        }
        System.out.println("프로그램 종료");
    }
}
