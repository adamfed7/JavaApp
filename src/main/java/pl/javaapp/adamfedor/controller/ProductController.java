package pl.javaapp.adamfedor.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.javaapp.adamfedor.model.Product;
import pl.javaapp.adamfedor.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/products")
@AllArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @PostMapping
    public Product addProduct (Product product){
        return productService.addProduct(product);
    }

    @DeleteMapping("/{productId}")
    public void deleteProduct(@PathVariable Integer productId){
        productService.deleteProduct(productId);
    }

}
