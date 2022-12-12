package Honja4;

/*
for 문 이용해 * 출력하기
 */
public class ForStar4Test5 {
    public static void main(String[] args) {

        for(int i=1; i<=4; i++) {
            for(int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
