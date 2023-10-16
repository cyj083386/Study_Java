package interfaceStudy;

public class Audio implements RemoteControl{
    //필드
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("Audio를 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio를 끕니다");
    }

    @Override
    public void setVolume(int volume) {
        if(volume>RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume<RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 Audio 볼륨: " + this.volume);
    }
    private int memoryVolume; //추가 필드 선언

    //디폴트 메소드 재정의도 가능한데, public 접근제한자르 반드시 붙이고 default 키워드를 생략해야 함
    @Override
    public void setMute(boolean mute) {
        if(mute){
            this.memoryVolume = this.volume;
            System.out.println("무음 처리합니다.");
            setVolume(RemoteControl.MIN_VOLUME);
        }else {
            System.out.println("무음 해제합니다.");
            setVolume(this.memoryVolume); // mute가 false일 경우, 원래 볼륨으로 복원
        }
    }
}
