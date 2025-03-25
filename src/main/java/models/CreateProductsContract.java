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
    private String title = "Default Title";
    private String price = "10.0";
    private String description = "Default Description";
    private String image = "https://default-image.com";
    private String category = "Default Category";
}


