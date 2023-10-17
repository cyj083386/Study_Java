package daily.test1017.generic;

public class GenericExample2 {
    public static void main(String[] args) {
        //클래스를 넣을 수있다. 나중에 사용자 정의 타입으로 VO를 넣기위해 배웁니다~
        Product<Tv, String> product1 = new Product<>();

        product1.setKind(new Tv());
        product1.setModel("스마트TV");

        Tv tv = product1.getKind();
        String tvModel = product1.getModel();

        Product<Car, String> product2 = new Product<>();

        product2.setKind(new Car());
        product2.setModel("SUV 자동차");

        Car car = product2.getKind();
        String carModel = product2.getModel();

    }
}
