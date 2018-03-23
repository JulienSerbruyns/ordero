package com.juserbruyns.ordero.services;

import com.juserbruyns.ordero.domain.items.Item;
import com.juserbruyns.ordero.domain.items.ItemRepository;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class ItemService {

    private final ItemRepository itemRepository;

    @Inject
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public Item addItem(Item item){
        return itemRepository.storeItem(item);
    }

    public Item updateItem (String itemName, Item updatedItem){
        return itemRepository.updateItem(itemName, updatedItem);
    }


}
