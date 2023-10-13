package daily.test1013.expt;
//사용자 정의 예외. 일반예외로 선언
public class InsufficientException extends Exception {
    // 기본생성자
    public InsufficientException() {
    }

    //예외 메시지를 입력받는 생성자
    public InsufficientException(String message) {
        super(message);
    }

}
