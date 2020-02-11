package com.hxr.deepspringlearn.purespringXml;

public class MyDao {

    private String price;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void dotest(){
        System.out.println("mydao test"+getPrice());
    }
}
