package Edstruments.example.ProductsAPI.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class ProductDto {

    // Name must not be null or blank
    @NotBlank(message = "Product name must not be blank")
    private String name;

    private String description;

    

    // Price must be a positive value
    @NotNull(message = "Price must not be null")
    @Positive(message = "Price must be greater than 0")
    private BigDecimal price;
}
