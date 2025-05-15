package Edstruments.example.ProductsAPI.service;
import java.util.List;

import Edstruments.example.ProductsAPI.model.Product;
import Edstruments.example.ProductsAPI.dto.ProductDto;

public interface ProductService {
    List<Product> getAllProducts();
    Product getProductById(Long id);
    Product createProduct(ProductDto productDTO);
    Product updateProduct(Long id, ProductDto productDTO);
    void deleteProduct(Long id);
}
