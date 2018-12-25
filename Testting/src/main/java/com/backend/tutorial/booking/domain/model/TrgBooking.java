package com.backend.tutorial.booking.domain.model;


import java.sql.Date;

public interface TrgBooking {
    long getId();

    void setId(long id);

    String getBookingDate();

    void setBookingDate(String bookingDate);

    String getBookingTime();

    void setBookingTime(String bookingTime);

    int getNoOfPeople();

    void setNoOfPeople(int noOfPeople);

    Date getBookingFrom();

    abstract void setBookingFrom(Date bookingFrom);

    abstract Date getBookingTo();

    void setBookingTo(Date bookingTo);

    String getRoomNo();

    void setRoomNo(String roomNo);
}
