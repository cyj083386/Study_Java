package interfaceStudy;

public interface Service {
    //디폴트 메소드
    default void defaultMethod1(){
        System.out.println("defaultMethod1 종속코드");
        // 디폴트 메소드 에서만 private 메소드 호출가능
        // private 정적 메소드도 호출가능
        defaultCommon();
    }

    default void defaultMethod2(){
        System.out.println("defaultMethod2 종속코드");
        defaultCommon();
    }

    //private 메소드. java 9 부터 지원
    //구현 객체가 필요
    //중복 코드를 정의하고 디폴트 메소드에서 호출하여 사용가능
    private void defaultCommon(){
        System.out.println("defaultMethod 중복코드 A");
        System.out.println("defaultMethod 중복코드 B");
    }

    // 정적 메소드
    static void staticMethod1(){
        System.out.println("staticMethod1 종속 코드");
        // private 정적 메소드 호출가능
        // 상수필드 호출가능
        // 구현객체 필요한 경우 호출불가(추상, 디폴트, private 메소드)
        staticCommon();
    }

    static void staticMethod2(){
        System.out.println("staticMethod2 종속 코드");
        staticCommon();
    }

    //private 정적 메소드 java 9 부터 지원
    //구현 객체가 필요없음
    //중복코드를 정의하고 디폴트 메소드와 정적메소드 안에서 사용가능
    private static void staticCommon(){
        System.out.println("staticMethod 중복코드 C");
        System.out.println("staticMethod 중복코드 D");
    }
}
