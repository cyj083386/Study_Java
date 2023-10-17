package daily.test1017.generic;
//Rentable 구현 클래스 (타입 파라미터 대체)
public class CarAgency implements Rentable<Car2> { // 타입파라미터 P를 Car2로 대체
    @Override
    public Car2 rent() {// 리턴타입이 반드시 Car2 여야함
        return new Car2();
    }
}
