package com.backend.tutorial.booking.domain.api;

import com.backend.tutorial.booking.domain.dao.BookingDao;
import com.backend.tutorial.booking.domain.model.TrgBooking;
import com.backend.tutorial.booking.domain.model.TrgBookingImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/booking")
public class BookingController {

    private final BookingDao bookingDao;

    @Autowired
    public BookingController(BookingDao bookingDao) {
        this.bookingDao = bookingDao;
    }

    @PostMapping(path = "/new")
    public ResponseEntity<String> makeBooking(@RequestBody BookingVo vo) {
        TrgBooking booking = new TrgBookingImpl();

        booking.setRoomNo(vo.getRoomNo());
        booking.setNoOfPeople(vo.getNoOfPeople());
        booking.setBookingFrom(vo.getBookingFrom());
        booking.setBookingDate(vo.getBookingDate());
        booking.setBookingTime(vo.getBookingTime());
        booking.setBookingTo(vo.getBookingTo());

        bookingDao.saveBooking(booking);
        return new ResponseEntity<>("BookingAdded", HttpStatus.OK);
    }

    @GetMapping(path = "/findBookings")
    public ResponseEntity<List<TrgBooking>> findBookings() {
        List<TrgBooking> bookings = bookingDao.findBookings();
        return new ResponseEntity<List<TrgBooking>>(bookings, HttpStatus.OK);
    }

    @GetMapping(path = "/hellio")
    public ResponseEntity<String> helloRests() {
        return new ResponseEntity<>("yohohoo", HttpStatus.OK);
    }


}
