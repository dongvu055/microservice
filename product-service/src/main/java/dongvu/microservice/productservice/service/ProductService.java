package dongvu.microservice.productservice.service;

import dongvu.microservice.productservice.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> getListProduct();
}
