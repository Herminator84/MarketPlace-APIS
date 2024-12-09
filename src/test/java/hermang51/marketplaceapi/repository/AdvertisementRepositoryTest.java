package hermang51.marketplaceapi.repository;

import hermang51.marketplaceapi.model.Advertisement;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.LocalDate;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class AdvertisementRepositoryTest {

    @Autowired
    private AdvertisementRepository advertisementRepository;

    @Test
    void testSaveAdvertisementSuccessfully() {
        // Create a new advertisement
        Advertisement advertisement = new Advertisement();
        advertisement.setTitle("Test Ad");
        advertisement.setDescription("Test Description");
        advertisement.setExpirationDate(LocalDate.parse("2024-12-31"));


        Advertisement savedAd = advertisementRepository.save(advertisement);


        assertNotNull(savedAd.getId(), "The saved advertisement should have an ID.");
        assertEquals("Test Ad", savedAd.getTitle(), "Title should match the saved title.");
    }

    @Test
    void testFindByIdSuccessfully() {

        Advertisement advertisement = new Advertisement();
        advertisement.setTitle("Test Ad");
        advertisement.setDescription("Test Description");
        advertisement.setExpirationDate(LocalDate.parse("2024-12-31"));
        advertisement = advertisementRepository.save(advertisement);


        Optional<Advertisement> foundAd = advertisementRepository.findById(advertisement.getId());


        assertTrue(foundAd.isPresent(), "Advertisement should be found by ID.");
        assertEquals("Test Ad", foundAd.get().getTitle(), "Title should match the saved title.");
    }

    @Test
    void testFindByIdNotFound() {

        Optional<Advertisement> foundAd = advertisementRepository.findById(-1L);


        assertFalse(foundAd.isPresent(), "No advertisement should be found for a non-existing ID.");
    }
}


