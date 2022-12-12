package Honja3;

/*
키보드로 아이디와 패스워드 입력받음
입력 조건으로 이름은 문자열이고 패스워드는 정수임(패스워드는 int 타입으로 변환)
입력된 내용을 비교해서 아이디가 "java" 이고 패스워드가 12345 라면 "로그인 성공" 출력
아니면 "로그인 실패" 출력
 */

import java.util.Scanner;

//public class loginTest11 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("아이디 : ");
//        String name = scanner.nextLine();
//
//        System.out.print("패스워드 : ");
//        String strPassword = scanner.nextLine();
//        int password = Integer.parseInt(strPassword);   // String 타입 Int 타입으로 강제 형변환
//
//        System.out.println("-----------------------------------------");
//        if(name == "java") {
//            if(password == 12345) {
//                System.out.println("로그인 성공");
//            } else {
//                System.out.println("로그인 실패: 패스워드가 틀림");
//            }
//        } else {
//            System.out.println("로그인 실패: 아이디 존재하지 않음");
//        }
//    }
//}
public class loginTest11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("아이디 : ");
        String name = scanner.nextLine();

        System.out.print("패스워드 : ");
        String strPassword = scanner.nextLine();
        int password = Integer.parseInt(strPassword);   // String 타입 Int 타입으로 강제 형변환

        System.out.println("-----------------------------------------");
        if(name.equals("java")) {                        // 문자열 타입 비교는 .equals 사용해야 함
            if(password == 12345) {
                System.out.println("로그인 성공");
            } else {
                System.out.println("로그인 실패: 패스워드가 틀림");
            }
        } else {
            System.out.println("로그인 실패: 아이디 존재하지 않음");
        }
    }
}