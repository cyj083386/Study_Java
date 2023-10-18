package daily.test1018.collection;

import java.util.*;


// ArrayList는 0번 인덱스에 새로운 객체가 추가되면서 기존 객체의 인덱스를 한칸씩 뒤로 민다.
// 따라서 다수 add동작시 링크만 변경하는 LinkedList보다 느리다.
public class LinkedListExample {
    public static void main(String[] args) {
        //ArrayList 컬렉션 객체 생성
        List<String> list1 = new ArrayList<>();

        //LinkedList 컬렉션 객체 생성
        List<String> list2 = new LinkedList<>();

        //시작시간과 끝시간을 저장할 변수 선언
        long startTIme;
        long endTime;

        //ArrayList 컬렉션에 저장하는 시간측정
        startTIme = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list1.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        // %-17s 17자리 문자열, 오른쪽 빈자리 공백
        System.out.printf("%-17s %8d ns \n", "ArrayList 걸린 시간: ", (endTime - startTIme));

        //LinkedList 컬렉션에 저장하는 시간측정
        startTIme = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list2.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        // %-17s 17자리 문자열, 오른쪽 빈자리 공백
        System.out.printf("%-17s %8d ns \n", "LinkedList 걸린 시간: ", (endTime - startTIme));
    }
}
