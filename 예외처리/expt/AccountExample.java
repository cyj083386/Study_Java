package daily.test1013.expt;

public class AccountExample {
    public static void main(String[] args) {
        Account account = new Account();
        //예금하기
        account.deposit(10000);
        System.out.println("예금액: " + account.getBalance());

        //출금하기
        try {
            //withdraw() 호출 했으므로 여기서 예외처리
            account.withdraw(30000);
        }catch (InsufficientException e){
            //예외 처리 코드
            String message = e.getMessage();
            System.out.println(message);
        }

    }
}
