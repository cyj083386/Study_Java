package daily.test1013.noName;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();

        car.run1();

        car.run2();

        car.run3(new Tire(){
            @Override
            public void roll() {
                System.out.println("익명자식 객체 3 굴러갑니다");
            }
        });
    }
}
