package com.lean.springcloud.service;

import com.lean.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Administrator on 2020/12/25.
 */
public interface PaymentService {
    int create (Payment payment);
    Payment getPaymentById(@Param("id") long id);
}
