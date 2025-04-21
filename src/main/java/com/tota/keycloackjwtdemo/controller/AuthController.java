package com.tota.keycloackjwtdemo.controller;

import com.tota.keycloackjwtdemo.dto.AuthenticationResponseDto;
import com.tota.keycloackjwtdemo.dto.LoginRequestDto;
import com.tota.keycloackjwtdemo.dto.UserRegistrationDto;
import com.tota.keycloackjwtdemo.entity.User;
import com.tota.keycloackjwtdemo.service.AuthService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@Valid @RequestBody UserRegistrationDto userRegistrationDto) {
        User user = authService.registerUser(userRegistrationDto);
        return ResponseEntity.ok("User registred successfully");
    }

    @PostMapping("/login")
    public ResponseEntity<AuthenticationResponseDto> authenticateUser(@Valid @RequestBody LoginRequestDto loginRequestDto) {
        AuthenticationResponseDto response = authService.authenticateUser(loginRequestDto);
        return ResponseEntity.ok(response);
    }
}
