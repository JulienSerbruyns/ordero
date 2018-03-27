package com.juserbruyns.ordero.domain.orders;

import com.juserbruyns.ordero.domain.actors.customer.Customer;

import java.util.List;

public class OrderReport {
    private int id;
    private Customer customer;
    private List<Order> orderList;
    private OrderRepository orderRepository;
    private double totalPriceOfAllOrders;

    public OrderReport() {
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList() {
        orderRepository.getOrders().values().stream().filter(order -> order.getCustomer().getId()==customer.getId());
        this.orderList = orderList;
    }

    public double getTotalPriceOfAllOrders() {
        return totalPriceOfAllOrders;
    }

    public void setTotalPriceOfAllOrders(double totalPriceOfAllOrders) {
        this.totalPriceOfAllOrders = totalPriceOfAllOrders;
    }
}
