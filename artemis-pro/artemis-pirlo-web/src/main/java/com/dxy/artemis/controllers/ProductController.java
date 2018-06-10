package com.dxy.artemis.controllers;


import com.dxy.artemis.model.ProductModel;
import com.dxy.artemis.pojo.Product;
import com.dxy.artemis.service.ProductService;
import org.springframework.core.Conventions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import sun.reflect.misc.MethodUtil;

import java.lang.reflect.Method;
import java.util.Date;

@Controller
@RequestMapping("/product")
public class ProductController {
    ProductService productService = new ProductService();

    @RequestMapping(value = "/list")
    public String index(Model model, ProductModel productModel) {
        model.addAttribute("name", "xiaoyu");
        model.addAttribute(productService.findProducts());
        System.out.println(model.asMap().toString());
        Method method = null;
        try {
            method = MethodUtil.getMethod(ProductService.class, "findProducts", null);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        System.out.println(productModel.getViewName());
        String s = Conventions.getVariableNameForReturnType(method);
        return "/product/list";
    }


    @ModelAttribute
    public Product hello(){
        Product product = new Product();
        product.setName("pppppppppp");
        product.setcDate(new Date());
        return product;
    }

    @ModelAttribute
    public ModelAndView modeview() {
        System.out.println("==================");
        return new ModelAndView("/product/dddd");
    }

}
