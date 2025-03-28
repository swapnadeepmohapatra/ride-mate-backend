package com.swapnadeep.ridemate.dto;

import com.swapnadeep.ridemate.entities.enums.PaymentMethod;
import com.swapnadeep.ridemate.entities.enums.RideRequestStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RideRequestDto {
    private Long id;

    private PointDto pickupLocation;
    private PointDto dropOffLocation;
    private PaymentMethod paymentMethod;

    private LocalDateTime requestedTime;

    private RiderDto rider;
    private Double fare;

    private RideRequestStatus rideRequestStatus;
}
