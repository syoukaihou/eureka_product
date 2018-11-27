package com.snsprj.controller;

import com.snsprj.common.ServerResponse;
import com.snsprj.model.ProductInfo;
import com.snsprj.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;


    /**
     * 创建商品
     * @param productInfo productInfo
     * @return code
     */
    @RequestMapping(value = "/product/create",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse createProduct(@RequestBody ProductInfo productInfo){

        return productService.insert(productInfo);
    }
}
