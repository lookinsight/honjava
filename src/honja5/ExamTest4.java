package Honja5;

/*
for 문 이용해서 주어진 배열의 항목에서 최대값 구하기
 */
public class ExamTest4 {
    public static void main(String[] args) {
        int max = 0;
        int[] array = {1, 5, 3, 8, 2};

        for(int i=0; i<array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("max: " + max);
    }
}
