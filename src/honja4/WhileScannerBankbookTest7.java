package Honja4;

/*
while 문과 Scanner 이용해 키보드로 입력된 데이터로 예금, 출금, 조회, 종료 기능 제공하는 코드 작성
Scanner nextLine() 사용
 */

import java.util.Scanner;

public class WhileScannerBankbookTest7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean run = true;
        int balance = 0;
        int withdraw = 0;
        int deposit = 0;
        String inputData;

        while(run) {
            System.out.println("---------------------------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("---------------------------------------------------");

            inputData = scanner.nextLine();
            System.out.println("선택 > " + inputData);

            if(inputData.equals("1")) {
                deposit += 10000;
                System.out.println("예금액 > " + deposit);
            }

            System.out.println("---------------------------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("---------------------------------------------------");

            inputData = scanner.nextLine();
            System.out.println("선택 > " + inputData);

            if(inputData.equals("2")) {
                withdraw = 2000;
                System.out.println("출금액 > " + withdraw);
            }

            System.out.println("---------------------------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("---------------------------------------------------");

            inputData = scanner.nextLine();
            System.out.println("선택 > " + inputData);

            if(inputData.equals("3")) {
                balance = deposit - withdraw;
                System.out.println("잔고 > " + balance);
            }

            System.out.println("---------------------------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("---------------------------------------------------");

            inputData = scanner.nextLine();
            System.out.println("선택 > " + inputData);

            if(inputData.equals("4")) {
                break;
            }
        }
        System.out.println("프로그램 종료");
    }
}
