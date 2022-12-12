package honja6;

/*
return 문
 */
public class Car1Example {
    public static void main(String[] args) {
        Car1 myCar1 = new Car1();

        myCar1.setGas(5);    // Car1 setGas() 메소드 호출

        boolean gasState = myCar1.isLeftGas();   // Car1 의 isLeftGas() 메소드 호출
        if (gasState) {
            System.out.println("출발합니다");
            myCar1.run();    // Car1의 run() 메소드 호출
        }

        if (myCar1.isLeftGas()) {   // Car1의 isLeftGas() 메소드 호출
            System.out.println("gas를 주입할 필요가 없습니다");
        } else {
            System.out.println("gas 를 주입하세요");
        }
    }
}
