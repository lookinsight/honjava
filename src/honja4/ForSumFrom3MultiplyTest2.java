package Honja4;

// for 문 이용 1~100까지 정수 중 3의 배수 총합 구하는 코드 작성
public class ForSumFrom3MultiplyTest2 {
    public static void main(String[] args) {
        int sum = 0;

//        int i = 0;

        for(int i=3; i<100; i+=3) {
            sum += i;
            System.out.println("i반복 할 때 합 : " + "i: " + i + "-" + "sum: " + sum);
        }
        System.out.println("1~100 사이 3의 배수 총합 :" + sum);
    }
}
