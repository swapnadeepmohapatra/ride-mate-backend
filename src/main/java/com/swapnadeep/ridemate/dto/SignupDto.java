package com.swapnadeep.ridemate.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SignupDto {
    private String name;
    private String email;
    private String password;
}
