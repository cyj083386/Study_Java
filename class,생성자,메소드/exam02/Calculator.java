package daily.test1010.exam02;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Calculator {
   //입력형식 + 35 27 출력형식 35 + 27 =62
    char sign;
    int x;
    int y;

    double calResult = 0;
    void powerOn(){
        // 값 입력
        Scanner scanner = new Scanner(System.in);
        System.out.print("부호, x, y 값 입력: ");
        String strXY = scanner.nextLine();

        //입력 문자열 공백 기준으로 자르기
        StringTokenizer st = new StringTokenizer(strXY," ");
        sign = st.nextToken().charAt(0);
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        calResult = cal(sign, x, y);

        //cal 함수 호출하여 계산&출력
        if(calResult % 1 == 0.0){  // 1로 나누고 나머지가 존재한다면 소수점값이 있다는 의미이므로 해당 원리를 이용하여 값이 정수값인지 확인할 수 있습니다.
            System.out.println(x +" "+sign+" "+ y + " = "+ (int)calResult);
        } else {
            System.out.println(x +" "+sign+" "+ y + " = "+ calResult);
        }
    }

    void powerOff(){
        System.out.println("전원을 끕니다.");
    }
    double cal(char sign, int x, int y){
        //입력 부호에 따라 계산 메소드 호출, 리턴값 프린트
        switch (sign){
            case '+':
                calResult = (double) plus(x, y); break;
            case '-':
                calResult = (double) minus(x, y); break;
            case '/':
                calResult = devide(x, y); break;
            case '*':
                calResult = (double) multiple(x, y); break;
            default:
                System.out.println("입력 부호 재입력이 필요합니다."); break;
        }
        return calResult;
    }
    int plus(int x, int y){
       int result = x + y;
       return result;
    }

    int minus(int x, int y){
        int result = x - y;
        return result;
    }

    double devide(int x, int y){
        double result = (double) x / y;
        return result;
    }

    int multiple(int x, int y){
        int result =  x * y;
        return result;
    }
}
