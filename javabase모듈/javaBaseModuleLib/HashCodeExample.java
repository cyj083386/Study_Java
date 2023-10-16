package daily.test1016.javaBaseModule;

public class HashCodeExample {
    public static void main(String[] args) {
        StudentHash s1 = new StudentHash(1, "홍길동");
        StudentHash s2 = new StudentHash(1, "홍길동");

        if(s1.hashCode() == s2.hashCode()){ // 해시코드가 동일한지 검사
            if(s1.equals(s2)) { // 데이터가 동일한지 검사
                System.out.println("동등객체");
            }else {
                System.out.println("데이터가 다르므로 동등 객체가 아닙니다.");
            }
        }else {
            System.out.println("해시코드가 다르므로 동등 객체가 아닙니다.");
        }

    }
}
