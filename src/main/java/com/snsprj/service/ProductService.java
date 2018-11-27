package com.snsprj.service;

import com.snsprj.common.ServerResponse;
import com.snsprj.model.ProductInfo;

public interface ProductService {

    /**
     * 创建商品
     * @param productInfo productInfo
     * @return code
     */
    ServerResponse insert(ProductInfo productInfo);
}
