package com.lean.springcloud.service.impl;

/**
 * Created by Administrator on 2020/12/25.
 */

import com.lean.springcloud.dao.PaymentDao;
import com.lean.springcloud.entities.Payment;
import com.lean.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentserviceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(long id){
        return paymentDao.getPaymentById(id);
    }
}
