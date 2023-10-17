package daily.test1017.generic;

public class Product <K, M>{
    private K kind;
    private M model;


    //getter, setter 메소드에 타입 파라미터 사용
    public K getKind() {
        return this.kind;
    }

    public void setKind(K kind) {
        this.kind = kind;
    }

    public M getModel() {
        return this.model;
    }

    public void setModel(M model) {
        this.model = model;
    }
}
