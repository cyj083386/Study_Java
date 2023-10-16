package daily.test1016;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//alt+enter로 인식. class path 추가
@NoArgsConstructor
@AllArgsConstructor
@Builder
//builder 사용시 위 3개 어노테이션 추가해야 동작함
@Data
public class StoreDTO {
    private String name;
    private  double lat, lng;
    private  String menu;
    private double score;


}
