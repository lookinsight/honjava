package honja6;

/*
생성자에서 name 필드와 id 필드를 외부에서 받은 값으로 초기화 할 수 있도록 Member 클래스 작성
 */
public class MemberTest3_2 {
    //필드
    String name;
    String id;

    // 생성자
    MemberTest3_2(String name, String id) {
        this.name = name;
        this.id = id;
    }

}
