package com.swapnadeep.ridemate.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DriverDto {
    private UserDto user;
    private Double rating;
}
