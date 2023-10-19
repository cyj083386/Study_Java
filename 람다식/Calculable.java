package daily.test1019.lambda;

@FunctionalInterface // 선택사항. 컴파일 과정에서 추상메소가 하나인지 검사하므로,
// 정확한 함수형 인터페이스를 작성할 수 있게 도움.
public interface Calculable {
    void calculate(int x, int y);
}
