package daily.test1011.Inheri;

public class SmartPhoneExample2 {
    public static void main(String[] args) {
        SmartPhone2 myPhone = new SmartPhone2("갤럭시", "은색");

        System.out.println("모델: "+myPhone.model);
        System.out.println("색상: "+myPhone.color);

        System.out.println("와이파이 상태: "+ myPhone.wifi);

        myPhone.bell();
        myPhone.sendVoice("여보세요 나야");
        myPhone.receiveVoice("안녕하세요! 저는 홍길동인데요.");
        myPhone.sendVoice("아~ 네 반갑습니다.");

    }

}
