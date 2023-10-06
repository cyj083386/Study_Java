package daily.test1005;

public class ArrayCopyByForExample {
    public static void main(String[] args) {
        int[] oldIntArray ={1,2,3};
        int[] newIntArray = new int[5];
        //for문으로 열거하고 새로운 배열에 넣음
        for (int i = 0; i < oldIntArray.length; i++) {
            newIntArray[i] = oldIntArray[i];
        }
        for (int i = 0; i < newIntArray.length; i++) {
            System.out.println(newIntArray[i]+", ");
        }
    }
}
