package com.swapnadeep.ridemate.services;

import com.swapnadeep.ridemate.dto.DriverDto;
import com.swapnadeep.ridemate.dto.RideDto;
import com.swapnadeep.ridemate.dto.RiderDto;
import com.swapnadeep.ridemate.entities.Driver;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface DriverService {
    RideDto acceptRide(long rideRequestId);

    RideDto cancelRide(long rideId);

    RideDto startRide(long rideId, String otp);

    RideDto endRide(long rideId);

    RiderDto rateRide(long rideId, double rating);

    DriverDto getMyProfile();

    Page<RiderDto> getAllMyRides(PageRequest pageRequest);

    Driver getCurrentDriver(long rideId);

    Driver updateDriverAvailability(Driver driver, boolean available);

    Driver createNewDriver(Driver driver);
}
