package dongvu.microservice.productservice.service.imp;

import dongvu.microservice.productservice.entity.Product;
import dongvu.microservice.productservice.repo.ProductRepo;
import dongvu.microservice.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepo productRepo;

    @Override
    public List<Product> getListProduct() {
        return productRepo.findAll();
    }
}
