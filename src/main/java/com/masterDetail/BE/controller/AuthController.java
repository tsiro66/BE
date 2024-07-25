package com.masterDetail.BE.controller;


import com.masterDetail.BE.service.TokenService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class AuthController {

    private static final Logger log = LoggerFactory.getLogger(AuthController.class);

    private  final TokenService tokenService;

    public AuthController(TokenService tokenService) {
        this.tokenService = tokenService;
    }

    @PostMapping("/token")
    public Map<String, String> token(Authentication authentication) {
        log.debug("Token requested for user: '{}'", authentication.getName());
        String token = tokenService.generateToken(authentication);
        log.debug("Token granted {}", token);
        return Collections.singletonMap("token", token);
    }

    @GetMapping("/validate-token")
    public ResponseEntity<Void> validateToken(Authentication authentication) {
        if (authentication != null && authentication.isAuthenticated()) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }

}
