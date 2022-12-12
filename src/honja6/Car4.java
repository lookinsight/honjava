package honja6;
/*
정적 메소드 선언 시 주의할 점
 */

public class Car4 {
    int speed;

    void run() {
        System.out.println(speed + "으로 달립니다");
    }

    public static void main(String[] args) {
        Car4 myCar4 = new Car4();
        myCar4.speed = 60;
        myCar4.run();
    }
}
