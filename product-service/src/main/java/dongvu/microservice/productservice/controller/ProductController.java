package dongvu.microservice.productservice.controller;

import dongvu.microservice.productservice.entity.Product;
import dongvu.microservice.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.util.List;

@RestController
public class ProductController {
    private final ProductService productService;

    @Value("${spring.datasource.url}")
    String url;


    ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/getdata")
    public List<Product> getListProductComposite() {
        return productService.getListProduct();
    }

    @GetMapping("/ping")
    public String test() {
        try {
            InetAddress IP = InetAddress.getLocalHost();
            return "pong: " + IP.getHostAddress();
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    @Autowired
    public void test1() {
        System.out.println(url);
    }
}
