package dongvu.microservice.productcompositeservice.controller;

import dongvu.microservice.productcompositeservice.model.ProductComposite;
import dongvu.microservice.productcompositeservice.service.ProductCompositeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductCompositeController {
    private final ProductCompositeService productCompositeService;

    ProductCompositeController(ProductCompositeService productCompositeService) {
        this.productCompositeService = productCompositeService;
    }

    @GetMapping("/getdata")
    public List<ProductComposite> getListProductComposite() {
        return productCompositeService.getListProductComposite();
    }

}
