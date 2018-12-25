package com.backend.tutorial.payment.domain.dao;

import com.backend.tutorial.payment.domain.model.TrgPaymentModel;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class PaymentDoaImpl implements PaymentDao {
    @PersistenceContext
    private EntityManager em;

    @Override
    public void savePayment(TrgPaymentModel payment) {
       em.persist(payment);
       em.flush();
    }

    @Override
    public List<TrgPaymentModel> savePayments(){
        Query q= em.createQuery("select lembu from Payment lembu");
        return q.getResultList();
    }

    @Override
    public List<TrgPaymentModel> findPayments(){
        Query q = em.createQuery("select  lembu  from Payment lembu " );
        return q.getResultList();}

}
