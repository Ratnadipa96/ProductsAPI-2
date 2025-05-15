package Edstruments.example.ProductsAPI.service;
import Edstruments.example.ProductsAPI.dto.ProductDto;
import Edstruments.example.ProductsAPI.model.Product;

import java.util.List;

import Edstruments.example.ProductsAPI.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static Edstruments.example.ProductsAPI.model.Product.*;


@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found with ID " + id));



    }

    @Override
    public Product createProduct(ProductDto dto) {
        Product product = new Product(
                System.currentTimeMillis(), // id
                dto.getName(),
                dto.getDescription(),
                dto.getPrice()
        );
        return productRepository.save(product);

    }

    @Override
    public Product updateProduct(Long id, ProductDto dto) {
        Product product = getProductById(id);
        product.setName(dto.getName());
        product.setDescription(dto.getDescription());
        product.setPrice(dto.getPrice());
        return productRepository.save(product);
    }


    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }


}
