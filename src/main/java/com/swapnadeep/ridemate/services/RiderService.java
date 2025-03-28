package com.swapnadeep.ridemate.services;

import com.swapnadeep.ridemate.dto.DriverDto;
import com.swapnadeep.ridemate.dto.RideDto;
import com.swapnadeep.ridemate.dto.RideRequestDto;
import com.swapnadeep.ridemate.dto.RiderDto;
import com.swapnadeep.ridemate.entities.Rider;
import com.swapnadeep.ridemate.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface RiderService {

    RideRequestDto requestRide(RideRequestDto rideRequestDto);

    RideDto cancelRide(Long rideId);

    DriverDto rateDriver(Long rideId, Integer rating);

    RiderDto getMyProfile();

    Page<RideDto> getAllMyRides(PageRequest pageRequest);

    Rider createNewRider(User user);

    Rider getCurrentRider();
}
