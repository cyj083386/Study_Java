package com.mystudy.run.etc;

public class StarPrint {
    public static void main(String[] args) {
        int strX = 5;

        for (int i = -(strX/2); i < strX/2+1; i++) { //i는 -strX/2부터 strX/2+1까지 반복
            int n = Math.abs(i); //n은 i의 절댓값
            System.out.print(" ".repeat(n + 3)); //공백을 n+3번 출력
            System.out.print("*".repeat(strX - 2 * n)); //별을 strX-2n번 출력
            System.out.println(); //줄바꿈
        }
    }
}


