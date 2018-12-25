package com.backend.tutorial;

import com.backend.tutorial.booking.domain.dao.BookingDao;
import com.backend.tutorial.booking.domain.model.TrgBooking;
import com.backend.tutorial.booking.domain.model.TrgBookingImpl;
import com.backend.tutorial.maintainance.domain.dao.InterfaceDaoMaintainance;
import com.backend.tutorial.maintainance.domain.model.InterfaceMaintainanceModel;
import com.backend.tutorial.maintainance.domain.model.TrgMaintainanceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Date;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TutorialApplicationTests {

    @Autowired
    private InterfaceDaoMaintainance daoMaintainance;


    @Test
    public void saveBooking() {
        InterfaceMaintainanceModel maintainance =new TrgMaintainanceImpl();
//        TrgBooking booking = new TrgBookingImpl();
        maintainance.setCleanerName("Wan Maimunnah");
        maintainance.setCleanerPayment(2.50);
        maintainance.setRoom("Bilik Rais");
        maintainance.setRoomStatus("Sudah Dikemas");
//        maintainance.setCleanSchedule(Date.valueOf("26/12/2018"));

//        booking.setBookingDate("16-01-2018");
////        booking.setBookingFrom( new Date());
////        booking.setBookingTo(new Date ());
//        booking.setBookingTime("16-01-2018");
//        booking.setNoOfPeople(2);
//        booking.setRoomNo("Bilik Seminar");
//        bookingDao.saveBooking(booking);
    }
}