package com.lean.springcloud.dao;

import com.lean.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Administrator on 2020/12/25.
 */
@Mapper
public interface PaymentDao {
    int create (Payment payment);
    Payment getPaymentById(@Param("id") Long id);
}
