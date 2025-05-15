package Edstruments.example.ProductsAPI.repository;

import Edstruments.example.ProductsAPI.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Product, Long> {
}
