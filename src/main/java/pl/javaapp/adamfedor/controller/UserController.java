package pl.javaapp.adamfedor.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.javaapp.adamfedor.model.User;
import pl.javaapp.adamfedor.repository.ProductCategoryRepository;
import pl.javaapp.adamfedor.repository.ProductRepository;
import pl.javaapp.adamfedor.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {
    private final UserService userService;
    private final ProductRepository productRepository;
    private final ProductCategoryRepository productCategoryRepository;

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public User addUser(User user) {
        return userService.addUser(user);
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable Integer userId) {
        userService.deleteUser(userId);
    }
}
