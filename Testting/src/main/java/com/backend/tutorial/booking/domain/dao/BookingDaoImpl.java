package com.backend.tutorial.booking.domain.dao;

import com.backend.tutorial.booking.domain.model.TrgBooking;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class BookingDaoImpl implements BookingDao {

    @PersistenceContext
    private EntityManager em;


    @Override
    public void saveBooking(TrgBooking booking) {
        em.persist(booking);
        em.flush();
    }

    @Override
    public List<TrgBooking> findBookings(){
        Query q = em.createQuery("select  kambing  from Booking kambing " );
        return q.getResultList();

    }
//    public TrgBooking read
}
