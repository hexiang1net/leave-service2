package com.linyuan.orderserver.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @ApiOperation(value = "订单", notes = "订单")
    @GetMapping("/order")
    public ResponseEntity payment(){
        return ResponseEntity.ok(null);
    }
}
