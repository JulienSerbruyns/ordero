package com.juserbruyns.ordero.api.item;

public class ItemDto {
    private String itemName;
    private String description;
    private Double price;
    private Integer amountOnStock;

    public static ItemDto itemDto(){ return new ItemDto();}

    public ItemDto withItemName(String itemName){
        this.itemName = itemName;
        return this;
    }
    public ItemDto withDescription (String description){
        this.description = description;
        return this;
    }
    public ItemDto withPrice(Double price){
        this.price = price;
        return this;
    }
    public ItemDto withAmountOnStock(Integer amountOnStock){
        this.amountOnStock = amountOnStock;
        return this;
    }

    public String getItemName() {
        return itemName;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getAmountOnStock() {
        return amountOnStock;
    }
}
