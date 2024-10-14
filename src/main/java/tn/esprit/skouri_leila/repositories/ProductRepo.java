package tn.esprit.skouri_leila.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.skouri_leila.entities.Product;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product,Long> {
    List<String> findByProductName(String productName);

}
