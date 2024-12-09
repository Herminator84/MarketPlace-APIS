package hermang51.marketplaceapi.controller;

import jakarta.validation.Valid;
import hermang51.marketplaceapi.model.Advertisement;
import hermang51.marketplaceapi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import hermang51.marketplaceapi.service.AdvertisementService;
import hermang51.marketplaceapi.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/ads")
public class AdvertismentController {

    @Autowired
    private AdvertisementService advertisementService;

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public ResponseEntity<String> createAdvertisement(@Valid @RequestBody Advertisement ad) {
        User user = userService.findByEmail(ad.getUser().getEmail())
                .orElse(userService.registerNewUser(ad.getUser().getEmail(), ad.getUser().getUsername(), ad.getUser().getPassword()));

        advertisementService.createAdvertisement(ad, user);
        return new ResponseEntity<>("Ad successfully created.", HttpStatus.CREATED);
    }

    @GetMapping("/view")
    public ResponseEntity<List<Advertisement>> viewAdvertisements() {
        List<Advertisement> ads = advertisementService.getActiveAdvertisements();
        return new ResponseEntity<>(ads, HttpStatus.OK);
    }
}
