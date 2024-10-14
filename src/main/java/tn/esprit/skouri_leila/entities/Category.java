package tn.esprit.skouri_leila.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idCategory;
    String categoryName;
    @ManyToMany(mappedBy = "categories",cascade = CascadeType.ALL)
    Set<Product> products;
}
