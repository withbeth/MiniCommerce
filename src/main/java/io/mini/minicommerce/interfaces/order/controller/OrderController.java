package io.mini.minicommerce.interfaces.order.controller;

import io.mini.minicommerce.domain.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;


    @PostMapping("/{accountId}")
    public ResponseEntity<?> create() {
        //TODO
        return ResponseEntity.status(HttpStatus.CREATED).body(new Object());
    }

    @GetMapping(value = {"/{customerAccountId}/{lastOrderId}", "/{customerAccountId}"})
    public ResponseEntity<?> getOrders() {
        //TODO
        return ResponseEntity.status(HttpStatus.OK).body(new Object());
    }
}
