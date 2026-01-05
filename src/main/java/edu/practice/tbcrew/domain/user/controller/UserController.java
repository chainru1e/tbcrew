package edu.practice.tbcrew.domain.user.controller;

import edu.practice.tbcrew.domain.user.dto.LoginRequest;
import edu.practice.tbcrew.domain.user.dto.LoginResponse;
import edu.practice.tbcrew.domain.user.dto.SignupRequest;
import edu.practice.tbcrew.domain.user.entity.Users;
import edu.practice.tbcrew.domain.user.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.coyote.Request;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/signup")
    public void signup(@RequestBody SignupRequest request){
        userService.signup(request);
    }

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest request){
        return userService.login(request);
    }

    @GetMapping("/test")
    public String test(){
        return  "OK";
    }
}
