package daily.test1012.interfaceTest;

public class Radio implements RemoteControl{
    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다");
    }
}
