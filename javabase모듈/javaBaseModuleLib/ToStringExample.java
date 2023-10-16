package daily.test1016.javaBaseModule;


public class ToStringExample {
    public static void main(String[] args) {
        SmartPhoneToString myPhone = new SmartPhoneToString("삼성전자", "안드로이드");

        String strObj = myPhone.toString(); // toString 메소드 호출
        System.out.println(strObj);
        System.out.println(myPhone); //println()은 매개값이 객체인경우 toString() 메소드를 호출해서 리턴값을 출력
    }
}
