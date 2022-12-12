package honja6;

/*
ssn 필드는 한 번 값이 저장되면 변경할 수 없도록 final 필드로 선언함
하지만, ssn 은 Person 객체가 생성될 때 부여되므로 Person 클래스 설계 시 초기값을 미리 줄 수 없음
그래서, 생성자 매개값으로 ssn 을 받아서 초기값으로 지정
nation은 항상 고정된 값을 갖기 때문에 필드 선언 시 초기값으로 "Korea" 줌
 */
// final 필드 선언과 초기화
public class Person {
    final String nation = "Korea";
    final String ssn;
    String name;

    public Person(String ssn, String name) {
        this.ssn = ssn;
        this.name = name;
    }
}
