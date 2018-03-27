package com.juserbruyns.ordero.domain.orders;

import com.juserbruyns.ordero.domain.items.Item;
import com.juserbruyns.ordero.domain.items.ItemGroup;
import com.juserbruyns.ordero.domain.items.ItemGroupRepository;
import com.juserbruyns.ordero.domain.items.ItemRepository;

import javax.inject.Named;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Named
public class OrderRepository {
    private Map<Integer, Order> orders;
    private ItemGroupRepository itemGroupRepository;
    private static int orderIndex = 0;

    public OrderRepository() {
        this.orders = new HashMap<>();
    }

    public Order storeOrder(Order order) {
        order.setId(++orderIndex);
        orders.put(order.getId(), order);
        return order;
    }

    public Order addItemToOrder(int orderId, Item item, int amount) {
        ItemGroup itemGroup = new ItemGroup();
        ArrayList<ItemGroup> updatedList = new ArrayList<>();
        itemGroup.setAmount(amount);
        itemGroup.setItem(item);
        itemGroupRepository.storeItemGroup(itemGroup);
        return updateOrder(orderId, Order.OrderBuilder.order().withId(orderId).withOrderedItems(orders.get(orderId).addOrderedItems(itemGroup)).build());
    }

    public Order updateOrder(int orderId, Order updatedOrder) {
        orders.put(orderId, updatedOrder);
        return updatedOrder;
    }

    public Map<Integer, Order> getOrders() {
        return orders;
    }

    public Order getOrder(int id) {
        return orders.get(id);
    }
}
