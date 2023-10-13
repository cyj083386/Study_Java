package daily.test1013.expt;

public class Account {
    private long balance;

    public Account(){ }

    public long getBalance(){
        return balance;
    }
    public void deposit(int money){
        balance += money;
    }

    public void withdraw(int money) throws InsufficientException { // 호출시 예외 떠넘김
        if (balance < money){
            //예외 발생
            throw new InsufficientException("잔고 부족: "+(money-balance)+" 모자람");
        }
        balance -= money;
    }

}
