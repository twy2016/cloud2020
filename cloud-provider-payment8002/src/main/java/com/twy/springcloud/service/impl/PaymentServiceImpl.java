package com.twy.springcloud.service.impl;

import com.twy.springcloud.entity.Payment;
import com.twy.springcloud.mapper.PaymentMapper;
import com.twy.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author gongpeng
 * @date 2021/7/8 20:45
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentMapper paymentMapper;

    @Override
    public int create(Payment payment) {
        return paymentMapper.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentMapper.getPaymentById(id);
    }
}
