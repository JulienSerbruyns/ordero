package com.juserbruyns.ordero.domain.items;

import java.time.LocalDate;

public class ItemGroup {
    private int id;
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

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Double getTotalPriceOfItem() {
        return totalPriceOfItem;
    }

    public void setTotalPriceOfItem(Double totalPriceOfItem) {
        this.totalPriceOfItem = item.getPrice()*amount;
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

    public void setShippingDate() {
        this.shippingDate = calculateShippingDate();
    }

    public LocalDate calculateShippingDate() {
        LocalDate shipDate = LocalDate.of(2018,01,01);
        if (item.getAmountOnStock() <= amount) {
            shipDate = LocalDate.now().plusDays(1);
        } else {
            shipDate = LocalDate.now().plusWeeks(1);
        }
        return shipDate;
    }

    public static class ItemGroupBuilder {
        private int id;
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
            itemGroup.setId(id);
            itemGroup.setItem(item);
            itemGroup.setAmount(amount);
            itemGroup.setTotalPriceOfItem(totalPriceOfItem);
            itemGroup.setShippingDate();
            return itemGroup;
        }

        public Item getItem() {
            return item;
        }

        public ItemGroupBuilder withAmount(int amount) {
            this.amount=amount;
            return this;
        }

        public ItemGroupBuilder withShippingDate(LocalDate shippingDate) {
            this.shippingDate=shippingDate;
            return this;
        }

        public ItemGroupBuilder withTotalPriceOfItem(Double totalPriceOfItem) {
            this.totalPriceOfItem = totalPriceOfItem;
            return this;
        }

        public ItemGroupBuilder withItem(Item item) {
            this.item = item;
            return this;
        }


    }
}
