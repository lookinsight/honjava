package honja6;

/*
Car 클래스 필드 선언
Car 클래스 생성자 선언
 */
//public class Car {
//    // 필드
//    String company = "현대자동차";
//    String model = "그랜저";
//    String color = "검정";
//    int maxSpeed = 350;
//    int speed;
//
//    // 생성자
//    Car(String color, int cc) {
//
//    }
//}

/*
Car 클래스ㅜ에서 생성자를 오버로딩한 예
 */
//public class Car {
//    Car() {...}
//    Car(String model) {...}
//    Car(String model, String color) {...}
//    Car(String model, String color, int maxSpeed) {...}
//}
/*
생성자의 오버로딩
 */
public class Car {
    //필드
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    //생성자
    // 1
//    Car() {
//
//    }
//
//    // 2
//    Car(String model) {
//        this.model = model;
//    }
//
//    // 3
//    Car(String model, String color) {
//        this.model = model;
//        this.color = color;
//    }
//
//    //4
//    Car(String model, String color, int maxSpeed) {
//        this.model = model;
//        this.color = color;
//        this.maxSpeed = maxSpeed;
//    }
    /*
    다른 생성자를 호출해서 중복 코드 줄이기
     */
    //생성자
    Car() {

    }

    Car(String model) {
        this(model, "은색", 250);         // 호출
    }

    Car(String model, String color) {
        this(model, color, 250);           // 호출
    }

    Car(String model, String color, int maxSpeed) {
        this.model = model;                     // 공통실행코드
        this.color = color;                    // 공통실행코드
        this.maxSpeed = maxSpeed;              // 공통실행코드
    }
}