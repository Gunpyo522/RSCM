package hello.rscm.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;



@Setter
@Getter
@Data
public class CollectedDataVO {
    // id 필드
    private int id;
    // content 필드
    private String content;
    // keyword 필드
    private String keyword;
}

