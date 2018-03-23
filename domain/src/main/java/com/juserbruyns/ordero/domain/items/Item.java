package com.juserbruyns.ordero.domain.items;

public class Item {
    private String itemName;
    private String description;
    private Double price;
    private Integer amountOnStock;

    public Item() {
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getAmountOnStock() {
        return amountOnStock;
    }

    public void setAmountOnStock(Integer amountOnStock) {
        this.amountOnStock = amountOnStock;
    }

    public static class ItemBuilder{
        private String itemName;
        private String description;
        private Double price;
        private Integer amountOnStock;

        public static ItemBuilder item(){return new ItemBuilder();}

        public Item build(){
            Item item = new Item();
            item.setItemName(itemName);
            item.setDescription(description);
            item.setPrice(price);
            item.setAmountOnStock(amountOnStock);
            return item;
        }

        public ItemBuilder withItemName (String itemName){
            this.itemName = itemName;
            return this;
        }
        public ItemBuilder withDescription (String description){
            this.description = description;
            return this;
        }
        public ItemBuilder withPrice (Double price){
            this.price = price;
            return this;
        }
        public ItemBuilder withAmountOnStock (Integer amountOnStock){
            this.amountOnStock = amountOnStock;
            return this;
        }
    }
}


