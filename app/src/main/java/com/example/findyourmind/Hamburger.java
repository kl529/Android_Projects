package com.example.findyourmind;

public class Hamburger {

    private String name;
    private String info;
    private int price;
    private String image;

    public Hamburger(String name, String info, int price, String image) {
        this.name = name;
        this.info = info;
        this.price = price;
        this.image = image;
    }

    public Hamburger() {
        this.name = "";
        this.info = "";
        this.price = 0;
        this.image = "";
    }

    //----------

    public void setName(String nm){
        this.name = nm;
    }

    public String getName(){
        return this.name;
    }

    //----------


    public void setInfo(String ifo){
        this.info = ifo;
    }

    public String getInfo(){
        return this.info;
    }

    //----------

    public void setPrice(Integer pri){
        this.price = pri;
    }

    public Integer getPrice(){
        return this.price;
    }

    //----------

    public void setImage(String img){
        this.image = img;
    }

    public String getImage(){
        return this.image;
    }

    //----------
}
