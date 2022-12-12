package Honja3;

/* 키보드로 두 실수를 입력 받음 - Scanner 이용
입력 된 첫 번째 수에 두 번재 수를 나눈 결과를 "결과:값"으로 출력하되,
두 번째 수에 0또는 0.0이 입력되었을 경우 "결과: 무한대" 출력되도록
 */
import java.util.Scanner;

//public class doubleTest9 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        double firstData = scanner.nextDouble();
//        double secondData = scanner.nextDouble();
//        if (secondData == 0 || secondData == 0.0) {
//            System.out.println("결과: 무한대");
//        } else {
//            double result = (firstData / secondData);
//            System.out.println("결과 : " + result);
//        }
//    }
//}

//public class doubleTest9 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        float firstData = scanner.nextFloat();
//        float secondData = scanner.nextFloat();
//        if (secondData == 0 || secondData == 0.0) {
//            System.out.println("결과: 무한대");
//        } else {
//            float result = (firstData / secondData);
//            System.out.println("결과 : " + result);
//        }
//    }
//}

public class doubleTest9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 수: ");
        double firstData = Double.parseDouble(scanner.nextLine());

        System.out.println("두 번째 수: ");
        double secondData = Double.parseDouble(scanner.nextLine());

        System.out.println("-----------------------------");
        if(secondData != 0.0) {
            System.out.println("결과 : " + (firstData / secondData));
        } else {
            System.out.println("결과 : 무한대");
        }
    }
}
