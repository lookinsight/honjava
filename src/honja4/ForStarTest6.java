package Honja4;

/*
for 문 이용해 * 찍기2
 */
//public class ForStarTest6 {
//    public static void main(String[] args) {
//
//        for (int i = 1; i <= 4; i++) {
//            for (int j = 4; j > 0; j++) {
//                if (i < j) {
//                    System.out.print(" ");
//                } else {
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }
//    }
//}

public class ForStarTest6 {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j > 0; j--) {
                if (i < j) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
