package dongvu.microservice.productservice.controller;

import dongvu.microservice.productservice.entity.Product;
import dongvu.microservice.productservice.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    private final ProductService productService;

    ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/getdata")
    public List<Product> getListProductComposite() {
        return productService.getListProduct();
    }
}
