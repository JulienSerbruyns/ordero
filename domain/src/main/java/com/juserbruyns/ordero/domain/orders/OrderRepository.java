package com.juserbruyns.ordero.domain.orders;

import javax.inject.Named;
import java.util.HashMap;
import java.util.Map;

@Named
public class OrderRepository {
    private Map<Integer, Order> orders;
    private static int orderIndex = 0;

    public OrderRepository() {
        this.orders = new HashMap<>();
    }

    public Order storeOrder(Order order) {
        order.setId(orderIndex++);
        orders.put(order.getId(), order);
        return order;
    }

    public Order updateOrder(int orderId, Order updatedOrder) {
        orders.put(orderId, updatedOrder);
        return updatedOrder;
    }

    public Map<Integer, Order> getOrders() {
        return orders;
    }

    public Order getOrder(int id){
        return orders.get(id);
    }
}
