package daily.test1016.javaBaseModule;

// toString() 메소드는 객체를 문자열로 표현한 값을 리턴한다.
// ex) "클래스명@16진수해시코드"로 구성 : java.lang.Object@de6ced
public class SmartPhoneToString {
    private String company;
    private String os;

    public SmartPhoneToString(String company, String os) {
        this.company = company;
        this.os = os;
    }
// 제조사와 운영체제가 결합된 문자열을 리턴하도록 재정의
    @Override
    public String toString() {
        return company + ", " + os;
    }
}
