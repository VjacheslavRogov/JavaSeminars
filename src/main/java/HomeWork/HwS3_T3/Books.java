package HomeWork.HwS3_T3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Books {
    private String name;
    private String surname;
    private Integer price;
    private Integer year;
    private Integer pageCount;
}
