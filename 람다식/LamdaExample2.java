package daily.test1019.lambda;

public class LamdaExample2 {
    public static void main(String[] args) {
        action(()-> {
            System.out.println("출근을 합니다");
        });

    }
    public static void action(Workable person){ //Calculable형식 calculable 매개변수에 람다식(익명구현객체) 대입

        //데이터 처리.
        // 람다식(익명구현객체)를 통해 인터페이스에 접근 -> 추상메소드 접근 -> 람다식 내 처리내용으로 오버라이드하여 동작
        person.work();
    }
}
