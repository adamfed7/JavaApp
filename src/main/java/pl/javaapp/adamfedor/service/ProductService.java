package pl.javaapp.adamfedor.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.javaapp.adamfedor.model.Product;
import pl.javaapp.adamfedor.repository.ProductRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public Product addProduct(Product product){
        return productRepository.save(product);
    }

    public void deleteProduct(Integer productId) {
        productRepository.deleteById(productId);
    }

}
