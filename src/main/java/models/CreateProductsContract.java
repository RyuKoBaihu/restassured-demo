package models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateProductsContract {
    private String title;
    private String price;
    private String description;
    private String image;
    private String category;
}


