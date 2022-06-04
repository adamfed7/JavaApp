package pl.javaapp.adamfedor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.javaapp.adamfedor.model.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findAll();
}
