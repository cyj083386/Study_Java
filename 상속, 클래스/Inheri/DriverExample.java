package daily.test1011.Inheri;

public class DriverExample {
    public static void main(String[] args) {
        //Driver 객체 생성
        Driver driver = new Driver();

        Bus bus = new Bus();
        /* 매개값으로 Bus 객체를 제공하고 driver 메소드 호출
        매개값은 Vehicle 타입으로 Bus 타입을 대입할 수있다. 자동타입 변환이 되기 때문.
        Bus 내에는 run 오버라이드 되어있으므로 dirve() -> run() 메소드 실행시 Bus run()이 실행 */
        driver.drive(bus);

        //어떤 자식 객체를 제공하느냐에 따라 drive 실행결과는 달라진다. 이것이 매개변수의 다형성이다.
        Taxi taxi = new Taxi();
        driver.drive(taxi);
    }
}
