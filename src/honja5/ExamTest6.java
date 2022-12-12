package Honja5;

/*
키보드로부터 학생 수와 각 학생들의 점수 입력 받아서 최고 점수 및 평균 점수 구하는 프로그램 구현
 */
import java.util.Scanner;
public class ExamTest6 {
    public static void main(String[] args) {

        boolean run = true;
        int studentNum = 0;
        int[] scores = null;
        Scanner scanner = new Scanner(System.in);

        while(run) {
            System.out.println("--------------------------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("--------------------------------------------------------------------");
            System.out.print("선택 > ");

            int selectNo = Integer.parseInt(scanner.nextLine());

            if(selectNo == 1) {
                System.out.println("선택 > " + selectNo);
                System.out.println("학생 수 > " + scores.length);
            } else if(selectNo==2) {
                System.out.println("선택 > " + selectNo);
                scores = new int[3];
                for(int i=0; i<scores.length; i++) {
                    scores[i] = scanner.nextInt();
                    System.out.println("scores: [" + i + "]" + scores);
                }
            } else if(selectNo == 3) {
                System.out.println("선택 > " + selectNo);
                for(int i=0; i<scores.length; i++) {
                    System.out.println("scores: [" + i + "]" + scores);
                }
            } else if(selectNo == 4) {
                System.out.println("선택 > " + selectNo);
                int max = 0;
                int sum = 0;
                double avg = 0.0;
                for(int i=0; i<scores.length; i++) {
                    if(max < scores[i]) {
                        max = scores[i];
                        sum += scores[i];
                        avg = (double) sum / scores.length;
                        System.out.println("최고 점수 : " + max);
                        System.out.println("평균 점수 : " + avg);
                    }
                }
            } else if(selectNo == 5) {
                System.out.println("선택 > " + selectNo);
                run = false;
            }
        }

        System.out.println("프로그램 종료");
    }
}
