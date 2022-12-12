package Honja2;

import java.util.Scanner;

public class InfomationScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("[입력한 내용]");
        String name = scanner.nextLine();
        String ssNumber = scanner.nextLine();
        String tel1 = scanner.nextLine();
        String tel2 = scanner.nextLine();
        String tel3 = scanner.nextLine();

        System.out.println("[필수 정보 입력]");
        System.out.println("이름 : " + name);
        System.out.println("주민번호 앞 6자리: " + ssNumber);
        System.out.print("전화번호 : " + tel1 + "-" + tel2 + "-" + tel3);
    }
}
