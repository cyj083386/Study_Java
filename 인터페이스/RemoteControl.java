package interfaceStudy;

public interface RemoteControl {
    //상수 필드
    int MAX_VOLUME =10;
    int MIN_VOLUME= 0;

    //추상 메소드
    void turnOn();
    void turnOff();
    void setVolume(int volume);

    //디폴트 인스턴스 메소드
    default void setMute(boolean mute){
        if(mute){
            System.out.println("무음 처리합니다.");
            //추상 메소드 호출하면서 상수 필드 사용
            setVolume(MIN_VOLUME);
        } else{
            System.out.println("무음 해제합니다.");
        }
    }
    //정적 메소드. 추상메소드와 디폴트 메소드와 달리 구현객체가 없어도 인터페이스만으로 호출할 수 있다.
    static void changeBattery(){ // 클래스 정의 메소드와 달리 public을 생략하더라도 자동으로 컴파일 과정에서 붙음
        //정적메소드 실행부. 구현객체가 필요한 인스턴스 메소드는 호출 불가(추상메소드, 디폴트메소드, private 메소드)
        //상수필드만 호출가능
        System.out.println("리모콘 건전지를 교환합니다");
    }
}
