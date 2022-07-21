package dongvu.microservice.productcompositeservice.controller;

import dongvu.microservice.productcompositeservice.model.ProductComposite;
import dongvu.microservice.productcompositeservice.service.ProductCompositeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.util.List;

@RestController
public class ProductCompositeController {
    private final ProductCompositeService productCompositeService;

    @Autowired
    private DiscoveryClient discoveryClient;

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


    @RequestMapping("/service-instances/{applicationName}")
    public List<ServiceInstance> serviceInstancesByApplicationName(
            @PathVariable String applicationName) {
        return this.discoveryClient.getInstances(applicationName);
    }

}
