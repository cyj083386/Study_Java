package daily.test1018.collection;

import java.util.ArrayList;
import java.util.List;


public class ArrayListExample {
    public static void main(String[] args) {
        //ArrayList 컬렉션 생성. 지정한 Board 타입의 객체만 저장
        //부모 인터페이스인 List 타입 변수에 ArrayList 객체 저장 -> 부모것까지 사용하여 코드의 유연성을 높임
        List<Board> list = new ArrayList<>();
        
        //객체5개 추가
        list.add(new Board("제목1", "내용1", "글쓴이1"));
        list.add(new Board("제목2", "내용2", "글쓴이2"));
        list.add(new Board("제목3", "내용3", "글쓴이3"));
        list.add(new Board("제목4", "내용4", "글쓴이4"));
        list.add(new Board("제목5", "내용5", "글쓴이5"));
        
        //size() 메소드로 저장된 총 객체 수 얻기
        int size = list.size();
        System.out.println("총 객체 수: "+size);
        System.out.println();
        
        //get()메소드로 특정인덱스의 객체 가져오기, \t는 스페이스
        Board board = list.get(2);
        System.out.println(board.getSubject()+ "\t" + board.getContent()+
                "\t"+ board.getWriter());
        System.out.println();
        
        //모든 객체를 하나씩 가져오기
        for (int i = 0; i < list.size(); i++) {
            Board b = list.get(i);
            System.out.println(b.getSubject()+ "\t" + b.getContent()+
                    "\t"+ b.getWriter());
        }
        System.out.println();
        //객체 삭제. 2번 인덱스를 삭제하면 3번 인덱스가 2번 인덱스로 변경되므로 다시 2번 인덱스를 제거
        list.remove(2);
        list.remove(2);
        
        //for each 문으로 모든 객체를 하나씩 가져오기. 향상된 for문
        for (Board b : list) {
            System.out.println(b.getSubject()+ "\t" + b.getContent()+
                    "\t"+ b.getWriter());
        }

    }
}
// 수정시 arrList.set(1, "b"); set(인덱스, 바꿀값)
// 삭제시 clear() 메소드도 있다. ArrayList 전체 element를 삭제.