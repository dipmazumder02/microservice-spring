package com.javatrail.userservice.service;

import com.javatrail.userservice.model.ResponseDto;
import com.javatrail.userservice.model.User;

public interface UserService {
    User saveUser(User user);

    ResponseDto getUser(Long userId);
}