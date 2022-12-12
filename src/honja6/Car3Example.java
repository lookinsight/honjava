package honja6;

/*
인스턴스 멤버와 this
 */
public class Car3Example {
    public static void main(String[] args) {
        Car3 myCar3 = new Car3("포르쉐");
        Car3 yourCar3 = new Car3("벤츠");

        myCar3.run();
        yourCar3.run();
    }
}
