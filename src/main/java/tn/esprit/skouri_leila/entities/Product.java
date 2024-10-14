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
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idProduct;
    String productName;
    @Enumerated(EnumType.STRING)
    Status status;
    @ManyToMany
    Set<Category> categories;
}
