package com.backend.tutorial.payment.domain.model;


import javax.persistence.*;

@Entity(name = "Payment")
@Table(name = "TRG_PMNT")
public class TrgPaymentImpl implements TrgPaymentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "status")
    private String status;
    @Column(name = "date")
    private String date;
    @Column(name = "amount")
    private double amount;

    public TrgPaymentImpl() {
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String getDate() {
        return date;
    }

    @Override
    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public long getId() {

        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }
}
