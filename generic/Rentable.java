package daily.test1017.generic;

public interface Rentable<P> { //타입 파라미터 P 정의
    P rent(); //타입 파라미터 P를 리턴타입으로 사용
}
