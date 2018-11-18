package se.wesource.otherspringbootservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Other {
    private String key;
    private String otherString;
    private Integer otherInt;
}
