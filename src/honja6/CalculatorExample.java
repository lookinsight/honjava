package honja6;

/*
 외부 클래스에서 Calculator 클래스 메소드 호출하기 위해서는
 Calculator 객체 생성하고 참조 변수인  myCalc 이용해야 함
 my Calc 변수에 도트(.) 와 함께 '메소드 이름(매개값, ...)' 형태로 호출하면 메소드 블록 실행 됨
 */
public class CalculatorExample {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();
        myCalc.powerOn();

        int result1 = myCalc.plus(5, 6);
        System.out.println("result1 : " + result1);

        byte x = 10;
        byte y = 4;
        double result2 = myCalc.divide(x, y);
        System.out.println("result2 : " + result2);

        myCalc.powerOff();
    }
}
