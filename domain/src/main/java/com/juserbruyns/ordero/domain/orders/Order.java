package com.juserbruyns.ordero.domain.orders;

import com.juserbruyns.ordero.domain.items.ItemGroup;

import java.util.List;

public class Order {
    private int id;
    private List<ItemGroup> orderedItems;
    private Double totalPrice;

    public Order() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<ItemGroup> getOrderedItems() {
        return orderedItems;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setOrderedItems(List<ItemGroup> orderedItems) {
        this.orderedItems = orderedItems;
    }

    public List<ItemGroup> getOrderedItemGroups() {
        return orderedItems;
    }

}
