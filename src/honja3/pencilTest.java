package Honja3;


// 연습문제 4번 풀이
// 534 자루 연필 30명 학생에게 똑같은 개수로 나누어 줄 때 1인당 몇 개 가질 수 있고 몇 개 남나?
public class pencilTest {
    public static void main(String[] args) {
        int pencils = 534;
        int students = 30;

        // 학생 1명이 가지는 연필 개수
        int pencilsPerStudent = (pencils / students);
        System.out.println(pencilsPerStudent);

        // 남은 연필 개수
        int pencilsLeft = (pencils % students);
        System.out.println(pencilsLeft);
    }
}
