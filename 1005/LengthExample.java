package daily.test1005;

public class LengthExample {
    public static void main(String[] args) {
        String ssn ="9506241230123";
        char sex = ssn.charAt(6);
        int length = ssn.length();
        if(length == 13){
            System.out.println("주민등록번호 자릿수가 맞습니다.");
        }else{
            System.out.println("주민등록번호 자릿수가 틀립니다.");
        }
    }
}
