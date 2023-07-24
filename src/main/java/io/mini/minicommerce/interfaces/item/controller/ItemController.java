package io.mini.minicommerce.interfaces.item.controller;

import io.mini.minicommerce.domain.item.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RequiredArgsConstructor
@RestController
public class ItemController {

    private final ItemService itemService;

    @GetMapping("/item")
    public ResponseEntity<?> findItemByItemId(@RequestBody  request) {
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @GetMapping("/items/")
    public ResponseEntity<?> findItemByShopLocation(@RequestBody  request) {
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @PostMapping("/items/create")
    public ResponseEntity<?> create(@RequestBody request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
