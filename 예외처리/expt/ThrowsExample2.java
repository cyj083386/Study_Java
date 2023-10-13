package daily.test1013.expt;

public class ThrowsExample2 {
    //2. 1번과 같은 예외가 여러개 발생하는 경우 Exception으로 모든 예외를 떠넘길수있다.
    // main에서 throws 사용시 JVM이 최종적으로 예외처리를 하게된다. JVM은 예외내용을 콘솔에 출력하는 것으로 예외처리.
    public static void main(String[] args) throws Exception{
        findClass();
    }

    //1. 예외를 처리하지 않고 떠넘김
    public static void findClass() throws ClassNotFoundException{
        Class.forName("java.lang.String2");
    }
}
