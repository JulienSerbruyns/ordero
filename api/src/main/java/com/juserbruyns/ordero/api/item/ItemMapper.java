package com.juserbruyns.ordero.api.item;

import com.juserbruyns.ordero.domain.items.Item;

import javax.inject.Named;

@Named
public class ItemMapper {

    public ItemDto toDto (Item item){
        return ItemDto.itemDto()
                .withItemName(item.getItemName())
                .withDescription(item.getDescription())
                .withPrice(item.getPrice())
                .withAmountOnStock(item.getAmountOnStock());
    }

    public Item toDomain (ItemDto itemDto) {
        return Item.ItemBuilder.item()
                .withItemName(itemDto.getItemName())
                .withDescription(itemDto.getDescription())
                .withPrice(itemDto.getPrice())
                .withAmountOnStock(itemDto.getAmountOnStock())
                .build();
    }

}
