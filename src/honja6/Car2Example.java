package honja6;

/*
클래스 외부에서 메소드 호출
 */
public class Car2Example {
    public static void main(String[] args) {
        Car2 myCar2 = new Car2();
        myCar2.keyTurnOn();
        myCar2.run();
        int speed = myCar2.getSpeed();
        System.out.println("현재 속도 : " + speed + "km/h");
    }
}
