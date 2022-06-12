package pl.javaapp.adamfedor.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.javaapp.adamfedor.model.ProductCategory;
import pl.javaapp.adamfedor.service.ProductCategoryService;

import java.util.List;

@RestController
@RequestMapping("/productCategories")
@AllArgsConstructor
public class ProductCategoryController {
    private final ProductCategoryService productCategoryService;

    @GetMapping
    public List<ProductCategory> getAllProductCategories(){
        return productCategoryService.getAllProductCategories();
    }

    @PostMapping
    public ProductCategory addProductCategory(ProductCategory productCategory){
        return productCategoryService.addProductCategory(productCategory);
    }

    @DeleteMapping("/{productCategoryId}")
    public void deleteProductCategory(@PathVariable Integer productCategoryId){
        productCategoryService.deleteProductCategory(productCategoryId);
    }
}
