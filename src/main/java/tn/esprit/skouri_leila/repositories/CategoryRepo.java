package tn.esprit.skouri_leila.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.skouri_leila.entities.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category,Long> {
    Category findByCategoryName(String name);
}
