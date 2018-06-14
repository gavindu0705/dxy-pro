package com.dxy.artemis.service;



import com.dxy.artemis.dao.pojo.Product;
import java.util.List;

public interface ProductService {

    List<Product> findProducts();
}
