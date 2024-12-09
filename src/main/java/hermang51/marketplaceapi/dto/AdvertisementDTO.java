package hermang51.marketplaceapi.dto;

import lombok.Getter;
import lombok.Setter;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

@Setter
@Getter
public class AdvertisementDTO {

    @NotBlank
    private String title;

    @NotBlank
    @Size(min = 10, message = "Description must be at least 10 characters")
    private String description;

    private LocalDate expirationDate;

    @NotBlank
    private String userEmail;


}
