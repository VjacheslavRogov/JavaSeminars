package HomeWork.HwS3_T2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product2 {
    private String name;
    private String country;
    private Integer weight;
    private Integer price;
    private String variety;
}
