package io.mini.minicommerce.domain.order.service;

import io.mini.minicommerce.domain.item.service.ItemService;
import io.mini.minicommerce.interfaces.item.dto.ItemStockUpdateResponse;
import io.mini.minicommerce.interfaces.item.dto.OrderItemResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

@Service @Slf4j
@RequiredArgsConstructor
public class OrderItemService {

    private final ItemService itemService;

    public ItemStockUpdateResponse updateItemsStock(ItemStockUpdateRequest request) {
        //TODO

    }

    public void undo(Long orderId, List<OrderItemResponse> orderItemResponses) {
        itemService.undo(orderId, orderItemResponses);
    }
}
