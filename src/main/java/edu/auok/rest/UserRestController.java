package edu.auok.rest;

import edu.auok.model.User;
import edu.auok.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 *
 * @author HaoTian
 */
@RestController
@RequestMapping("/api/v1")
public class UserRestController {
    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/users")
    public List<User> getAll(){
        return userService.findAll();
    }

    @PostMapping("/password")
    public void changePassword(@RequestParam String password){
        String pass=new BCryptPasswordEncoder().encode(password);
        System.out.println(pass);
    }

    @GetMapping("/info")
    public User info(@AuthenticationPrincipal UserDetails userDetails){
        String username =userDetails.getUsername();
        return userService.findByAccount(username);
    }
}
