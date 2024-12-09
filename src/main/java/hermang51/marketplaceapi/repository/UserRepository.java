package hermang51.marketplaceapi.repository;

import hermang51.marketplaceapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// Ensure this is an interface
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
