package daily.test1004;

public class BinaryOne {
    public static void main(String[] args) {
        //비트연산자로 숫자 연산
        //int i = 7;
        //int j = 5;
        //System.out.println(7&5);

        // 비트이동 연산자(shift), 정수 i의 비트를 숫자만큼 이동
        int i = 13;
        System.out.println("i<<1 : " +(i<<1));
        System.out.println("i<<1 : " +(i<<2));
        System.out.println("i>>2 : " +(i>>1));
        System.out.println("i>>2 : " +(i>>2));

    }

}
