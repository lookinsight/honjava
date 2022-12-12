package Honja5;

/*
중첩 for 문 이용해 주어진 배열 전체 항목 합과 평균 구하기
 */
public class ExamTest5 {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        int sum = 0;
        double avg = 0.0;
        int count = 0;

        for(int i=0; i<array.length; i++) {
            count += array[i].length;
            for(int j=0; j<array[i].length; j++) {
                sum += array[i][j];
                avg = (double) sum / count;
            }
        }
        System.out.println("sum: " + sum);
        System.out.println("avg: " + avg);
    }
}
