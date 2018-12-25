package com.backend.tutorial.booking.domain.dao;

import com.backend.tutorial.booking.domain.model.TrgBooking;

import java.util.List;

public interface BookingDao {

    void saveBooking(TrgBooking booking);

    List<TrgBooking> findBookings();
}
