package daily.test1010.exam02;

public class Car {
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;
    int speed;

    public Car() {
    }
//this(매개변수) 형태로 줄일수도 있으나, 가독성이 떨어질수 있다
    public Car(String model) {
        this.model = model;
    }

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
