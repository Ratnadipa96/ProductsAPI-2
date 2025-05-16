package Edstruments.example.ProductsAPI.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document(collection = "products")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter

public class Product {
    @Id
    private long id;

    private String name;
    private String description;

    
    
    private BigDecimal price;

    // Remove manual constructors and getter/setters
    // Lombok @Data provides getters/setters
    // @NoArgsConstructor and @AllArgsConstructor provide constructors
}
