package dongvu.microservice.productcompositeservice.controller;

import dongvu.microservice.productcompositeservice.model.ProductComposite;
import dongvu.microservice.productcompositeservice.service.ProductCompositeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;

@RestController
public class ProductCompositeController {
    private final ProductCompositeService productCompositeService;

    ProductCompositeController(ProductCompositeService productCompositeService) {
        this.productCompositeService = productCompositeService;
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

    @GetMapping("/getdata")
    public ProductComposite getListProductComposite() {
        return productCompositeService.getListProductComposite();
    }

}
