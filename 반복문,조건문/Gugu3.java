package com.mystudy.run.etc;

import java.util.Scanner;

public class Gugu3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dan = 0;

        while (true) {


            System.out.print("구구셈 출력 프로그램! 몇단을 출력 하시겠습니까?(종료 0 or 1): ");
            String data = scanner.nextLine();
            dan = Integer.parseInt(data);

            if (dan == 0 || dan ==1) {
                break;
            }


            for (int i = 1; i < 10; i++) {
                System.out.println(dan + " * " + i + " = " + dan * i);
                // printf "%2d", i 로 자리수 맞춰보기
            }
        }
    }
}
