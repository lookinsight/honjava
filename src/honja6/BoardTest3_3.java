package honja6;

/*
Board 클래스 생성자가 오버로딩 되어 있음
생성자마다 중복 코딩된 부분에 대해  this() 활용해 중콕 코드 제거
 */
public class BoardTest3_3 {
    String title;
    String content;
    String writer;
    String date;
    int hitcount;

    BoardTest3_3(String title, String content) {
        this(title, content, "로그인한 회원아이디","현재 컴퓨터 날짜",0);
    }

    BoardTest3_3(String title, String content, String writer) {
        this(title, content, writer, "현재 컴퓨터 날짜", 0);
    }

    BoardTest3_3(String title, String content, String writer, String date) {
        this(title, content, writer, date, 0);
    }

    BoardTest3_3(String title, String content, String writer, String date, int hitcount) {
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.date = date;
        this.hitcount = hitcount;
    }
}
