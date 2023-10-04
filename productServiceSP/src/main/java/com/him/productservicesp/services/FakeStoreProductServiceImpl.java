package com.him.productservicesp.services;

import com.him.productservicesp.dtos.ProductDTO;
import org.springframework.stereotype.Service;

@Service
public class FakeStoreProductServiceImpl implements ProductService{

    @Override
    public String getAllProducts() {
        return null;
    }

    @Override
    public String getSingleProduct(Long productId) {
        return null;
    }

    @Override
    public String addNewProduct(ProductDTO productdto) {
        return null;
    }

    @Override
    public String updateProduct(Long productId) {
        return null;
    }

    @Override
    public String deleteProduct(Long productId) {
        return null;
    }
}
