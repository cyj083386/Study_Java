package daily.test1012.abstractClass;

public class AbstractMethodExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();
        // 매개변수의 다형성(오버라이드+클래스 타입 자동변환)
        animalSound(new Dog());
        animalSound(new Cat());
    }
    public static void animalSound(Animal animal){
        animal.sound();
    }
}
