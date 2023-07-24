package io.mini.minicommerce.interfaces.order.dto;

import io.mini.minicommerce.domain.order.Order;
import io.mini.minicommerce.domain.order.OrderItem;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class OrderResponse {

    private Long orderId;
    private OrderItem.OrderStatus orderStatus;
    private List<OrderItemResponse> orderItemResponses;
    private Long totalPrice;

    private Long customerAccountId;
    private LocalDateTime createdAt;


    private OrderResponse(Order order, List<OrderItemResponse> orderItemResponses) {
        this.orderId = order.getId();
        this.orderStatus = order.getOrderStatus();
        this.orderItemResponses = orderItemResponses;
        this.totalPrice = getTotalPrice(orderItemResponses);
        this.customerAccountId = order.getCustomerAccountId();
        this.createdAt = order.getCreatedAt();
    }

    public static OrderResponse fromOrderEntity(Order order) {
        List<OrderItemResponse> orderItemResponses = order.getOrderItems().parallelStream()
                .map(OrderItemResponse::new)
                .collect(Collectors.toList());

        return new OrderResponse(order, orderItemResponses);
    }

    private Long getTotalPrice(List<OrderItemResponse> orderItemResponses) {
        assert (!orderItemResponses.isEmpty());
        return orderItemResponses.stream()
                .map(OrderItemResponse::getPrice)
                .reduce(Long::sum).get();
    }
}
