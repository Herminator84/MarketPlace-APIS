package hermang51.marketplaceapi.repository;

import hermang51.marketplaceapi.model.Advertisement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface AdvertisementRepository extends JpaRepository<Advertisement, Long> {


    List<Advertisement> findByExpirationDateAfter(LocalDate date);
}
