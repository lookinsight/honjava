package Honja5;

/*
main() 메소드 매개 변수
실행할 때 2개 문자열 주지 않으면 "값의 수가 부족합니다" 출력하고 강제 종료
만약 2개 문자열이 정확히 입력되었다면 2개 문자열 정수로 변환하고 덧셈 연산
 */
public class MainStringArrayArgument {
    public static void main(String[] args) {
        if(args.length != 2) {             // 입력된 데이터 개수가 2개가 아닐 경우
            System.out.println("값의 수가 부족합니다");
            System.exit(0);              //  프로그램 강제 종료
        }

        String strNum1 = args[0];        // 첫 번째 데이터 얻기
        String strNum2 = args[1];        // 두 번째 데이터 얻기

        int num1 = Integer.parseInt(strNum1);  // 문자열을 정수로 변환
        int num2 = Integer.parseInt(strNum2);   // 문자열 정수로 변환

        int result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
    }
}
