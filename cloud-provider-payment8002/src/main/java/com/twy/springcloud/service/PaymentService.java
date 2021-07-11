package com.twy.springcloud.service;

import com.twy.springcloud.entity.Payment;

/**
 * @author gongpeng
 * @date 2021/7/8 20:45
 */
public interface PaymentService {

    /**
     * 创建订单
     *
     * @param payment
     * @return
     */
    int create(Payment payment);

    /**
     * 根据id获取订单
     *
     * @param id
     * @return
     */
    Payment getPaymentById(Long id);
}
