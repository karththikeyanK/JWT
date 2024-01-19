package com.express.user.dtoMaper;

import com.express.user.dto.UserRequest;
import com.express.user.dto.UserResponse;
import com.express.user.entity.Role;
import com.express.user.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;

@RequiredArgsConstructor
public class UserDtoMapper {

    public static User convertToUser(UserRequest userRequest, PasswordEncoder passwordEncoder) {
        return User.builder()
                .firstName(userRequest.getFirstName())
                .lastName(userRequest.getLastName())
                .email(userRequest.getEmail())
                .password(passwordEncoder.encode(userRequest.getPassword()))
                .contact(userRequest.getContact())
                .role(Role.valueOf(userRequest.getRole().toUpperCase()))
                .build();
    }


    public static UserResponse convertToUserResponse(User user) {
        return UserResponse.builder()
                .id(user.getId())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .contact(user.getContact())
                .email(user.getEmail())
                .role(user.getRole().name())
                .build();
    }
}
