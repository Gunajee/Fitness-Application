package com.fitness.userservice.service;

import com.fitness.userservice.dto.RegisterRequest;
import com.fitness.userservice.dto.UserResponse;
import jakarta.validation.Valid;


public interface UserService {
    public UserResponse register(@Valid RegisterRequest registerRequest);

    UserResponse getUserProfile(String userId);

    Boolean existsByUserId(String userId);
}
