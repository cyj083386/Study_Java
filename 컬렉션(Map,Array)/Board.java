package daily.test1018.collection;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

// 롬복 애너테이션으로 모든필드를 초기화 시키는 생성자(매개변수 있음), getter, setter 정의
// Board 타입을 정의. 사실상 VO
@AllArgsConstructor
@Getter
@Setter

public class Board {
    private String subject;
    private String content;
    private String writer;

// 롬복 미사용시 필요한 생성자, getter(), setter() 메소드
//    public Board(String subject, String content, String writer) {
//        this.subject = subject;
//        this.content = content;
//        this.writer = writer;
//    }
//    public String getSubject() {
//        return subject;
//    }
//
//    public String getContent() {
//        return content;
//    }
//
//    public String getWriter() {
//        return writer;
//    }
//
//    public void setSubject(String subject) {
//        this.subject = subject;
//    }
//
//    public void setContent(String content) {
//        this.content = content;
//    }
//
//    public void setWriter(String writer) {
//        this.writer = writer;
//    }


}
