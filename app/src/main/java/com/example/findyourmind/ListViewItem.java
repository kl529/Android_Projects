package com.example.findyourmind;

public class ListViewItem {
    private String itemName;
    private String itemDescription;

    public ListViewItem(String name, String description) {
        this.itemName = name;
        this.itemDescription = description;
    }
    public String getItemName() {
        return this.itemName;
    }
    public String getItemDescription() {
        return itemDescription;
    }

}