package com.juserbruyns.ordero.domain.items;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemRepositoryTest {

    @Test
    public void storeItem() {
        //GIVEN
        ItemRepository itemRepository = new ItemRepository();
        Item expectedItem = Item.ItemBuilder.item().withAmountOnStock(3).build();
        Item expectedItem2 = Item.ItemBuilder.item().withPrice(15.95).build();

        //WHEN
        Item actualItem = itemRepository.storeItem(expectedItem);
        Item actualItem2 = itemRepository.storeItem(expectedItem2);

        //THEN
        Assertions.assertThat(expectedItem).isEqualTo(actualItem);
        Assertions.assertThat(expectedItem2).isEqualTo(actualItem2);

    }

    @Test
    public void updateItem() {
        ItemRepository itemRepository = new ItemRepository();
        Item itemToUpdate = Item.ItemBuilder.item().withAmountOnStock(3).build();

        Item updatedItem = Item.ItemBuilder.item().withAmountOnStock(5).withPrice(15.95).build();
    }
}