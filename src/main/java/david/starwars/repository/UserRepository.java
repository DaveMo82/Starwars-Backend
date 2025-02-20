package david.starwars.repository;

import david.starwars.models.User;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    SecurityProperties.User findByName(String name);
}