package daily.test1016.javaBaseModule;

// 객체 해시코드란 객체를 식별하는 정수. 두객체가 동등한지 비교할때 주로 사용.
// 내부 데이터가 동일하면 같은 정수값을 리턴할수 있도록 주로 재정의하여 사용한다.
// 재정의 하지 않으면 객체 주소로 해시코드를 생성하므로 다른 객체로 판단한다.

public class StudentHash {
    private int no;
    private String name;

    public StudentHash(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo(){ return no; }

    @Override
    public int hashCode() {
        int hashCode = no + name.hashCode();
        return hashCode;
    }

    //    @Override
//    public boolean equals(Object obj) {
//        // java 11에서 instanceof 미지원
//        //obj가 Student 타입 객체인지 검사하고 타입변환 후 target 변수에 대입
//        if(obj instanceof Student target){
//            if(no == target.getNo() && name.equals(target.getName())){  학생번호, 이름이 같으면 true
//                return true;
//            }
//        }
//        return false;
//    }

}
