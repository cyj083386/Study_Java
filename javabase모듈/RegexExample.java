package daily.test1016;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^[a-zA-Z]*$");
        String val = "abcdef";

        Matcher matcher = pattern.matcher(val);
        System.out.println(matcher.find());

        String name ="홍길동";
        String tel ="010-1234-5678";
        String email = "test@naver.com";

        boolean name_check = Pattern.matches("^[가-힣]*$", name);
        boolean tel_check = Pattern.matches("^01(?:0|1|[6-9])-(?:\\d{3}|\\d{4})-\\d{4}$", tel);
        boolean email_check = Pattern.matches("\\w+@\\w+\\.\\w+(\\.\\w+)?",email);

        System.out.println("name_check");
        System.out.println("tel_check");
        System.out.println("email_check");

    }
}
