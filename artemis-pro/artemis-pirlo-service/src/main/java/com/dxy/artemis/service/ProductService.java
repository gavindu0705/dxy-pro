package com.dxy.artemis.service;


import com.dxy.artemis.pojo.Product;

import java.util.Arrays;
import java.util.List;

public class ProductService {
    public List<Product> findProducts() {
        Product p1 = new Product();
        p1.setName("111111");
        Product p2 = new Product();
        p2.setName("22222");
        Product p3 = new Product();
        p3.setName("33333");
        List<Product> list = Arrays.asList(p1, p2, p3);
        return list;
    }
}
