package daily.test1011.studyClass;

public class CalPiExample {
    public static void main(String[] args) {
        //정적요소는 클래스로 접근한다.
        double result1 = 10 * 10* CalPi.pi;

        int result2 = CalPi.plus(10,5);
        int result3 = CalPi.minus(10,5);

        System.out.println("result1 : "+ result1);
        System.out.println("result2 : "+ result2);
        System.out.println("result3 : "+ result3);
    }
}
