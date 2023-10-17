package daily.test1017.thread;

import java.awt.Toolkit;

//메인 스레드가 동시에 두가지 작업을 처리할 수 없음
//메인 스레드는 비프음을 모두 발생한 다음에야 프린팅을 시작
public class BeepPrintExample {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 5; i++) {
            toolkit.beep();
            try{Thread.sleep(500);}catch (Exception e){}
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try{Thread.sleep(500);} catch (Exception e){}
        }
    }

}
