package hermang51.marketplaceapi.service;

import hermang51.marketplaceapi.model.Advertisement;
import hermang51.marketplaceapi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import hermang51.marketplaceapi.repository.AdvertisementRepository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service
public class AdvertisementService {

    @Autowired
    private AdvertisementRepository adRepository;


    public Advertisement createAdvertisement(Advertisement ad, User user) {
        ad.setUser(user);
        return adRepository.save(ad);
    }


    public List<Advertisement> getActiveAdvertisements() {

        return adRepository.findByExpirationDateAfter(LocalDate.now().plusDays(5));
    }
}
