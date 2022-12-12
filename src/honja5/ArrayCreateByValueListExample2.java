package Honja5;

/*
값 목록으로 배열 생성
- 매소드의 매개값이 배열일 경우.
- 매개 변수로 int[] 배열이 선언된 add() 매소드가 있을 경우, 값 목록으로 배열을 생성함과 동시에 add() 매소드 매개값으로
사용하고자 할 때는 반드시 new 연산자 사용
 */
public class ArrayCreateByValueListExample2 {
    public static void main(String[] args) {
        int[] scores;
        scores = new int[] {83, 90, 87};
        int sum1 = 0;
        for(int i=0; i<3; i++) {
            sum1 += scores[i];
        }
        System.out.println("총합 : " + sum1);

        int sum2 = add( new int[] {83, 90, 87} );
        System.out.println("총합 : " + sum2);
        System.out.println();
    }

    /*
    총합을 계산해서 리턴하는 메소드
     */
    public static int add(int[] scores) {
        int sum = 0;
        for(int i=1; i<3; i++) {
            sum += scores[i];
        }
        return sum;
    }
}
