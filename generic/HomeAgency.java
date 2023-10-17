package daily.test1017.generic;

//Rentable 구현 클래스(타입 파라미터 Home으로 대체)
public class HomeAgency implements Rentable<Home>{
    @Override
    public Home rent() { //리턴타입은 반드시 홈이어야 한다.
        return new Home();
    }
}
