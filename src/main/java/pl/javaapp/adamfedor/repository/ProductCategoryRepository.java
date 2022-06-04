package pl.javaapp.adamfedor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.javaapp.adamfedor.model.ProductCategory;

import java.util.List;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {
    List<ProductCategory> findAll();
}
