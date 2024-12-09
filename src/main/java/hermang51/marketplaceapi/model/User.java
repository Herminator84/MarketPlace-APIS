package hermang51.marketplaceapi.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 3, message = "Username must be at least 3 characters")
    private String username;

    @NotNull
    private String email;
    @NotNull
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;


    public enum Role {
        BUYER, SELLER
    }
}
