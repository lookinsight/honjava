package honja6;

/*
생성자에서 필드 초기화
 */
public class Korean {
    // 필드
    String nation = "대한민국";
    String name;
    String ssn;

    // 생성자
//    public Korean(String n, String s) {
//        name = n;
//        ssn = s;

    /*
    this. 붙여서 Korean 생성자 수정
     */
    public Korean(String name, String ssn) {
        this.name = name;    // this(나).name(필드) = name(매개변수)
        this.ssn = ssn;
    }
}
