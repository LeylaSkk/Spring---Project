package tn.esprit.skouri_leila.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idUser;
    String emailUser;
    LocalDate dateInscriUser;
    @Enumerated(EnumType.STRING)
    UserType userType;
    @OneToMany(cascade = CascadeType.ALL)
    Set<Product> products;
}
