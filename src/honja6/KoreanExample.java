package honja6;

/*
객체 생성 후 필드값 출력
 */
public class KoreanExample {
    public static void main(String[] args) {
        Korean k1 = new Korean("박자바", "011224-1234545");
        System.out.println("k1.nation: " + k1.nation);
        System.out.println("k1.name : " + k1.name);
        System.out.println("k1.ssn : " + k1.ssn);

        Korean k2 = new Korean("김자바", "970920-0122193");
        System.out.println("k2.name: " + k2.name);
        System.out.println("k2.ssn: " + k2.ssn);
    }
}
