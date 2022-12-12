package Honja4;

// do-while 문 실습해보기
public class doWhileSumFrom1To100Exampleme {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        do {
            sum += i;
            i++;
        } while(i <= 100);
        System.out.println("1~" + (i-1) + " 합 :" + sum);
    }
}
