package honja6;

/*
MemberService 클래스에 login() 메소드와 logout() 메소드 선언
login() 메소드 호출할 때에는 매개값으로 id, password 제공하고, logout() 메소드는 id 만 매개값으로 제공
1. login() 매소드는 매개값 id가 "hong" 매개값 password가 "12345" 일 경우에만 true 리턴 그외 false 리턴
2. logout() 메소드의 내용은 "로그아웃 되었습니다" 출력되게 하기
 */

public class MemberService {
    // 필드
    String id;
    String password;

    // 생성자
//    public MemberService(String i, String p) {
//        id = i;
//        password = p;
//    }

    // 메소드
    boolean logIn(String id, String password) {
//        if(id == "hong" && password == "12345") {
        if(id.equals("hong") && password.equals("12345")) {
//            System.out.println("로그인 되었습니다");
            return true;
//        } else if(id != "hong") {
//////            System.out.println("id를 잘못 입력하셨습니다.");
////            return false;
////        } else if(password != "12345") {
//////            System.out.println("password를 잘못 입력하셨습니다.");
////            return false;
        } else {
            return false;
        }
    }

    void logOut(String id) {
        System.out.println("로그아웃 되었습니다");
    }
}
