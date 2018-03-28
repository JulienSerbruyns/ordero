package com.juserbruyns.ordero.domain.orders;

import com.juserbruyns.ordero.domain.actors.customer.Customer;

import java.util.List;
import java.util.stream.Collectors;

public class OrderReport {
    private int id;
    private Customer customer;
    private List<Order> orderList;
    private OrderRepository orderRepository;
    private double totalPriceOfAllOrders;

    public OrderReport() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTotalPriceOfAllOrders(double totalPriceOfAllOrders) {
        this.totalPriceOfAllOrders = totalPriceOfAllOrders;
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
        this.orderList = orderRepository.getOrders().values().stream().filter(order -> order.getCustomer().getId()==customer.getId()).collect(Collectors.toList());
    }

    public double getTotalPriceOfAllOrders() {
        return totalPriceOfAllOrders;
    }

    public void setTotalPriceOfAllOrders() {

        this.totalPriceOfAllOrders = totalPriceOfAllOrders;
    }
}
