package daily.test1011.Inheri;

public class SmartPhone extends Phone{
    public SmartPhone(String model, String color) {
        super(model, color); // 매개변수 없다면 생략가능(컴파일시 추가됨), 지금은 필수작성
        this.model = model;
        this.color = color;
        System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
    }

}
