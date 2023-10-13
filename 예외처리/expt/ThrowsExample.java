package daily.test1013.expt;

public class ThrowsExample {
    public static void main(String[] args) {
        try{
            findClass(); // 2. 떠넘긴 메소드를 호출한 쪽에서 예외처리
        }catch(ClassNotFoundException e){
            System.out.println("예외 처리: " + e.toString());
        }
    }

    //1. 예외를 처리하지 않고 떠넘김
    public static void findClass() throws ClassNotFoundException{
        Class.forName("java.lang.String2");
    }
}
