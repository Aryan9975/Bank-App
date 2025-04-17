package org.example.Controller;

import org.example.Model.User;
import org.example.Repository.UserRepository;
import org.example.Security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private UserRepository userRepo;

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        User user = userRepo.findByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            return jwtUtil.generateToken(username, user.getRole());
        } else {
            throw new RuntimeException("Invalid credentials");
        }
    }
}
