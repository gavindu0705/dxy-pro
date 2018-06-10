package com.dxy.artemis.model;

public class ProductModel extends BaseModel {
    private String name;
    private String description;


    public ProductModel create() {
        Object o = this.getClass().getEnclosingMethod();
        System.out.println(o);

        return null;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
