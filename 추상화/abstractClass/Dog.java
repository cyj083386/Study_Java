package daily.test1012.abstractClass;

public class Dog extends Animal{
    //추상 메서드 재정의 필수
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
