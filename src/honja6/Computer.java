package honja6;

/*
매개변수를 배열로 선언한 sum1() 과 매개 변수를 ... 로 선언한 sum2() 작성 방법
매개 변수의 개수를 모를 경우
 */
public class Computer {
    int sum1(int[] values) {
        int sum = 0;
        for(int i=0; i<values.length; i++) {
            sum += values[i];
        }
        return sum;
    }

    int sum2(int ... values) {
        int sum = 0;
        for(int i=0; i<values.length; i++) {
            sum += values[i];
        }
        return sum;
    }
}
