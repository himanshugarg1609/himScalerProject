package com.him.productservicesp.services;

import com.him.productservicesp.dtos.ProductDTO;
import org.springframework.web.bind.annotation.*;

public interface ProductService {
    String getAllProducts();
    String getSingleProduct(Long productId);
    String addNewProduct(ProductDTO productdto);
    String updateProduct(Long productId);
    String deleteProduct(Long productId);
}
