package daily.test1016;

import java.util.regex.Pattern;

public class PatternExample {
    public static void main(String[] args) {
        String regExp = "(02|010)-\\d{3,4}-\\d{4}";
        String data = "010-123-4567";
        boolean result = Pattern.matches(regExp, data);
        if (result){
            System.out.println("정규식과 일치합니다.");
        } else {
            System.out.println("정규식과 일치하지 않습니다.");
        }

        // ? 패턴의 앞에 문자가(1개)없거나 혹은 한개가 존재하는 경우를 의미합니다. 즉, a?c는 abc도 될 수 있고, bc도 될 수 있습니다.
        // 여기서는 abc@naver.com 과 abc@naver.co.kr 모두 통과하도록 설정한것
        regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
        data = "angel@mycomapny.co.kr";
        result = Pattern.matches(regExp, data);
        if (result){
            System.out.println("정규식과 일치합니다.");
        } else {
            System.out.println("정규식과 일치하지 않습니다.");
        }
    }
}
