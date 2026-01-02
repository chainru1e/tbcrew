package edu.practice.tbcrew.domain.user.service;

import edu.practice.tbcrew.domain.user.dto.LoginRequest;
import edu.practice.tbcrew.domain.user.dto.LoginResponse;
import edu.practice.tbcrew.domain.user.dto.SignupRequest;
import edu.practice.tbcrew.domain.user.entity.Users;
import edu.practice.tbcrew.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void signup(SignupRequest request) {
        Users user = new Users(
                request.getUsername(),
                request.getPw()
        );
        userRepository.save(user);
    }

    public LoginResponse login(LoginRequest request){
        Users user = userRepository.findByUsername(request.getUsername()).orElseThrow();

        if(!user.getPw().equals(request.getPw())){
            throw new RuntimeException("비밀번호 틀림");
        }

        return new LoginResponse(user.getId(),user.getUsername());
    }
}
