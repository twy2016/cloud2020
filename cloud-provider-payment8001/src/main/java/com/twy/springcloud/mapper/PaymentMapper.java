package com.twy.springcloud.mapper;

import com.twy.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author gongpeng
 * @date 2021/7/8 20:36
 */
@Mapper
public interface PaymentMapper {

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
    Payment getPaymentById(@Param("id") Long id);
}
