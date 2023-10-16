package daily.test1016;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        //builder().build(); -> 생성자가 많고 복잡할때
        StoreDTO storeDTO = StoreDTO.builder()
                .name("가게이름")
                .lat(37.1234)
                .lng(127.23332)
                .menu("쌈밥")
                .build();
        //chain식은  DB 항목과 순서를 다르게 해도 된다.
        System.out.println(storeDTO);
    }
}
