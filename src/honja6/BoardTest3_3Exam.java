package honja6;

/*
Board 객체 생성하는 네 가지 방법
 */
public class BoardTest3_3Exam {
    public static void main(String[] args) {
        BoardTest3_3 board1 = new BoardTest3_3("연습문제 풀이", "6-3-4번 문제 풀이 중");       // 2번 생성자 선택
        System.out.println("board1.title : " + board1.title);
        System.out.println("board1.content : " + board1.content);
        System.out.println("board1.writer : " + board1.writer);
        System.out.println("board1.date : " + board1.date);
        System.out.println("board1.hitcount : " + board1.hitcount);
        System.out.println();

        BoardTest3_3 board2 = new BoardTest3_3("연습문제 풀이", "6-3-4번 문제 풀이 중", "로그인한 회원 아이디");       // 2번 생성자 선택
        System.out.println("board2.title : " + board2.title);
        System.out.println("board2.content : " + board2.content);
        System.out.println("board2.writer : " + board2.writer);
        System.out.println("board2.date : " + board2.date);
        System.out.println("board2.hitcount : " + board2.hitcount);
        System.out.println();

        BoardTest3_3 board3 = new BoardTest3_3("연습문제 풀이", "6-3-4번 문제 풀이 중", "로그인한 회원 아이디", "현재 컴퓨터 날짜");       // 2번 생성자 선택
        System.out.println("board3.title : " + board3.title);
        System.out.println("board3.content : " + board3.content);
        System.out.println("board3.writer : " + board3.writer);
        System.out.println("board3.date : " + board3.date);
        System.out.println("board3.hitcount : " + board3.hitcount);
        System.out.println();

        BoardTest3_3 board4 = new BoardTest3_3("연습문제 풀이", "6-3-4번 문제 풀이 중", "로그인한 회원 아이디", "현재 컴퓨터 날짜", 0);       // 2번 생성자 선택
        System.out.println("board4.title : " + board4.title);
        System.out.println("board4.content : " + board4.content);
        System.out.println("board4.writer : " + board4.writer);
        System.out.println("board4.date : " + board4.date);
        System.out.println("board4.hitcount : " + board4.hitcount);
        System.out.println();
    }
}
