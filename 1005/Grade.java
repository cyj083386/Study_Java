package daily.test1005;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("점수 입력: ");
        String strX = scanner.nextLine();
        int x = Integer.parseInt(strX);

        int score = x/10;
        char grade = ' ';

//        if(score >= 90){
//            grade = 'A';
//        }else if(score >= 80){
//            grade = 'B';
//        }else if(score >= 70) {
//            grade = 'C';
//        }else if(score >= 60){
//            grade = 'D';
//        }else{
//            grade = 'F';
//        }
        switch (score){
            case 9 :
                grade = 'A';
                break;
            case 8 :
                grade = 'B';
                break;
            case 7 :
                grade = 'C';
                break;
            case 6 :
                grade = 'D';
                break;
            default:
                grade = 'F';
        }
        System.out.println("학점은:"+grade);
    }
}
