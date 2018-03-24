package com.juserbruyns.ordero.domain.items;

import java.time.LocalDate;

public class ItemGroup {
    private Item item;
    private Integer amount;
    private Double totalPriceOfItem;
    private LocalDate shippingDate;

    public ItemGroup() {
    }

    public ItemGroup(Item item, Integer amount) {
        this.item = item;
        this.amount = amount;

    }

    public Double getTotalPriceOfItem() {
        return totalPriceOfItem;
    }

    public void setTotalPriceOfItem(Double totalPriceOfItem) {
        this.totalPriceOfItem = totalPriceOfItem;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public LocalDate getShippingDate() {
        return shippingDate;
    }

    public void setShippingDate(LocalDate shippingDate) {
        this.shippingDate = shippingDate;
    }

    public static class ItemGroupBuilder {
        private Item item;
        private Integer amount;
        private Double totalPriceOfItem;
        private LocalDate shippingDate;

        public ItemGroupBuilder() {
        }

        public static ItemGroupBuilder itemGroup() {
            return new ItemGroupBuilder();
        }

        public ItemGroup build() {
            ItemGroup itemGroup = new ItemGroup();
            itemGroup.setItem(item);
            itemGroup.setAmount(amount);
            itemGroup.setTotalPriceOfItem(totalPriceOfItem);
            itemGroup.setShippingDate(shippingDate);
            return itemGroup;
        }

        public Item getItem() {
            return item;
        }

        public Integer getAmount() {
            return amount;
        }

        public LocalDate getShippingDate() {
            return shippingDate;
        }
    }
}
