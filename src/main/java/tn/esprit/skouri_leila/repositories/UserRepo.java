package tn.esprit.skouri_leila.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.skouri_leila.entities.User;
import tn.esprit.skouri_leila.entities.UserType;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {
 User findByEmailUser(String email);
    @Query("SELECT distinct (u) FROM User u " +
            "INNER JOIN u.products p " +
            "INNER JOIN p.categories c " +
            "WHERE u.userType=:p " +
            "AND u.dateInscriUser >= :d " +
            "AND c.categoryName =:t")
    List<User> listerUtilisateurs( @Param("t")String CategoryName,@Param("d")  LocalDate Date , @Param("p") UserType ut);

}
