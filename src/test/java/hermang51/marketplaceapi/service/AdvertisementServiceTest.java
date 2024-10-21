package hermang51.marketplaceapi;

import model.Advertisement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import repository.AdvertisementRepository;
import service.AdvertisementService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class AdvertisementServiceTest {

    @Mock
    private AdvertisementRepository advertisementRepository;

    @InjectMocks
    private AdvertisementService advertisementService;

    private Advertisement ad;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);  // Initialize mocks
        ad = new Advertisement();
        ad.setTitle("Test Ad");
        ad.setDescription("Test Description");
    }

    @Test
    void testCreateAdvertisement() {
        // Mock the repository save method
        when(advertisementRepository.save(ad)).thenReturn(ad);

        // Call the service method to create the advertisement
        Advertisement createdAd = advertisementService.createAdvertisement(ad, null);

        // Verify the advertisement was created with the correct title
        assertEquals("Test Ad", createdAd.getTitle());
        assertEquals("Test Description", createdAd.getDescription());
    }
}
