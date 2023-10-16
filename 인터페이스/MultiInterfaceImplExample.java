package interfaceStudy;

public class MultiInterfaceImplExample {
    public static void main(String[] args) {
        //RemoteControl2 인터페이스 변수 선언 및 구현 객체 대입
        RemoteControl2 rc = new SmartTelevision();
        //RemoteControl2 인터페이스에 선언된 추상 메소드만 호출 가능
        rc.trunOn();
        rc.turnOff();
        //Searchable 인터페이스 변수 선언 및 구현 객체 대입
        Searchable searchable = new SmartTelevision();
        searchable.search("https://www.youtube.com");
    }
}
