package hermang51.marketplaceapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import hermang51.marketplaceapi.service.UserService;

@RestController
@RequestMapping("/api/auth")

public class UserAuthController {

@Autowired
private UserService userService;

@PostMapping("/login")
public ResponseEntity<String> loginUser(@RequestParam String username, @RequestParam String password) {
    boolean isAuthenticated = userService.authenticate(username, password);
    if (isAuthenticated) {
        return new ResponseEntity<>("Invalid email or password", HttpStatus.UNAUTHORIZED);
    }
    return new ResponseEntity<>("User authenticated successfully", HttpStatus.OK);
}


}
