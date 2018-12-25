package com.backend.tutorial.payment.domain.model;

import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Repository;

import javax.persistence.*;


public interface TrgPaymentModel {


    String getStatus();

    void setStatus(String status);

    String getDate();

    void setDate(String date);

    double getAmount();

    void setAmount(double amount);

    long getId();

    void setId(long id);
}
