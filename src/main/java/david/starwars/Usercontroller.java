package david.starwars;

import david.starwars.models.User;
import david.starwars.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class Usercontroller {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User user) {
        System.out.println("Received user: " + user.getName());
        User savedUser = userRepository.save(user);
        return ResponseEntity.ok(savedUser);
    }
}
