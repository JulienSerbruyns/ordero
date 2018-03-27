package com.juserbruyns.ordero.domain.items;

import javax.inject.Named;
import java.util.HashMap;
import java.util.Map;

@Named
public class ItemRepository {
    private Map<Integer, Item> items;
    private static int itemIndex = 0;

    public ItemRepository() {
        this.items = new HashMap<>();
    }

    public Item storeItem(Item item) {
        item.setId(itemIndex++);
        items.put(item.getId(), item);
        return items.get(item.getId());
    }

    public Item updateItem(int itemId, Item updatedItem) {
            items.put(itemId, updatedItem);
            return updatedItem;
    }

    public Map<Integer, Item> getItems() {
        return items;
    }

    public Item getItem(int id){
        return items.get(id);
    }
}
