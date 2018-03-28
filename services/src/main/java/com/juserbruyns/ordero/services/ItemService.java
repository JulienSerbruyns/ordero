package com.juserbruyns.ordero.services;

import com.juserbruyns.ordero.domain.items.Item;
import com.juserbruyns.ordero.domain.items.ItemRepository;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
public class ItemService {

    private final ItemRepository itemRepository;

    @Inject
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public Item addItem(Item item) {
        return itemRepository.storeItem(item);
    }

    public Item updateItem(int id, Item updatedItem) {
        if (itemRepository.getItems().containsKey(id)) {
            itemRepository.updateItem(id, updatedItem);
        } else{ throw new IllegalArgumentException("Item to Update not recognised");}
        return updatedItem;
    }

    public Item getItem(int id){
        return itemRepository.getItem(id);
    }

}
