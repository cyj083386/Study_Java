package daily.test1013.noName;

public class Car {

    private Tire tire1 = new Tire();

    // 필드에 익명 자식 대입
    private Tire tire2 = new Tire() {
        @Override
        public void roll() {
            System.out.println("익명자식 객체 1 굴러갑니다");
        }
    };
    //메소드(필드 tire2 이용)
    public void run1(){
        tire1.roll();
        tire2.roll();
    }
    // 메소드(로컬 변수 tire 이용)
    public void run2(){
        Tire tire = new Tire() {
            @Override
            public void roll() {
                System.out.println("익명자식 객체 2 굴러갑니다");
            }
        };
        tire.roll();
    }

    //메소드(매개변수 이용)
    public void run3(Tire tire){
        tire.roll();
    }
}
