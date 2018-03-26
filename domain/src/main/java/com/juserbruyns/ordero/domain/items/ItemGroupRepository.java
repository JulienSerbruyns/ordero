package com.juserbruyns.ordero.domain.items;

import javax.inject.Named;
import java.util.HashMap;
import java.util.Map;

@Named
public class ItemGroupRepository {
    private Map<Integer, ItemGroup> itemGroups;
    private static int itemGroupIndex = 0;

    public ItemGroupRepository() {
        this.itemGroups = new HashMap<>();
    }

    public ItemGroup storeItemGroup(ItemGroup itemGroup) {
        itemGroup.setId(itemGroupIndex++);
        itemGroups.put(itemGroup.getId(), itemGroup);
        return itemGroup;
    }

//    public ItemGroup updateItemGroup(int itemGroupId, ItemGroup updatedItemGroup) {
//        itemGroups.put(itemGroupId, updatedItemGroup);
//        return updatedItemGroup;
//    }

    public Map<Integer, ItemGroup> getItemGroups() {
        return itemGroups;
    }

    public ItemGroup getItemGroup(int id){
        return itemGroups.get(id);
    }
}
