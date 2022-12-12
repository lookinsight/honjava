package honja6;

/*
Menber 클래스 필드를 사용해 보기
 */
public class MemberExample {
    public static void main(String[] args) {
        Member member = new Member();

        member.Name = "최하얀";
        member.Age = 23;

        System.out.println("member.Name : " + member.Name);
        System.out.println("member.Age : " + member.Age);
    }
}
