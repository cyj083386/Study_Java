package daily.test1019;

import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {
    public static void main(String[] args) throws Exception {
        //Properties 컬렉션 생성
        Properties properties = new Properties();

        //PropertiesExample.class 와 동일한 ClassPath에 있는 database.properties 파일로드
        //일반적으로 프로퍼티 파일은 클래스 파일들과 함께 저장되므로 클래스파일을 기준으로 상대경로를 이용해서 읽는 것이 편리.
        properties.load(PropertiesExample.class.getResourceAsStream("database.properties")); //Class 객체의 getResourceAsStream() 은 상대경로의 리소스 파일을 읽는 InputStream을 리턴

        //주어진 키에 대한 값 읽기
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        String admin = properties.getProperty("admin");

        System.out.println("driver : " + driver);
        System.out.println("url : " + url);
        System.out.println("username : " + username);
        System.out.println("password : " + password);
        System.out.println("admin : " + admin);




    }
}
