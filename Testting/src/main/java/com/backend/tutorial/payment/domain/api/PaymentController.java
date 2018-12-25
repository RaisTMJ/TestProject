package com.backend.tutorial.payment.domain.api;

import com.backend.tutorial.payment.domain.dao.PaymentDao;
import com.backend.tutorial.payment.domain.model.TrgPaymentImpl;
import com.backend.tutorial.payment.domain.model.TrgPaymentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/payment")
public class PaymentController {

    private PaymentDao paymentDao;

    @Autowired
    public PaymentController(PaymentDao paymentDao) {
        this.paymentDao = paymentDao;
    }

    @PostMapping(path= "/new")
    public ResponseEntity <String> makePayment(@RequestBody PaymentVo vo){
        TrgPaymentModel payment = new TrgPaymentImpl();
        payment.setAmount(vo.getAmount());
        payment.setDate(vo.getDate());
        payment.setStatus(vo.getStatus());
        paymentDao.savePayment(payment);
        return new ResponseEntity<>("PaymentAdded", HttpStatus.OK);
    }

    @GetMapping(path= "/findPayments")
    public ResponseEntity<List<TrgPaymentModel>> findPayments(){
        List<TrgPaymentModel> payment = paymentDao.findPayments();
        return new ResponseEntity<List<TrgPaymentModel>>(payment,HttpStatus.OK);
    }

}
