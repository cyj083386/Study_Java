package daily.test1011.Inheri;

public class CarExample {
    public static void main(String[] args) {
        //Car 객체 생성
        Car myCar = new Car();

        //Tire 객체 생성
        myCar.tire = new Tire();
        myCar.run();
        // HankookTire 객체를 Tire 필드인 tire에 대입할수 있다. 자동타입 변환이 되기 때문.
        myCar.tire = new HankookTire();
        myCar.run(); // HankookTire는 roll() 메소드를 오버라이딩(재정의) 하고 있으므로 해당 값이 나온다.
        // 자동타입 변환 + 오버라이딩 = 다형성 구현(사용방법은 동일하지만 실행 결과가 다양하게 나오는 성질)
        myCar.tire = new KumhoTire();
        myCar.run();
    }
}
