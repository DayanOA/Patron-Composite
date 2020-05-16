package com.composite.products;

/**
 * SimpleProduct representa la forma más básica de un producto y no puede estar
 * compuesta por otros productos
 */
public class SimpleProduct extends AbstractProduct {

    protected String brand;

    public SimpleProduct(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
