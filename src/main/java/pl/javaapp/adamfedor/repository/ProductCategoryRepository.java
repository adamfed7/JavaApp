package pl.javaapp.adamfedor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.javaapp.adamfedor.model.ProductCategory;

import java.util.List;

@Repository
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {
    List<ProductCategory> findAll();
    ProductCategory save(ProductCategory productCategory);
}
