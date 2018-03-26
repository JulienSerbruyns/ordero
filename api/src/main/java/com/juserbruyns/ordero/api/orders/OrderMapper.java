package com.juserbruyns.ordero.api.orders;

import com.juserbruyns.ordero.domain.orders.Order;

import javax.inject.Named;

@Named
public class OrderMapper {
    public OrderDto toDto(Order order){
        return OrderDto.orderDto()
                .withId(order.getId())
                .withOrderedItems(order.getOrderedItems())
                .withTotalPrice(order.getTotalPrice());
    }

    public Order toDomain (OrderDto orderDto){
        return Order.OrderBuilder.order()
                .withId(orderDto.getId())
                .withOrderedItems(orderDto.getOrderedItems())
                .withTotalPrice(orderDto.getTotalPrice())
                .build();
    }
}
