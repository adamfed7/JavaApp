package pl.javaapp.adamfedor.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.javaapp.adamfedor.model.ProductCategory;
import pl.javaapp.adamfedor.repository.ProductCategoryRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductCategoryService {
    private final ProductCategoryRepository productCategoryRepository;

    public List<ProductCategory> getAllProductCategories(){
        return productCategoryRepository.findAll();
    }

    public ProductCategory addProductCategory(ProductCategory productCategory){
        return productCategoryRepository.save(productCategory);
    }

    public void deleteProductCategory(Integer productCategoryId){
        productCategoryRepository.deleteById(productCategoryId);
    }
}
