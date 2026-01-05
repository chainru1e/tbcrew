package edu.practice.tbcrew.domain.user.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class LoginResponse {
    private Long id;  // 순서도 바뀌면 안되는구나! userService에서 리턴할때 예측치와 다르게 매핑(?)될 수 있다.
    private String username;
}
