package daily.test1011.studyClass;

public class Singleton {

    private static Singleton singleton = new Singleton();

    //생성자
    public Singleton() {
    }

    public static Singleton getInstance(){
        return singleton;
    }
}
