package Honja5;

/* 향상된 for 문

1.for문이 처음 실행될 때 배열에서 가져올 첫번재 값이 존재하는지 평가
2. 가져올 값이 존재하면 해당 값을 변수에 저장
3. 실행문 실행
4. 블록 내부의 실행문 모두 실행되면 다시 루프 돌아 배열에서 가져올 다음 값이 존재하는지 평가
5. 만약 다음 항목이 존재하면 위 순서로 ㄹ루프 다시 진행하고 가져올 다음 항목이 없으면 for문 종료
 */
public class AdvancedForExample {
    public static void main(String[] args) {
        int[] scores = { 95, 71, 84, 93, 87 };

        int sum = 0;
        for(int score : scores) {
            sum = sum + score;
        }
        System.out.println("점수 총합 = " + sum);

        double avg = (double) sum / scores.length;
        System.out.println("점수 평균 : " + avg);
    }
}
