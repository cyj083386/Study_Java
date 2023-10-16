package daily.test1016.javaBaseModule;
//자바 프로그램은 JVM 위에서 실행되므로 운영체제의 모든 기능을 자바코드로 직접 접근하기는 어려움
//하지만 java.lang 패키지 내 System 클래스를 이용하면 운영체제의 일부기능을 이용할 수 있다.

//진행시간 읽기
public class MeasureRunTimeExample {
    public static void main(String[] args) {
        long time1 = System.nanoTime();
            int sum = 0;
            for (int i = 1; i <=1000000 ; i++) {
                sum += i;
        }
        long time2 = System.nanoTime(); // 나노초 단위. long currentTimeMillis()로 1/1000 초단위로 시간 리턴도 가능
        System.out.println("1~1000000까지의 합: " + sum);
        System.out.println("계산에 " + (time2 - time1)+ "나노초가 소요되었습니다.");
    }
}
