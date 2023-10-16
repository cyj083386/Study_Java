package daily.test1016.javaBaseModule;

// equals() 메소드는  동등 비교용. String 객체는 다르나(주소값) 실제 data 내용은 같을때 비교하여 사용가능.
public class MemberEquals {
    public String id;

    public MemberEquals(String id){
        this.id =id;
    }

//    @Override
//    public boolean equals(Object obj) {
//        // java 11에서 instanceof 미지원
//        //obj가 Member 타입인지 검사하고 타입변환 후 target 변수에 대입
//        if(obj instanceof Member target){
//            if(id.equals(target.id)){ //id 문자열이 같은지 비교. obj1.equals(obj2) 형식으로 사용
//                return true;
//            }
//        }
//        return false;
//    }
}
