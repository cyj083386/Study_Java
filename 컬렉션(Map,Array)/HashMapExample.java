package daily.test1018.collection;

import java.util.*;
import java.util.Map.Entry;

public class HashMapExample {

    public static void main(String[] args) {
        //Map 컬렉션 생성
        Map<String, Integer> map = new HashMap<>();

        //객체 저장
        map.put("신용권", 85);
        map.put("홍길동", 90);
        map.put("동장군", 80);
        map.put("홍길동", 95); // 키가 같기 때문에 제일 마지막에 저장한 값 만 저장

        System.out.println("총 Entry 수: "+ map.size());
        System.out.println();

        //키로 값 얻기
        String key = "홍길동";
        int value = map.get(key);
        System.out.println(key + ": " + value); //마지막에 저장한 값 출력
        System.out.println();

        //키 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
        Set<String> keySet = map.keySet(); // Map의 keySet() 메소드는 모든 key값을 set 형태로 반환
        // 키를반복하기 위해 반복자를 얻음
        // Iterator는 자바의 컬렉션 프레임워크에서 컬렉션에 저장되어 있는 요소들을 읽어오는 방법
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()){ // Iterator의 hasNext() 메소드는 남은 요소가 있다면 true 반환
            String k = keyIterator.next(); //Iterator의 next() 메소드는 다음 요소 반환
            Integer v = map.get(k);
            System.out.println(k + " : " + v);
        }
        System.out.println();

        //엔트리 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
        // Map의 entrySet() 메소드는 키와 값의쌍으로 구성된 모든 Map.Entry 객체를 Set에 담아서 리턴
        // 키와 값으로 구성된 객체를 Entry 객체라고 한다. Map 컬렉션은 이 객체의 모음이다.
        Set<Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();// 엔트리를 반복하기 위해 반복자를 얻음

        while (entryIterator.hasNext()){
            Entry<String, Integer> entry = entryIterator.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k + " : " + v);
        }
        System.out.println();

        //키로 엔트리 삭제
        map.remove("홍길동");
        System.out.println("총 Entry 수: " + map.size());
        System.out.println();


    }

}
