package com.juserbruyns.ordero.domain.items;

import javax.inject.Named;
import java.util.HashMap;
import java.util.Map;

@Named
public class ItemRepository {
    private Map<String, Item> items;

    public ItemRepository(){
        this.items = new HashMap<>();
    }

    public Item storeItem(Item item){
        items.put(item.getItemName(),item);
        return item;
    }

    public Item updateItem(String itemName, Item updatedItem){
        items.put(itemName,updatedItem);
        return updatedItem;
    }
}
