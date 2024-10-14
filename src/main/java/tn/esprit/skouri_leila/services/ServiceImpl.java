package tn.esprit.skouri_leila.services;
import lombok.AllArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.skouri_leila.entities.Category;
import tn.esprit.skouri_leila.entities.Product;
import tn.esprit.skouri_leila.entities.User;
import tn.esprit.skouri_leila.entities.UserType;
import tn.esprit.skouri_leila.repositories.CategoryRepo;
import tn.esprit.skouri_leila.repositories.ProductRepo;
import tn.esprit.skouri_leila.repositories.UserRepo;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
@Slf4j
@ToString
//@Scheduled(cron = "*/30 * * * * *")
public class ServiceImpl implements IService{
    @Autowired
    CategoryRepo categoryRepo;
    ProductRepo productRepo;
    UserRepo userRepo;
    @Override
    public User addUser(User u) {
        return userRepo.save(u);
    }

    @Override
    public Product addProductAndCategory(Product p) {
        return productRepo.save(p);
    }

    /*@Override
    public void assignProductToUser(List<String> productName, String email) {
        User user = userRepo.findByEmailUser(email);
        Product product = productRepo.findByProductName(productName);
    }*/

    @Override
    public List<User> getUserByCriteria(String categoryName, LocalDate date, UserType ut) {
       return userRepo.listerUtilisateurs(categoryName,date,ut);

    }
  /*  @Scheduled(fixedRate = 40000)
   @Override
    public void displayAndUpdateProduct() {
        List< Product> products= productRepo.;
        for(P transaction: transactions)
            Log. info("transaction avant aujordhui : "+transaction.toString()) ;

    }*/

        //log.info("Out of Method : retrieveAllProjets ");





    }

   /* @Override
    public void assignProductToUser(List<String> productName, String email) {
        User user = userRepo.findByEmailUser(email);
        Product product = productRepo.findByProductName(List<String> productName);
        user.
    }*/

    //@Scheduled(cron = "*/30 * * * * *")
    //@Scheduled(fixedRate = 30000)

