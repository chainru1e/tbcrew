package edu.practice.tbcrew.domain.user.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SignupRequest {
    private String username;
    private String pw;
    // Lombok 이 자동으로 다음과 같은 메서드 만들어줌: getUsername(), getPw()
}
