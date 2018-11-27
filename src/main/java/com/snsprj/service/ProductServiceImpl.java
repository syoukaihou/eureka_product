package com.snsprj.service;

import com.snsprj.common.ServerResponse;
import com.snsprj.mapper.ProductInfoMapper;
import com.snsprj.model.ProductInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoMapper productInfoMapper;

    @Override
    public ServerResponse insert(ProductInfo productInfo) {

        productInfoMapper.insert(productInfo);

        return ServerResponse.createBySuccess();
    }
}
