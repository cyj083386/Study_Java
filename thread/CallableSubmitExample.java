package daily.test1017.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableSubmitExample {
    public static void main(String[] args) {
        //2. ExecutorService는 최대 5개 스레드로 작업 큐에서 Callable을 하나씩 꺼내어 call 메소드를 실행하면서 작업을 처리한다.
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        //1. 100개의 Callable 계산작업을 생성하고 submit()메소드로 작업 큐에 넣는다.
        for (int i = 0; i <=100 ; i++) {
            final int idx =i;
            Future<Integer> future = executorService.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    int sum =0;
                    for (int j = 1; j <= idx ; j++) {
                        sum += j;
                    }
                    Thread thread = Thread.currentThread();
                    System.out.println("["+ thread.getName()+"] 1~" + idx + " 합 계산");
                    return sum;
                }
            });
            try{
                int result = future.get();
                System.out.println("\t리턴값: "+ result);
            } catch (Exception e){
                e.printStackTrace();
            }

        }
        executorService.shutdown();

    }
}
