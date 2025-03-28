package com.swapnadeep.ridemate.services;

import com.swapnadeep.ridemate.entities.Driver;
import com.swapnadeep.ridemate.entities.Ride;
import com.swapnadeep.ridemate.entities.RideRequest;
import com.swapnadeep.ridemate.entities.Rider;
import com.swapnadeep.ridemate.entities.enums.RideStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface RideService {

    Ride getRideById(Long rideId);

    Ride createNewRide(RideRequest rideRequest, Driver driver);

    Ride updateRideStatus(Ride ride, RideStatus rideStatus);

    Page<Ride> getAllRidesOfRider(Rider rider, PageRequest pageRequest);

    Page<Ride> getAllRidesOfDriver(Driver driver, PageRequest pageRequest);
}
