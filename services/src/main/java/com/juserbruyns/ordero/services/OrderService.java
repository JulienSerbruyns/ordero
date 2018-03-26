package com.juserbruyns.ordero.services;

import com.juserbruyns.ordero.domain.items.Item;
import com.juserbruyns.ordero.domain.orders.Order;
import com.juserbruyns.ordero.domain.orders.OrderRepository;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class OrderService {
    private OrderRepository orderRepository;

    @Inject
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order addOrder(Order order) {
        return orderRepository.storeOrder(order);
    }

    public Order addItemToOrder(int orderId, Item item, int amount){
        return orderRepository.addItemToOrder(orderId,item,amount);
    }

//    public Order updateOrder(int id, Order updatedOrder) {
//        if (orderRepository.getOrders().containsKey(id)) {
//            orderRepository.updateOrder(id, updatedOrder);
//        } else{ throw new IllegalArgumentException("Order to Update not recognised");}
//        return updatedOrder;
//    }
}
