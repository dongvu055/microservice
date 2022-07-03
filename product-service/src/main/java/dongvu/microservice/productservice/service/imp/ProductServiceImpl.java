package dongvu.microservice.productservice.service.imp;

import dongvu.microservice.productservice.entity.Product;
import dongvu.microservice.productservice.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public List<Product> getListProduct() {
        return null;
    }
}
