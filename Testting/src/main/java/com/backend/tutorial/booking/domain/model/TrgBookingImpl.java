package com.backend.tutorial.booking.domain.model;

import javax.persistence.*;
import java.sql.Date;

@Entity( name = "Booking")
@Table(name = "TRG_BKNG")
public class TrgBookingImpl implements TrgBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "BKG_DATE")
    private String bookingDate;

    @Column(name = "BKG_TIME")
    private String bookingTime;

    @Column(name = "NO_OF_PPL")
    private int noOfPeople;

    @Column(name = "BKG_FROM")
    private Date bookingFrom;

    @Column(name = "BKG_TO")
    private Date bookingTo;

    @Column(name = "ROOM_NO")
    private String roomNo;

    public TrgBookingImpl() {

    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String getBookingDate() {
        return bookingDate;
    }

    @Override
    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    @Override
    public String getBookingTime() {
        return bookingTime;
    }

    @Override
    public void setBookingTime(String bookingTime) {
        this.bookingTime = bookingTime;
    }

    @Override
    public int getNoOfPeople() {
        return noOfPeople;
    }

    @Override
    public void setNoOfPeople(int noOfPeople) {
        this.noOfPeople = noOfPeople;
    }

    @Override
    public Date getBookingFrom() {
        return bookingFrom;
    }

    @Override
    public void setBookingFrom(Date bookingFrom) {
        this.bookingFrom = bookingFrom;
    }

    @Override
    public Date getBookingTo() {
        return bookingTo;
    }

    @Override
    public void setBookingTo(Date bookingTo) {
        this.bookingTo = bookingTo;
    }

    @Override
    public String getRoomNo() {
        return roomNo;
    }

    @Override
    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }
}
