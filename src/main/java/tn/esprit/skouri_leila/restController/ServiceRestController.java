package tn.esprit.skouri_leila.restController;

import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.skouri_leila.entities.Product;
import tn.esprit.skouri_leila.entities.User;
import tn.esprit.skouri_leila.entities.UserType;
import tn.esprit.skouri_leila.services.IService;

import java.time.LocalDate;
import java.util.List;

@RestController
@AllArgsConstructor
public class ServiceRestController {
    @Autowired
    IService iService;
    @PostMapping("/add-User")
    public User addUser(@RequestBody User u){
        return iService.addUser(u);
    }
    @PostMapping("/add-product-and-category")
    public Product addProductAndCategory(@RequestBody Product p){
        return iService.addProductAndCategory(p);
    }
    @GetMapping("/get-user/{t}/{d}/{p}")
    public List<User> getUserByCriteria(@PathVariable("t") String categoryName, @PathVariable("d") LocalDate date ,@PathVariable("p") UserType ut){
        return iService.getUserByCriteria(categoryName,date,ut);
    }
}
