package requests;

import models.CreateProductsContract;

public class CreateProductsImplements extends CreateProductsContract {

    public CreateProductsImplements() {
        super(
                "test product",
                "13.5",
                "lorem ipsum set",
                "https://i.pravatar.cc",
                "electronic"
        );
    }
}
