package honja6;

/*
Calculator1 execute() 실행
 */
public class Calculator1Example {
    public static void main(String[] args) {
        Calculator1 myCalc1 = new Calculator1();
        myCalc1.execute();     // Calculator1 execute() 메소드 호출
    }
}

/*
Calculator1 실행 과정

1.         double result = avg(7, 10); 여기서 호출이 제일 먼저 일어나서 avg() 메소드 실행
2.         double sum = plus(x, y); 호출이 일어나서 plus() 메소드 실행
3. plus() 메소드가 리턴값을 주면 avg() 메소드는         double sum = plus(x, y);  리턴값을 sum 변수에 저장하고
4.        double result = sum / 2; 여기를 실행한 후
5.         return result; 여기에서 execute() 메소드로 리턴값 준다
6. execute() 메소드는         double result = avg(7, 10); 여기에서 avg() 메소드 리턴값을 받아
7,         println("싫행결과 : " + result); 여기 에서 println() 메소드 호출할 때 매개값으로 넘겨준다
8. println() 메소드는 매개값으로 받은 문자열을         System.out.println(message);   에서 콘솔로 출력한다
9. 마지막으로 execute() 메소드는 종료
 */
