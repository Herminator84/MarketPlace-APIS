package hermang51.marketplaceapi.service;

import hermang51.marketplaceapi.model.Advertisement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import hermang51.marketplaceapi.repository.AdvertisementRepository;

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

        when(advertisementRepository.save(ad)).thenReturn(ad);


        Advertisement createdAd = advertisementService.createAdvertisement(ad, null);


        assertEquals("Test Ad", createdAd.getTitle());
        assertEquals("Test Description", createdAd.getDescription());
    }
}
