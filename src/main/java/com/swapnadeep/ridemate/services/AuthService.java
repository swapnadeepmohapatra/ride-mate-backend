package com.swapnadeep.ridemate.services;

import com.swapnadeep.ridemate.dto.DriverDto;
import com.swapnadeep.ridemate.dto.SignupDto;
import com.swapnadeep.ridemate.dto.UserDto;

public interface AuthService {
    String[] login(String email, String password);

    UserDto signup(SignupDto signupDto);

    String refreshToken(String refreshToken);

    DriverDto onboardNewDriver(Long userId, String vehicleId);

}
