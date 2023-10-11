package daily.test1011.studyClass;

public class Car {


    String model;
    int speed;

    public Car(String model) {
        this.model = model;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    void run(){
        // 매개변수와 겹치지 않으므로 this 지워도 됨
        this.setSpeed(100);
        System.out.println(this.model + "가 달립니다.(시속:"+this.speed+"km/h)");
    }
}
