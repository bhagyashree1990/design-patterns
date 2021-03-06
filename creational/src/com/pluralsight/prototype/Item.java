package com.pluralsight.prototype;

public abstract class Item implements Cloneable{
    private String title;
    private double price;
    private String url;

    @Override
    protected Item clone() throws CloneNotSupportedException {
        return (Item) super.clone();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
