package com.dxy.artemis.controllers;


import com.dxy.artemis.dao.pojo.Product;
import com.dxy.artemis.service.ProductService;
import com.dxy.artemis.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping(value = "/index")
    public void index() {

    }

    @RequestMapping(value = "/list")
    public void list(ModelMap modelMap, String name) {
        DateUtil.format(new Date());
        List<Product> list = productService.findProducts();
        System.out.println(list.size());
        modelMap.addAttribute("products", list);
    }


}
