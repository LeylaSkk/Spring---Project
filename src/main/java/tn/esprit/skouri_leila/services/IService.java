package tn.esprit.skouri_leila.services;
import tn.esprit.skouri_leila.entities.Product;
import tn.esprit.skouri_leila.entities.User;
import tn.esprit.skouri_leila.entities.UserType;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
public interface IService {
    public User addUser(User u);
    public Product addProductAndCategory(Product p);
   // public void assignProductToUser(List<String> productName,String email);
    public List<User> getUserByCriteria(String categoryName, LocalDate date , UserType ut);
    //public void displayAndUpdateProduct();
}
