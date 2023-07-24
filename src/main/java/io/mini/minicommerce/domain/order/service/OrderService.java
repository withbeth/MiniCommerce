package io.mini.minicommerce.domain.order.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderService orderService;

    @PostMapping("/{accountId}")
    public ResponseEntity<?> create() {
        return ResponseEntity.status(HttpStatus.CREATED).body(new Object());
    }

    @GetMapping(value = {"/{customerAccountId}/{lastOrderId}", "/{customerAccountId}"})
    public ResponseEntity<?> getOrders() {
        return ResponseEntity.status(HttpStatus.CREATED).body(new Object());

    }
}

