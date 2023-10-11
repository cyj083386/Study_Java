package daily.test1011.Inheri;

import daily.test1010.Calculator;

public class ComputerExample {
    public static void main(String[] args) {
        int r = 10;
        //기존 메소드 호출
        CalcOverride calculator = new CalcOverride();
        System.out.println("원 면적: "+ calculator.areaCircle(r));
        System.out.println();

        // 오버라이드한 메소드 호출
        Computer computer = new Computer();
        System.out.println("원 면적: "+ computer.areaCircle(r));

    }
}
