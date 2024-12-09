package hermang51.marketplaceapi.controller;

import hermang51.marketplaceapi.model.Advertisement;
import hermang51.marketplaceapi.service.AdvertisementService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.*;

class AdvertisementControllerTest {
/*
    @Mock
    private AdvertisementService advertisementService;

    @InjectMocks
    private AdvertismentController advertisementController;

    private Advertisement advertisement;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);

        // Sample advertisement setup
        advertisement = new Advertisement();
        advertisement.setId(1L);
        advertisement.setTitle("Test Ad");
        advertisement.setDescription("Test Description");
        advertisement.setExpirationDate("2024-12-31");
    }

    @Test
    void testCreateAdvertisement() {
        // Mock the service response when creating an advertisement
        when(advertisementService.createAdvertisement(any(Advertisement.class), any())).thenReturn(advertisement);

        // Call the controller method
        ResponseEntity<Advertisement> response = advertisementController.createAdvertisement(advertisement, null);

        // Assert the response status and body
        assertEquals(HttpStatus.CREATED, response.getStatusCode());
        assertNotNull(response.getBody());
        assertEquals("Test Ad", response.getBody().getTitle());

        // Verify service interaction
        verify(advertisementService, times(1)).createAdvertisement(any(Advertisement.class), any());
    }

    @Test
    void testGetAdvertisementByIdFound() {
        // Mock a found advertisement
        when(advertisementService.findAdvertisementById(anyLong())).thenReturn(Optional.of(advertisement));


        ResponseEntity<Advertisement> response = advertisementController.getAdvertisementById(1L);


        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertNotNull(response.getBody());
        assertEquals("Test Ad", response.getBody().getTitle());


        verify(advertisementService, times(1)).findAdvertisementById(1L);
    }

    @Test
    void testGetAdvertisementByIdNotFound() {
        // Mock the service to return empty when no advertisement is found
        when(advertisementService.findAdvertisementById(anyLong())).thenReturn(Optional.empty());


        ResponseEntity<Advertisement> response = advertisementController.getAdvertisementById(1L);


        assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());
        assertNull(response.getBody());


        verify(advertisementService, times(1)).findAdvertisementById(1L);
    }

    @Test
    void testUpdateAdvertisement() {

        when(advertisementService.updateAdvertisement(anyLong(), any(Advertisement.class))).thenReturn(advertisement);


        ResponseEntity<Advertisement> response = advertisementController.updateAdvertisement(1L, advertisement);


        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertNotNull(response.getBody());
        assertEquals("Test Ad", response.getBody().getTitle());

        // Verify service interaction
        verify(advertisementService, times(1)).updateAdvertisement(anyLong(), any(Advertisement.class));
    }

    @Test
    void testDeleteAdvertisement() {

        doNothing().when(advertisementService).deleteAdvertisement(anyLong());


        ResponseEntity<Void> response = advertisementController.deleteAdvertisement(1L);


        assertEquals(HttpStatus.NO_CONTENT, response.getStatusCode());


        verify(advertisementService, times(1)).deleteAdvertisement(1L);
    }

 */
}
