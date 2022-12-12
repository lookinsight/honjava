package honja6;

/*
return 문
 */
public class Car1 {
    // 필드
    int gas;
    
    // 생성자
    
    // 메소드
    void setGas(int gas) {
        this.gas = gas;        // 리턴값이 없는 메소드로 매개값을 받아서 gas 필드값을 변경
    }
    
    boolean isLeftGas() {        // 리턴값이 boolean 인 메소드로 gas 필드값이 0이면 false, 0이 아니면 true 리턴
        if(gas == 0) {
            System.out.println("gas가 없습니다");
            return false;       // false 를 리턴
        }
        System.out.println("gas가 있습니다");
        return true;     // true 리턴
    }
    
    void run() {
        while(true) {
            if(gas > 0) {
                System.out.println("달립니다.(gas 잔량 : " + gas + ")");
                gas -= 1;
            } else {
                System.out.println("멈춥니다. (gas 잔량 : " + gas + ")");
                return;    // 메소드 실행 종료
            }
        }
    }
}
