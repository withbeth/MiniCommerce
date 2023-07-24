package io.mini.minicommerce.interfaces.item.dto;

import io.mini.minicommerce.domain.order.OrderItem;
import lombok.Builder;
import lombok.Getter;

@Getter
public class OrderItemResponse {

    private OrderItem.OrderStatus orderStatus;
    private Long shopId;
    private Long itemId;
    private Long quantity;

    @Builder
    private OrderItemResponse(OrderItem.OrderStatus orderStatus, Long shopId, Long itemId, Long quantity) {
        this.orderStatus = orderStatus;
        this.shopId = shopId;
        this.itemId = itemId;
        this.quantity = quantity;
    }

    public static OrderItemResponse fromOrderItemRequest(OrderItem.OrderStatus orderStatus, OrderItemRequest request) {
        return OrderItemResponse.builder()
//                .orderStatus(orderStatus)
//                .shopId(request.getShopId())
//                .itemId(request.getItemId())
//                .quantity(request.getQuantity())
                .build();
    }

    public void setOrderStatus(OrderItem.OrderStatus orderStatus) {

//        this.orderStatus = orderStatus;
    }
}
