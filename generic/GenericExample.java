package daily.test1017.generic;

public class GenericExample {
    public static void main(String[] args) {
        Box<String> box1 = new Box<>(); //  원래는 new Box<String>
        box1.content = "안녕하세요";
        String str = box1.content;
        System.out.println(str);

        Box<Integer> box2 = new Box<>();
        box2.content = 100;
        Integer value = box2.content;
        System.out.println(value);
    }
}
