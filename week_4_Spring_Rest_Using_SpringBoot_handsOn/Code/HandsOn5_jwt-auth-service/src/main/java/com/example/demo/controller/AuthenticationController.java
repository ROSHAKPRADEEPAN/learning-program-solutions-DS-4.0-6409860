package com.example.demo.controller;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.crypto.SecretKey;
import javax.servlet.http.HttpServletRequest;
import java.util.Base64;
import java.util.Date;

@RestController
public class AuthenticationController {

    private final String secretKeyString = "mysecretkeymysecretkeymysecretkey!";

    @RequestMapping(value = "/authenticate", method = RequestMethod.GET)
    public ResponseEntity<?> authenticate(HttpServletRequest request) {
        String authHeader = request.getHeader("Authorization");
        if (authHeader != null && authHeader.startsWith("Basic ")) {
            String base64Credentials = authHeader.substring("Basic ".length());
            byte[] credDecoded = Base64.getDecoder().decode(base64Credentials);
            String credentials = new String(credDecoded);
            final String[] values = credentials.split(":", 2);

            String username = values[0];
            String password = values[1];

            if ("user".equals(username) && "pwd".equals(password)) {
                SecretKey secretKey = Keys.hmacShaKeyFor(secretKeyString.getBytes());
                String token = Jwts.builder()
                        .claim("sub", username)
                        .issuedAt(new Date())
                        .expiration(new Date(System.currentTimeMillis() + 10 * 60 * 1000))
                        .signWith(secretKey)
                        .compact();

                return ResponseEntity.ok().body("{\"token\":\"" + token + "\"}");
            } else {
                return ResponseEntity.status(401).body("Invalid credentials");
            }
        } else {
            return ResponseEntity.badRequest().body("Missing Authorization header");
        }
    }
}
