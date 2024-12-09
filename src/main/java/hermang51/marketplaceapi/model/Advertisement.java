package hermang51.marketplaceapi.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;
@Setter
@Getter

@Entity
public class Advertisement {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@NotNull
private String title;

@NotNull
private String description;

@NotNull
private Double price;

@NotNull
private LocalDate expirationDate;

@ManyToOne
@JoinColumn(name = "user_id")
private User user;



}
