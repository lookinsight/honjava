package honja6;
/*
문제 풀이
 */

public class ShopServiceTest6_5_3Exam {
    public static void main(String[] args) {
        ShopServiceTest6_5_3 obj1 = ShopServiceTest6_5_3.getInstance();
        ShopServiceTest6_5_3 obj2 = ShopServiceTest6_5_3.getInstance();

        if (obj1 == obj2) {
            System.out.println("같은 ShopService 객체 입니다");
        } else {
            System.out.println("다른 ShopService 객체 입니다.");
        }
    }
}
