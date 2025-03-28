package com.swapnadeep.ridemate.dto;

import com.swapnadeep.ridemate.entities.enums.Roles;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDto {
    private String name;
    private String email;
    private String password;

    private Set<Roles> roles;
}
