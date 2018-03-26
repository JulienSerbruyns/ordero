package com.juserbruyns.ordero.domain.orders;

import com.juserbruyns.ordero.domain.items.ItemGroup;

import java.util.Collections;
import java.util.List;

public class Order {
    private int id;
    private List<ItemGroup> orderedItems;
    private double totalPrice;

    public Order() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<ItemGroup> getOrderedItems() {
        return Collections.unmodifiableList(orderedItems);
    }

    public void setOrderedItems(List<ItemGroup> orderedItems) {
        this.orderedItems = orderedItems;
    }

    public List<ItemGroup> addOrderedItems(ItemGroup itemGroup) {
        orderedItems.add(itemGroup);
        return this.orderedItems = orderedItems;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = orderedItems.stream().mapToDouble(itemGroup -> itemGroup.getTotalPriceOfItem()).sum();
    }

    public List<ItemGroup> getOrderedItemGroups() {
        return orderedItems;
    }

    public static class OrderBuilder {
        private int id;
        private List<ItemGroup> orderedItems;
        private double totalPrice;

        public static OrderBuilder order() {
            return new OrderBuilder();
        }

        public Order build() {
            Order order = new Order();
            order.setId(id);
            order.setOrderedItems(orderedItems);
            order.setTotalPrice(totalPrice);
            return order;
        }

        public OrderBuilder withId(int id) {
            this.id = id;
            return this;
        }

        public OrderBuilder withOrderedItems(List<ItemGroup> orderedItems) {
            this.orderedItems = orderedItems;
            return this;
        }

        public OrderBuilder withTotalPrice(double totalPrice) {
            this.totalPrice = this.totalPrice;
            return this;
        }
    }
}
