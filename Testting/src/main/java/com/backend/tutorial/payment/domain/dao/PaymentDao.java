package com.backend.tutorial.payment.domain.dao;

import com.backend.tutorial.payment.domain.model.TrgPaymentModel;

import java.util.List;

public interface PaymentDao {
    void savePayment(TrgPaymentModel payment);

    List<TrgPaymentModel> savePayments();

    List<TrgPaymentModel> findPayments();
}
