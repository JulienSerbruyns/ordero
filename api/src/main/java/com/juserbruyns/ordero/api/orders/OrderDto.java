package com.juserbruyns.ordero.api.orders;

import com.juserbruyns.ordero.domain.items.ItemGroup;

import java.util.List;

public class OrderDto {
    private int id;
    private List<ItemGroup> orderedItems;
    private double totalPrice;

    public static OrderDto orderDto() {
        return new OrderDto();
    }

    public OrderDto withId(int id) {
        this.id = id;
        return this;
    }

    public OrderDto withOrderedItems(List<ItemGroup> orderedItems){
        this.orderedItems= orderedItems;
        return this;
    }

    public OrderDto withTotalPrice(double totalPrice){
        this.totalPrice = totalPrice;
        return this;
    }

    public int getId() {
        return id;
    }

    public List<ItemGroup> getOrderedItems() {
        return orderedItems;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
