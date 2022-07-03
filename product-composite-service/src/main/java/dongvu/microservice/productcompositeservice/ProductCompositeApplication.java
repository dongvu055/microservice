package dongvu.microservice.productcompositeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ProductCompositeApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductCompositeApplication.class,args);
    }
}
