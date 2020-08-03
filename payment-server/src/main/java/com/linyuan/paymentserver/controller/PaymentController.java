package com.linyuan.paymentserver.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @ApiOperation(value = "支付", notes = "支付")
    @GetMapping("/payment")
    public ResponseEntity payment(){
        return ResponseEntity.ok(null);
    }
}
