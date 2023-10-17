package daily.test1017.thread;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableExecuteExample {
    public static void main(String[] args) {
        //1000개의 Runnerble 메일 생성
        String[][] mails = new String[1000][3];
        for (int i = 0; i < mails.length; i++) {
            mails[i][0] = "admin@my.com";
            mails[i][1] = "member"+i+"@my.com";
            mails[i][2] = "신상품 입고";
        }
        //ExcutorService는 최대 5개 스레드로 작업큐에서 Runnerble을 하나씩 꺼내어 run() 메소드를 실행하면서 작업을 처리한다.
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        //이메일을 보내는 작업생성 및 처리요청
        for (int i = 0; i < 1000; i++) {
            final int idx = i;
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    Thread thread = Thread.currentThread();
                    String from = mails[idx][0];
                    String to = mails[idx][1];
                    String content = mails[idx][2];
                    //스레드가 어떤 이메일을 처리했는지 알 수있도록 출력
                    System.out.println("["+thread.getName()+"]"+
                            from+ "==>"+to+": "+content);
                }
            });
        }
        //ExcutorService 종료
        executorService.shutdown();
    }
}
