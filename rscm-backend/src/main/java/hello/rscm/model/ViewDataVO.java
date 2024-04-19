package hello.rscm.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Data
@Getter
@Setter
public class ViewDataVO {
    private int id;
    private LocalDateTime datetime;
    private String crimeType;
    private String location;
    private String offender;
    private String victim;
    private String addInformation;
    private int regionCode;
}

