package daily.test1012.abstractClass;

public class PhoneExample {
    // 추상 클래스는 객체 생성하여 의존불가 Phone phone = new Phone();
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("최영주");

        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();
    }


}
