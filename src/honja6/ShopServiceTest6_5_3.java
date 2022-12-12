package honja6;
/*
ShopService 객체를 싱글톤으로 만들기
ShopServiceExample 클래스에서 ShopService의 getInstance() 메소드로 싱글톤 얻을 수 있게 작성
 */

public class ShopServiceTest6_5_3 {
    // 정적필드
    private static ShopServiceTest6_5_3 singleton = new ShopServiceTest6_5_3();

    // 생성자
    private ShopServiceTest6_5_3() {}

    // 정적메소드
    static ShopServiceTest6_5_3 getInstance() {
        return singleton;
    }
}
