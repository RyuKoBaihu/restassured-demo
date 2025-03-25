package requests;

import models.CreateProductsContract;

public class CreateProductsImplements extends CreateProductsContract {

    public CreateProductsImplements() {
        super();
    }

    public static CreateProductsImplements positiveScenario() {
        return new CreateProductsImplements();
    }

    public static CreateProductsImplements negativeScenarioInvalidTitle() {
        CreateProductsImplements impl = new CreateProductsImplements();
        impl.setTitle("invalid title");
        return impl;
    }

    public static CreateProductsImplements negativeScenarioInvalidPrice() {
        CreateProductsImplements impl = new CreateProductsImplements();
        impl.setPrice("-10");
        return impl;
    }
}
