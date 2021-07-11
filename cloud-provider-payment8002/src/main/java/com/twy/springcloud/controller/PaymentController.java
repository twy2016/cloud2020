package com.twy.springcloud.controller;

import com.twy.springcloud.entity.CommonResult;
import com.twy.springcloud.entity.Payment;
import com.twy.springcloud.service.PaymentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author gongpeng
 * @date 2021/7/8 20:53
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/create")
    private CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        return result > 0 ? CommonResult.ok("新增成功,serverPort:" + serverPort) : CommonResult.fail("新增失败,serverPort:" + serverPort);
    }

    @GetMapping("/{id}")
    private CommonResult getById(@PathVariable Long id) {
        Payment payment = paymentService.getPaymentById(id);
        return payment != null ? CommonResult.ok("查询成功,serverPort:" + serverPort, payment) : CommonResult.fail("查询失败,serverPort:" + serverPort);
    }

}
