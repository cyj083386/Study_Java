package daily.test1005;

public class MultidimensionalArray {
    public static void main(String[] args) {
        //int[][] mathScores =new int[2][3]; 학생수가 같을때는 한번에
        int[][] mathScores =new int[2][];
        mathScores[0] =new int[2];
        mathScores[1] =new int[3];

        for (int i = 0; i < mathScores.length; i++) {
            for (int j = 0; j < mathScores[i].length; j++) {
                System.out.println("mathScore[" + i + "][" + j + "]:"+mathScores[i][j]);
            }
        }
        System.out.println();
        mathScores[0][0] = 90;
        mathScores[0][1] = 91;
        mathScores[1][0] = 92;
        mathScores[1][1] = 93;
        mathScores[1][2] = 94;

        int totalStudent = 0;
        int totalMathSum = 0;

        for (int i = 0; i < mathScores.length; i++) {
            totalStudent += mathScores[i].length;
            for (int j = 0; j < mathScores[i].length; j++) {
                totalMathSum += mathScores[i][j];
            }
        }

        double totalMathAvg = (double) totalMathSum/totalStudent;
        System.out.println("전체학생의 수학평균 점수:"+totalMathAvg);
        System.out.println();
    }
}
