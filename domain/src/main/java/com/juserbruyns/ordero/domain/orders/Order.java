package com.juserbruyns.ordero.domain.orders;

import com.juserbruyns.ordero.domain.ItemGroup;

import java.util.List;

public class Order {

    private List<ItemGroup> orderedItems;
    private Double totalPrice;

    public Order() {
    }

    public void setOrderedItems(List<ItemGroup> orderedItems) {
        this.orderedItems = orderedItems;
    }

    public List<ItemGroup> getOrderedItemGroups() {
        return orderedItems;
    }

}
