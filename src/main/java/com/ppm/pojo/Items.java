package com.ppm.pojo;

import java.math.BigDecimal;

public class Items {
    private Integer id;

    private String name;

    private BigDecimal price;

    private String desc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    public String toString() {
        return "{ id: " + id+ "; name: " + name + "; price: " + price + "}";
    }
}